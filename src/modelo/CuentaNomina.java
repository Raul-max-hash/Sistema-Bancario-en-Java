package modelo;

import java.time.LocalDate;

import modelo.modelosAbstractos.CuentaBancaria;
import utilidades.TipoDeCobro;

public class CuentaNomina extends CuentaBancaria {
    private final String nombreDeLaEmpresa;
    private final String rfcDeLaEmpresa;

    private boolean comisionExtra;
    private double salario;
    private LocalDate ultimaFechaDeposito;
    private TipoDeCobro tipoDeCobro;

    public CuentaNomina(String numeroDeCuenta, double saldo, Usuario usuarioAsignado, String pinDeLaCuenta,
                        LocalDate fechaDeApertura, String nombreDeLaEmpresa, String rfcDeLaEmpresa, boolean comisionExtra,
                        double salario, LocalDate ultimaFechaDeposito, TipoDeCobro tipoDeCobro) {
        super(numeroDeCuenta, saldo, usuarioAsignado, pinDeLaCuenta, fechaDeApertura);
        this.nombreDeLaEmpresa = nombreDeLaEmpresa;
        this.rfcDeLaEmpresa = rfcDeLaEmpresa;
        this.comisionExtra = comisionExtra;
        this.salario = salario;
        this.ultimaFechaDeposito = ultimaFechaDeposito;
        this.tipoDeCobro = tipoDeCobro;
    }

    public String getNombreDeLaEmpresa() {
        return nombreDeLaEmpresa;
    }

    public String getRfcDeLaEmpresa() {
        return rfcDeLaEmpresa;
    }

    public boolean isComisionExtra() {
        return comisionExtra;
    }

    public void setComisionExtra(boolean comisionExtra) {
        this.comisionExtra = comisionExtra;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getUltimaFechaDeposito() {
        return ultimaFechaDeposito;
    }

    public void setUltimaFechaDeposito(LocalDate ultimaFechaDeposito) {
        this.ultimaFechaDeposito = ultimaFechaDeposito;
    }

    public TipoDeCobro getTipoDeCobro() {
        return tipoDeCobro;
    }

    public void setTipoDeCobro(TipoDeCobro tipoDeCobro) {
        this.tipoDeCobro = tipoDeCobro;
    }
}
