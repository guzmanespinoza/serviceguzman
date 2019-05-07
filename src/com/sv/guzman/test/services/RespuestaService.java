package com.sv.guzman.test.services;

import com.sv.guzman.test.models.RespuestaXML;
import com.sv.guzman.test.process.ClienteProcess;

public class RespuestaService {

	public RespuestaXML obtenerRespuestaXML() {
		ClienteProcess clienteProces = new ClienteProcess();
		
		RespuestaXML xml = new RespuestaXML(clienteProces.obtenerClientes());
		
		return xml;

	}

}
