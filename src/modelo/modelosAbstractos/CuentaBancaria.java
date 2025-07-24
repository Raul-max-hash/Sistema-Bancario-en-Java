package modelo.modelosAbstractos;

import java.time.LocalDate;

import modelo.Usuario;
import utilidades.EstadoDeLaCuenta;

public abstract class CuentaBancaria {
    private String numeroDeCuenta;
    private double saldo;
    private Usuario usuarioAsignado;
    private String pinDeLaCuenta;
    private LocalDate fechaDeApertura;

    private static EstadoDeLaCuenta estado = EstadoDeLaCuenta.NULA;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String numeroDeCuenta, double saldo, Usuario usuarioAsignado, String pinDeLaCuenta, LocalDate fechaDeApertura) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.usuarioAsignado = usuarioAsignado;
        this.pinDeLaCuenta = pinDeLaCuenta;
        this.fechaDeApertura = fechaDeApertura;
    }

    public abstract boolean activar();
    public abstract boolean desactivar();
    public abstract void verSaldo();
    public abstract double depositar(double monto);
    public abstract boolean retirar(double monto);
    public abstract Boolean transferir(double monto, Usuario usuario);

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuarioAsignado() {
        return usuarioAsignado;
    }

    public void setUsuarioAsignado(Usuario usuarioAsignado) {
        this.usuarioAsignado = usuarioAsignado;
    }

    public String getPinDeLaCuenta() {
        return pinDeLaCuenta;
    }

    public void setPinDeLaCuenta(String pinDeLaCuenta) {
        this.pinDeLaCuenta = pinDeLaCuenta;
    }

    public LocalDate getFechaDeApertura() {
        return fechaDeApertura;
    }

    public void setFechaDeApertura(LocalDate fechaDeApertura) {
        this.fechaDeApertura = fechaDeApertura;
    }

    public static EstadoDeLaCuenta getEstado() {
        return estado;
    }

    public static void setEstado(EstadoDeLaCuenta estado) {
        CuentaBancaria.estado = estado;
    }
}
