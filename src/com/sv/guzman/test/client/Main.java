package com.sv.guzman.test.client;

import java.io.ByteArrayOutputStream;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sv.guzman.test.models.RespuestaXML;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:8080/ServiceGuzman/api/clientes");
		RespuestaXML response = webResource.type(MediaType.APPLICATION_JSON).get(RespuestaXML.class);
		
	
		
		System.out.println(convertirObjectoAXmlStringJAXB(response));

		//String jsonRespuesta = response.getEntity(String.class);

	}
	
	public static String convertirObjectoAXmlStringJAXB(RespuestaXML response) {

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		String xml = null;

		try {

		JAXBContext jaxbContext = JAXBContext.newInstance(RespuestaXML.class);
//		Marshaller marshaller = jaxbContext.createMarshaller();
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//		System.out.println(Marshaller.JAXB_FORMATTED_OUTPUT);
		marshaller.marshal(response, outputStream);
		xml = new String(outputStream.toByteArray());

		} catch (Exception e) {
		e.printStackTrace();
		}

		return xml;

		}

}
