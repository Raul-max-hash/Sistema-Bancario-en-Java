package modelo;

import modelo.modelosAbstractos.CuentaBancaria;

import java.time.LocalDate;

public class CuentaDeAhorro extends CuentaBancaria {
    private final double tasaDeInteres;
    private final double saldoMinimoRequerido;

    private double penalizacionPorRetiro;
    private int retirosMensualesPermitidos;
    private int retirosMensualesPorMes;
    private boolean capitalizable;

    public CuentaDeAhorro(String numeroDeCuenta, double saldo, Usuario usuarioAsignado, String pinDeLaCuenta, LocalDate fechaDeApertura,
                          double tasaDeInteres, double saldoMinimoRequerido, double penalizacionPorRetiro, int retirosMensualesPermitidos, int retirosMensualesPorMes, boolean capitalizable) {
        super(numeroDeCuenta, saldo, usuarioAsignado, pinDeLaCuenta, fechaDeApertura);
        this.tasaDeInteres = tasaDeInteres;
        this.saldoMinimoRequerido = saldoMinimoRequerido;
        this.penalizacionPorRetiro = penalizacionPorRetiro;
        this.retirosMensualesPermitidos = retirosMensualesPermitidos;
        this.retirosMensualesPorMes = retirosMensualesPorMes;
        this.capitalizable = capitalizable;
    }

    public double getTasaDeInteres() {
        return tasaDeInteres;
    }

    public double getSaldoMinimoRequerido() {
        return saldoMinimoRequerido;
    }

    public double getPenalizacionPorRetiro() {
        return penalizacionPorRetiro;
    }

    public void setPenalizacionPorRetiro(double penalizacionPorRetiro) {
        this.penalizacionPorRetiro = penalizacionPorRetiro;
    }

    public int getRetirosMensualesPermitidos() {
        return retirosMensualesPermitidos;
    }

    public void setRetirosMensualesPermitidos(int retirosMensualesPermitidos) {
        this.retirosMensualesPermitidos = retirosMensualesPermitidos;
    }

    public int getRetirosMensualesPorMes() {
        return retirosMensualesPorMes;
    }

    public void setRetirosMensualesPorMes(int retirosMensualesPorMes) {
        this.retirosMensualesPorMes = retirosMensualesPorMes;
    }

    public boolean isCapitalizable() {
        return capitalizable;
    }

    public void setCapitalizable(boolean capitalizable) {
        this.capitalizable = capitalizable;
    }
}
