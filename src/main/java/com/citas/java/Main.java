package com.citas.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;


import com.citas.java.entidades.CitasEnfermero;
import com.citas.java.entidades.CitasMedico;
import com.citas.java.entidades.Enfermero;
import com.citas.java.entidades.Medico;
import com.citas.java.entidades.Paciente;
import com.citas.java.enumeraciones.Especialidad;
import com.citas.java.enumeraciones.ProcedimientoEnfermeria;
import com.citas.java.enumeraciones.TipoDocumento;
import com.citas.java.enumeraciones.TipoSangre;

public class Main {
    public static void main(String[] args) {
        
        //crear un medico
        //crear un objeto medico
        //crear una instancia de medico


        //MEDICOS

        Medico m = new Medico(
            1, 
            "Jose", 
            "Garzon",  
            TipoDocumento.CC, 
            10200895L, 
            10456788L, 
            Especialidad.ODONTOLOGIA

        );
        
        Medico m1 = new Medico(
            2,
            "Hector", 
            "Pacheco", 
            TipoDocumento.PPT,
            9816051L,
            20201234L, 
            Especialidad.PEDIATRIA
            );


        //PACIENTES


        Paciente p = new Paciente(
            1, 
            "Val", 
            "Gaona", 
            TipoDocumento.TI, 
            1014661232L, 
            "valgao@gmai.com", 
            3213802314L, 
            LocalDate.of(2007, 9, 27), 
            1.70, 
            60.1, 
            TipoSangre.A, 
            '-'
            );
        Paciente p1 = new Paciente(
            2, 
            "Sebastian", 
            "Gonzalo", 
            TipoDocumento.CM, 
            10203212L, 
            "sebgon@hotmail.com", 
            3144802314L, 
            LocalDate.of(1983, 12, 24), 
            1.80, 
            80.0, 
            TipoSangre.AB,
            '+' 
        ); 
        Paciente p2 = new Paciente(
            3, 
            "Julian", 
            "Toloza", 
            TipoDocumento.CC, 
            1014480223L, 
            "Julto@hotmail.com", 
            3153436030L, 
            LocalDate.of(1990, 11, 4), 
            1.60, 
            65.0, 
            TipoSangre.A,
            '+' 
        ); 
        Paciente p3 = new Paciente(
            4, 
            "Camilo", 
            "Moreno", 
            TipoDocumento.TI, 
            10102642270L, 
            "CamiMOr@hotmail.com", 
            3213024456L, 
            LocalDate.of(2008, 2, 14), 
            1.75, 
            80.0, 
            TipoSangre.B,
            '-' 
        ); 
        Paciente p4 = new Paciente(
            5, 
            "Laura", 
            "Mendoza", 
            TipoDocumento.PPT, 
            9435678L, 
            "laurisM@hotmail.com", 
            3202987181L, 
            LocalDate.of(2005, 1, 1), 
            1.50, 
            45.0, 
            TipoSangre.A,
            '+' 
        ); 
    
        //ENFERMEROS

        Enfermero e = new Enfermero(
            1, 
            "Maikol ", 
            "Jordan", 
            TipoDocumento.TI, 
            1014666132L
        );
        Enfermero e1 = new Enfermero(
            2, 
            "Julieta", 
            "Roldan", 
            TipoDocumento.CC, 
            79792567L
        );
        Enfermero e2 = new Enfermero(
            3, 
            "Sofia", 
            "Sanchez", 
            TipoDocumento.CC, 
            1014662332L
            );

         System.out.println(
                m
            );
            

        CitasMedico cm1 = new CitasMedico(
                LocalDateTime.of(2024, Month.JANUARY, 11, 10, 15, 30),
                p, 
                "gripa",
                m
            );

           // System.out.println("estado de la cita: "+ cm1.getEstadoCita());

           System.out.println(cm1);
           CitasMedico cm2 = new CitasMedico(
            LocalDateTime.of(2024, Month.JANUARY, 11, 10, 15, 30),
            p2, 
            "ESCOPOLAMINA",
            m1
        );

       // System.out.println("estado de la cita: "+ cm1.getEstadoCita());    
        // System.out.println("estado de la cita: "+ cm2.getEstadoCita());
        System.out.println(cm2);


        CitasEnfermero ce1 = new CitasEnfermero(
            LocalDateTime.of(2024, Month.JULY, 4, 12, 30, 10), 
            p3, 
            ProcedimientoEnfermeria.VACUNACION, 
            e1
        );

            System.out.println(ce1);

        CitasEnfermero ce2 = new CitasEnfermero(
            LocalDateTime.of(2024, Month.JULY, 20, 10, 30, 10), 
            p4, 
            ProcedimientoEnfermeria.LAVADO_DE_OIDOS, 
            e2
        );

            System.out.println(ce2);


        System.out.println("Estado de la cita al inicio: "+ cm1.getEstadoCita() );
        System.out.println(cm1);    
        cm1.cancelarCita();
        System.out.println("Estado de la cita despues de cancelar: "+ cm1.getEstadoCita());





    
 
    
   
        
        

    }
}