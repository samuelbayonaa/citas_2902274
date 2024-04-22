package com.citas.java.entidades;

import java.time.LocalDateTime;

public interface IAgendamiento {

    //definiciones de metodos
    //solo se ponen las firmas del metodo
    //porque la implementacion(instruciones)
    //corren por cuenta de las clases
     public void agendarCita(LocalDateTime fechaCita);
     public void cancelarCita();
     public void reagentarCita(LocalDateTime fechaCita);

}
