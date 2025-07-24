package modelo.modelosAbstractos;

import java.time.LocalDate;

public abstract class Persona {
    private final String nombresCompletos;
    private final String apellidosCompletos;
    private final LocalDate fechaDeNacimiento;

    private String edad;
    private double estatura;
    private double peso;

    public Persona(String nombresCompletos, String apellidosCompletos, LocalDate fechaDeNacimiento, String edad, double estatura, double peso) {
        this.nombresCompletos = nombresCompletos;
        this.apellidosCompletos = apellidosCompletos;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }
    
    
//    public abstract String getInfoENString();

    public String getNombresCompletos() {
        return nombresCompletos;
    }

    public String getApellidosCompletos() {
        return apellidosCompletos;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
