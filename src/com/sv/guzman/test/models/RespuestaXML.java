package com.sv.guzman.test.models;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="xml")
public class RespuestaXML {

	
	private List<Cliente> clientes;

	public RespuestaXML() {
		super();
	}

	public RespuestaXML(List<Cliente> clientes) {
		super();
		this.clientes = clientes;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	@XmlElementWrapper
	@XmlElement(name="cliente")
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "RespuestaXML [clientes=" + clientes + "]";
	}

}
