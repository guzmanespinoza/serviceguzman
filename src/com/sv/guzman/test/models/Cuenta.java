package com.sv.guzman.test.models;

import java.util.List;

public class Cuenta {
	private double saldo;
	private String estado;
	private List<Transaccion> transacciones;

	public Cuenta() {
		super();
	}

	public Cuenta(double saldo, String estado, List<Transaccion> transacciones) {
		super();
		this.saldo = saldo;
		this.estado = estado;
		this.transacciones = transacciones;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Transaccion> getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", estado=" + estado
				+ ", transacciones=" + transacciones + "]";
	}

}
