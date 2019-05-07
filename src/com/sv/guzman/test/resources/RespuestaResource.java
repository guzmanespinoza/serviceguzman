package com.sv.guzman.test.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sv.guzman.test.services.RespuestaService;


@Path("clientes")
//@Produces(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_XML)
public class RespuestaResource {
	
	@GET
//	@Produces(MediaType.APPLICATION_JSON)
	public Response obtnerRespuestaXml(){
		RespuestaService respuestaService= new RespuestaService();
		return Response.ok(respuestaService.obtenerRespuestaXML()).build();
//		return Response.ok(respuestaService.obtenerRespuestaXML(), MediaType.APPLICATION_JSON).build();
		
	}
	

}
