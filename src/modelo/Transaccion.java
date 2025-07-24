package modelo;

import java.time.LocalDate;

import utilidades.TipoDeCuenta;
import utilidades.EstadoDeLaTransaccion;

import modelo.CuentaCorriente;
import modelo.CuentaNomina;
import modelo.CuentaDeAhorro;

import modelo.modelosAbstractos.CuentaBancaria;

import interfaces.Informacion;

public class Transaccion implements Informacion {
    private final double monto;
    private final String idDeLaTransacion;
    
    private CuentaBancaria cuentaOrigen;
	private CuentaBancaria cuentaDestino;
    
    private TipoDeCuenta tipoDeCuentaDeOrigen;
    private TipoDeCuenta tipoDeCuentaDestino;
    private LocalDate fechaDeLaTransacion;
    private EstadoDeLaTransaccion estado;
	
	public Transaccion(double monto, String idDeLaTransacion, CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino, TipoDeCuenta tipoDeCuentaDeOrigen,
					   TipoDeCuenta tipoDeCuentaDestino, LocalDate fechaDeLaTransacion, EstadoDeLaTransaccion estado) {
		this.monto = monto;
		this.idDeLaTransacion = idDeLaTransacion;
		this.cuentaOrigen = cuentaOrigen;
		this.cuentaDestino = cuentaDestino;
		this.tipoDeCuentaDeOrigen = tipoDeCuentaDeOrigen;
		this.tipoDeCuentaDestino = tipoDeCuentaDestino;
		this.fechaDeLaTransacion = fechaDeLaTransacion;
		this.estado = estado;
	}
	//Getters y Setters
	public double getMonto() {
		return monto;
	}
	
	public String getIdDeLaTransacion() {
		return idDeLaTransacion;
	}
	
	public CuentaBancaria getCuentaOrigen() {
		return cuentaOrigen;
	}
	
	public void setCuentaOrigen(CuentaBancaria cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}
	
	public CuentaBancaria getCuentaDestino() {
		return cuentaDestino;
	}
	
	public void setCuentaDestino(CuentaBancaria cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}
	
	public TipoDeCuenta getTipoDeCuentaDeOrigen() {
		return tipoDeCuentaDeOrigen;
	}
	
	public void setTipoDeCuentaDeOrigen(TipoDeCuenta tipoDeCuentaDeOrigen) {
		this.tipoDeCuentaDeOrigen = tipoDeCuentaDeOrigen;
	}
	
	public TipoDeCuenta getTipoDeCuentaDestino() {
		return tipoDeCuentaDestino;
	}
	
	public void setTipoDeCuentaDestino(TipoDeCuenta tipoDeCuentaDestino) {
		this.tipoDeCuentaDestino = tipoDeCuentaDestino;
	}
	
	public LocalDate getFechaDeLaTransacion() {
		return fechaDeLaTransacion;
	}
	
	public void setFechaDeLaTransacion(LocalDate fechaDeLaTransacion) {
		this.fechaDeLaTransacion = fechaDeLaTransacion;
	}
	
	public EstadoDeLaTransaccion getEstado() {
		return estado;
	}
	
	public void setEstado(EstadoDeLaTransaccion estado) {
		this.estado = estado;
	}
	
	/*
		private final double monto;
	    private final String idDeLaTransacion;
	    
	    private CuentaBancaria cuentaOrigen;
		private CuentaBancaria cuentaDestino;
	    
	    private TipoDeCuenta cuentaDeOrigen;
	    private TipoDeCuenta cuentaDestino;
	    private LocalDate fechaDeLaTransacion;
	    private EstadoDeLaTransaccion estado;
     */
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("+----------------------------------+\n")
        .append("+-----------Transaccion------------+\n")
        .append("+----------------------------------+\n");
        sb.append("ID : ").append(this.getIdDeLaTransacion()).append("\n");
        sb.append("Monto : ").append(String.format("%.f", this.getMonto())).append("\n");
        sb.append("Tipo de Cuenta de Origen : ").append(String.format("%.s", this.getTipoDeCuentaDeOrigen())).append("\n");
		sb.append("Tipo de Cuenta de Destino : ").append(String.format("%.s", this.getTipoDeCuentaDestino())).append("\n");
		sb.append("Fecha de la Transaccion : ").append(String.format("%.s", this.getFechaDeLaTransacion())).append("\n");
		sb.append("Estado de la Transacion : ").append(String.format("%.s", this.getEstado())).append("\n");
  
		return sb.toString();
    }
	
	@Override
	public String getInfoEnString() {
		return "ID de la Transaccion : " + this.getIdDeLaTransacion() +
				" Monto de la Transaccion : " + String.valueOf(this.getMonto()) +
				" Cuenta de Origen : " + cuentaOrigen.getNumeroDeCuenta() +
				" Cuenta de Destino : " + cuentaDestino.getNumeroDeCuenta() +
				" Tipo de Cuenta de Origen : " + String.valueOf(this.getTipoDeCuentaDeOrigen()) +
				" Tipo de Cuenta de Destino : " + String.valueOf(this.getTipoDeCuentaDestino()) +
				" Fecha de la Transaccion : " + String.valueOf(this.getFechaDeLaTransacion()) +
				" Estado de la Transaccion : " + String.valueOf(this.getEstado());
		}
}
