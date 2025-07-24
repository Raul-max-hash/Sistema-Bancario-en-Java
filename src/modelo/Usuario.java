package modelo;

import modelo.modelosAbstractos.Persona;

import java.time.LocalDate;

import interfaces.Informacion;

public class Usuario extends Persona implements Informacion {
    private final String CURP;
    private final String RFC;

    private String correoElectronico;
    private String contrasena;
    private String numeroDeTelefono;

    public Usuario(String nombresCompletos, String apellidosCompletos, LocalDate fechaDeNacimiento, String edad, double estatura, double peso, String CURP, String RFC, String correoElectronico, String contrasena, String numeroDeTelefono) {
        super(nombresCompletos, apellidosCompletos, fechaDeNacimiento, edad, estatura, peso);
        this.CURP = CURP;
        this.RFC = RFC;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.numeroDeTelefono = numeroDeTelefono;
    }
    
    

    public String getCURP() {
        return CURP;
    }

    public String getRFC() {
        return RFC;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }
    
    /*
    private final String CURP;
    private final String RFC;

    private String correoElectronico;
    private String contrasena;
    private String numeroDeTelefono;
     */
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("+----------------------------------------+\n")
        .append("+---------------Usuario--------------+\n")
        .append("+----------------------------------------+\n");
        sb.append("Nombre : ").append(super.getNombresCompletos()).append("\n");
        sb.append("Apellidos : ").append(super.getApellidosCompletos()).append("\n");
        sb.append("Edad : ").append(String.format("%.d", super.getEdad())).append("\n");
        sb.append("CURP : ").append(this.getCURP()).append("\n");
        sb.append("Correo Electronico : ").append(this.getCorreoElectronico()).append("\n");
        sb.append("Numero de telefono : ").append(this.getNumeroDeTelefono()).append("\n");
        
        return sb.toString();
    }
    
    @Override
    public String getInfoEnString() {
        return "Nombre : " + super.getNombresCompletos() + "Apellidos : " + super.getApellidosCompletos() +
                " Edad : " + super.getEdad() + " Fecha de Nacimiento : " + String.format("%.s", super.getFechaDeNacimiento()) +
                " Estatura : " + super.getEstatura() + " Peso : " + super.getPeso() +
                " CURP : " + this.getCURP() + " RFC : " + this.getRFC() + " Correo : " + this.getCorreoElectronico() +
                " Password : " + this.getContrasena() + " Numero de Telefono : " + this.getNumeroDeTelefono();
    }
    
    public Object[] getInfo() {
        return new Object[] {
            super.getNombresCompletos(), " ",
            super.getApellidosCompletos(), " ",
            super.getEdad(), " ",
            super.getEstatura(), " ",
            super.getPeso(), " ",
            this.getCURP(), " ",
            this.getRFC(), " ",
            this.getCorreoElectronico(), " ",
            this.getNumeroDeTelefono(), " ",
        };
    }
    
    /*
    @Override
    public String toString() {
        return String.format(
            "+--------------------+\n" +
            "| Cuenta Bancaria    |\n" +
            "+--------------------+\n" +
            "| ID      | %04d\n" +
            "| Saldo   | $%.2f\n" +
            "| Usuario | %s\n" +
            "+--------------------+",
            id, saldo, usuario.getNombre()
        );
    }
    
     */
}