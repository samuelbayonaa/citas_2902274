package com.citas.java.entidades;

import com.citas.java.enumeraciones.Especialidad;
import com.citas.java.enumeraciones.TipoDocumento;

//subclase
public class Medico extends Persona{
    //wrapper

    private Long registroMedico;
    private Especialidad especialidad;

    public Medico(Integer id, String nombre, String apellido, TipoDocumento tipoDocumento, Long numeroDocumento,
            Long registroMedico, Especialidad especialidad) {
        //Se invoca el constructor de personas
        super(id, nombre, apellido, tipoDocumento, numeroDocumento);
        //inicializas atributos de clase
        //hija
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public Long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return " El medico es: "+ 
        "Nombre: " 
        + getNombre() + 
        ", Apellido: "
        + getApellido();
    }

  
    
    
    
}
