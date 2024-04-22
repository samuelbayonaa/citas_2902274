package com.citas.java.entidades;

import java.time.LocalDate;

import com.citas.java.enumeraciones.TipoDocumento;
import com.citas.java.enumeraciones.TipoSangre;

public  class Paciente extends Persona{

    private String correoElectronico;
    private Long numeroCelular;
    private LocalDate fechaNacimiento;
    private Double altura;
    private Double peso;
    private TipoSangre tipoSangre;
    private char factorRH;

    public Paciente(Integer id, String nombre, String apellido, TipoDocumento tipoDocumento, Long numeroDocumento,
            String correoElectronico, Long numeroCelular, LocalDate fechaNacimiento, Double altura, Double peso,
            TipoSangre tipoSangre, char factorRH) {
        super(id, nombre, apellido, tipoDocumento, numeroDocumento);
        this.correoElectronico = correoElectronico;
        this.numeroCelular = numeroCelular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }



    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Long getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(Long numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public char getFactorRH() {
        return factorRH;
    }

    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }

    @Override
    public String toString() {
        return " Nombre: " + getNombre() + ", Apellido: " + getApellido();
    }
    
    

    

}
