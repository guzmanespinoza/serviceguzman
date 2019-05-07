package com.sv.guzman.test.models;

public class Transaccion {

	private int id;
	private String tipo;
	private double valor;
	private String fecha;

	public Transaccion() {
		super();
	}

	public Transaccion(int id, String tipo, double valor, String fecha) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.valor = valor;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Transaccion [id=" + id + ", tipo=" + tipo + ", valor=" + valor
				+ ", fecha=" + fecha + "]";
	}

}
