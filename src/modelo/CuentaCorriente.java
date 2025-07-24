package modelo;

import modelo.modelosAbstractos.CuentaBancaria;

import java.time.LocalDate;

public class CuentaCorriente extends CuentaBancaria {
    private final double limiteSobregiro;

    private boolean permiteChequera;
    private int cantidaddeCuequesEmitidos;
    private boolean permiteTransferencias;

    private final static double comisionMensual = 0.8;

    public CuentaCorriente(String numeroDeCuenta, double saldo, Usuario usuarioAsignado,
                           String pinDeLaCuenta, LocalDate fechaDeApertura, double limiteSobregiro,
                           boolean permiteChequera, int cantidaddeCuequesEmitidos, boolean permiteTransferencias) {
        super(numeroDeCuenta, saldo, usuarioAsignado, pinDeLaCuenta, fechaDeApertura);
        this.limiteSobregiro = limiteSobregiro;
        this.permiteChequera = permiteChequera;
        this.cantidaddeCuequesEmitidos = cantidaddeCuequesEmitidos;
        this.permiteTransferencias = permiteTransferencias;
    }

    public double getLimiteOsbregiro() {
        return limiteSobregiro;
    }

    public boolean isPermiteChequera() {
        return permiteChequera;
    }

    public void setPermiteChequera(boolean permiteChequera) {
        this.permiteChequera = permiteChequera;
    }

    public int getCantidaddeCuequesEmitidos() {
        return cantidaddeCuequesEmitidos;
    }

    public void setCantidaddeCuequesEmitidos(int cantidaddeCuequesEmitidos) {
        this.cantidaddeCuequesEmitidos = cantidaddeCuequesEmitidos;
    }

    public boolean isPermiteTransferencias() {
        return permiteTransferencias;
    }

    public void setPermiteTransferencias(boolean permiteTransferencias) {
        this.permiteTransferencias = permiteTransferencias;
    }
}
