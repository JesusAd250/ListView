package com.upiiz.DM_JATC_07.model;

public class User {

    private Long id;
    private String nombre;
    private String lastMessage;
    private String fecha;
    private String hora;
    private int imagen;

    public User(Long id, String nombre, String lastMessage, String fecha, String hora, int imagen) {
        this.id = id;
        this.nombre = nombre;
        this.lastMessage = lastMessage;
        this.fecha = fecha;
        this.hora = hora;
        this.imagen = imagen;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getLastMessage() { return lastMessage; }
    public void setLastMessage(String lastMessage) { this.lastMessage = lastMessage; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public int getImagen() { return imagen; }
    public void setImagen(int imagen) { this.imagen = imagen; }
}