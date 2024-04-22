package com.citas.java.entidades;

import com.citas.java.enumeraciones.TipoDocumento;

//superclase

public abstract class Persona {

    private Integer id;
    private String nombre;
    private String apellido;
    private TipoDocumento tipoDocumento;
    private Long numeroDocumento;

    public Persona(
    Integer id, 
    String nombre, 
    String apellido, 
    TipoDocumento tipoDocumento, 
    Long numeroDocumento
    ) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public Long getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    
}
