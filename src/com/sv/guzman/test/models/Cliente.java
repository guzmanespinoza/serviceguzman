package com.sv.guzman.test.models;

import java.util.List;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={ "tipo", "documento", "nombre", "apellido", "cuentas" } )
public class Cliente {

	
	private String codigo;
	private String tipo;
	private String documento;
	private String nombre;
	private String apellido;
	private List<Cuenta> cuentas;

	public Cliente() {
		super();
	}

	public Cliente(String codigo, String tipo, String documento, String nombre,
			String apellido, List<Cuenta> cuentas) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.documento = documento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuentas = cuentas;
	}


	@XmlAttribute(name="codigo")
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@XmlElementWrapper
	@XmlElement(name="cuenta")
	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", tipo=" + tipo + ", documento="
				+ documento + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", cuentas=" + cuentas + "]";
	}

}
