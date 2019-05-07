package com.sv.guzman.test.services;

import java.io.ByteArrayOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.sv.guzman.test.models.RespuestaXML;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RespuestaService service= new RespuestaService();
		
		System.out.println(convertirObjectoAXmlStringJAXB(service.obtenerRespuestaXML()));

	}
	
	public static String convertirObjectoAXmlStringJAXB(RespuestaXML response) {

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		String xml = null;

		try {

		JAXBContext jaxbContext = JAXBContext.newInstance(RespuestaXML.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.marshal(response, outputStream);
		xml = new String(outputStream.toByteArray());

		} catch (Exception e) {
		e.printStackTrace();
		}

		return xml;

		}

}
