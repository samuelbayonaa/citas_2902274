package com.citas.java.entidades;

import com.citas.java.enumeraciones.TipoDocumento;

public class Enfermero extends Persona  {

    public Enfermero(Integer id, String nombre, String apellido, TipoDocumento tipoDocumento, Long numeroDocumento) {
        super(id, nombre, apellido, tipoDocumento, numeroDocumento);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "enfermero= "+getNombre()+ " "+ getApellido();
    }


    
  
  





    

}
