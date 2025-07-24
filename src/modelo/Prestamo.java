package modelo;

import java.time.LocalDate;

import utilidades.EstadoDelPrestamo;

import interfaces.Informacion;

public class Prestamo implements Informacion {
    private final String identificadorDePrestamo;
    private final Usuario usuarioSolicitante;
    private final double monto;
    private final double tasaDeInteres;
    private final int cuotas;

    private LocalDate fechaDeSolicitud;
    private EstadoDelPrestamo estadoDelPrestamo;

    private int cuotasPagadas;

    public Prestamo(String identificadorDePrestamo, Usuario usuarioSolicitante, double monto, double tasaDeInteres,
                    int cuotas, LocalDate fechaDeSolicitud, EstadoDelPrestamo estadoDelPrestamo) {
        this.identificadorDePrestamo = identificadorDePrestamo;
        this.usuarioSolicitante = usuarioSolicitante;
        this.monto = monto;
        this.tasaDeInteres = tasaDeInteres;
        this.cuotas = cuotas;
        this.fechaDeSolicitud = fechaDeSolicitud;
        this.estadoDelPrestamo = estadoDelPrestamo;
        this.cuotasPagadas = 0;
    }
    
    
    /*
    public static double calcularCuota(double capital, double tasaMensual, int numeroPagos) {
        double r = tasaMensual;
        return capital * (r * Math.pow(1 + r, numeroPagos)) / (Math.pow(1 + r, numeroPagos) - 1);
    }
     */

    public String getIdentificadorDePrestamo() {
        return identificadorDePrestamo;
    }

    public Usuario getUsuarioSolicitante() {
        return usuarioSolicitante;
    }

    public double getMonto() {
        return monto;
    }

    public double getTasaDeInteres() {
        return tasaDeInteres;
    }

    public int getCuotas() {
        return cuotas;
    }
    
    public int getCuotasPagadas() {
        return cuotasPagadas;
    }
    
    public void setCuotasPagadas(int cuotasPagadas) {
        this.cuotasPagadas = cuotasPagadas;
    }
    
    public EstadoDelPrestamo getEstadoDelPrestamo() {
        return estadoDelPrestamo;
    }

    public void setEstadoDelPrestamo(EstadoDelPrestamo estadoDelPrestamo) {
        this.estadoDelPrestamo = estadoDelPrestamo;
    }

    public LocalDate getFechaDeSolicitud() {
        return fechaDeSolicitud;
    }

    public void setFechaDeSolicitud(LocalDate fechaDeSolicitud) {
        this.fechaDeSolicitud = fechaDeSolicitud;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("+---------------------------------+")
        .append("+-------------Prestamo--------------+")
        .append("+---------------------------------+");
        sb.append("Identificador : ").append(this.getIdentificadorDePrestamo()).append("\n");
        sb.append("Monto : ").append(String.format("%.s", this.getMonto())).append("\n");
        sb.append("Tasa de Interes : ").append(String.format("%.s", this.getTasaDeInteres())).append("\n");
        sb.append("Cuotas : ").append(String.format("%.s", this.getCuotas())).append("\n");
        sb.append("Fecha de Solicitud : ").append(String.format("%.s", this.getFechaDeSolicitud())).append("\n");
        sb.append("Estado del Prestamo : ").append(String.format("%.s", this.getEstadoDelPrestamo())).append("\n");
        
        return sb.toString();
    }
    
        /*
        private final String identificadorDePrestamo;
        private final Usuario usuarioSolicitante;
        private final double monto;
        private final double tasaDeInteres;
        private final int cuotas;
        
        private LocalDate fechaDeSolicitud;
        private EstadoDelPrestamo estadoDelPrestamo;
        
        private int cuotasPagadas = 0;
         */
    
    @Override
    public String getInfoEnString() {
        return "ID del Prestamo : " + this.getIdentificadorDePrestamo() +
                " Usuario Solicitante : " + this.getUsuarioSolicitante().getCURP() +
                " Monto : " + String.valueOf(this.getMonto()) +
                " Tasa de Interes : " + String.valueOf(this.getTasaDeInteres()) +
                " Cuotas : " + String.valueOf(this.getCuotas()) +
                " Fecha de Solicitud : " + String.valueOf(this.getFechaDeSolicitud()) +
                " Estado del Prestamo : " + String.valueOf(this.getEstadoDelPrestamo()) +
                " Cuotas Pagadas : " + String.valueOf(this.getCuotasPagadas());
    }
}
