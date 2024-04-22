package com.citas.java.entidades;

import java.time.LocalDateTime;
import com.citas.java.enumeraciones.EstadoCita;

//implements: unicamente para "heredar" comportamnientos
//pero solo con interfaces
public class CitasMedico extends Cita implements IAgendamiento{

    @Override
    public String toString() {
        return "Citas Medico: " + "fecha: " + fecha + ", El paciente es: " + paciente + "," + medico;
    }

    private String motivo;
    private Medico medico;
    private EstadoCita estadoCita;

    public CitasMedico(LocalDateTime fecha, 
                        Paciente paciente, 
                        String motivo, 
                        Medico medico
                        ) {
        super(fecha, paciente);
        this.motivo = motivo;
        this.medico = medico;
        this.estadoCita = estadoCita.AGENDADA;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public EstadoCita getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }

    
    //comportamientos heredados

    @Override
    public void agendarCita(LocalDateTime fechaCita) {
        this.setFecha(fechaCita);
        this.setEstadoCita(EstadoCita.AGENDADA);
    }

    @Override
    public void cancelarCita() {
        this.estadoCita = EstadoCita.CANCELADA;
    System.out.println("Cita cancelada por el medico: " + medico.getNombre() +" "+ medico.getApellido());
    }

    @Override
    public void reagentarCita(LocalDateTime fechaCita) {
        this.setFecha(fechaCita);
    }




}