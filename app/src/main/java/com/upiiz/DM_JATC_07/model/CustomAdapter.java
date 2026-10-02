package com.upiiz.DM_JATC_07.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.upiiz.DM_JATC_07.R;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private Context ctx;
    private ArrayList<User> ListaUsuarios;

    public CustomAdapter(Context ctx, ArrayList<User> ListaUsuarios) {
        this.ctx = ctx;
        this.ListaUsuarios = ListaUsuarios;
    }

    @Override
    public int getCount() {
        return ListaUsuarios.size();
    }

    @Override
    public Object getItem(int position) {
        return ListaUsuarios.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Comprobar que hay una instancia de convertView
        if (convertView == null) {
            convertView = LayoutInflater.from(ctx).inflate(R.layout.custom_list_item, parent, false);
        }
        TextView tvUser = convertView.findViewById(R.id.tvUser);
        TextView tvLastMessage = convertView.findViewById(R.id.tvLastMessage);
        TextView tvLastConexion = convertView.findViewById(R.id.tvLastConexion);
        ImageView ivUser = convertView.findViewById(R.id.IvUser);

        User user = ListaUsuarios.get(position);
        tvUser.setText(user.getNombre());
        tvLastMessage.setText(user.getLastMessage());
        tvLastConexion.setText(user.getFecha() + " " + user.getHora());
        ivUser.setImageResource(user.getImagen());

        return convertView;
    }
}