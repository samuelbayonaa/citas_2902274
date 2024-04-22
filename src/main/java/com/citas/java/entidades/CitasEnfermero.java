package com.citas.java.entidades;

import java.time.LocalDateTime;
import com.citas.java.enumeraciones.ProcedimientoEnfermeria;

public class CitasEnfermero extends Cita implements IAgendamiento{

    

    @Override
    public String toString() {
        return "Citas Enfermero: " +  "fecha: " + fecha + ", procedimiento: " + procedimiento +" "+ enfermero
                + ", Paciente: " + getPaciente() + "]";
    }

    private ProcedimientoEnfermeria procedimiento;
    private Enfermero enfermero;

    public CitasEnfermero(LocalDateTime fecha, 
                            Paciente paciente, 
                            ProcedimientoEnfermeria procedimiento,
                            Enfermero enfermero
                            ) {
        super(fecha, paciente);
        this.procedimiento = procedimiento;
        this.enfermero = enfermero;
    }

    public ProcedimientoEnfermeria getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(ProcedimientoEnfermeria procedimiento) {
        this.procedimiento = procedimiento;
    }

    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    @Override
    public void agendarCita(LocalDateTime fechaCita) {
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }

    @Override
    public void cancelarCita() {
        System.out.println("Cita para procedimiento:"+ this.procedimiento + "cancelada");
    }

    @Override
    public void reagentarCita(LocalDateTime fechaCita) {
        throw new UnsupportedOperationException("Unimplemented method 'reagentarCita'");
    }



    

  
    
}

    
    

    
