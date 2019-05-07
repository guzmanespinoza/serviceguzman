package com.sv.guzman.test.process;

import java.util.ArrayList;
import java.util.List;

import com.sv.guzman.test.models.Cliente;
import com.sv.guzman.test.models.Cuenta;
import com.sv.guzman.test.models.Transaccion;

public class ClienteProcess {

	public List<Cliente> obtenerClientes() {

		int cantidadClientes = 2;
		int cantidadCuentas = 2;
		int cantidadTransacciones = 2;

		List<Cliente> clientes = new ArrayList<Cliente>();

		for (int cli = 0; cli < cantidadClientes; cli++) {

			List<Cuenta> cuentas = new ArrayList<Cuenta>();
			
			for (int cta = 0; cta < cantidadCuentas; cta++) {

				List<Transaccion> transacciones = new ArrayList<Transaccion>();

				for (int trn = 0; trn < cantidadTransacciones; trn++) {
					Transaccion transaccion = new Transaccion(trn,
							"tipo" + trn, 400, "22/05/2018");
					transacciones.add(transaccion);
				}
				
				Cuenta cuenta = new Cuenta(800.00, "activo" + cta, transacciones);
				cuentas.add(cuenta);

			}
			
			Cliente cliente = new Cliente("000000"+cli, "tipo"+cli, "000000"+cli, "nombre"+cli, "apellido"+cli, cuentas);
			clientes.add(cliente);

		}

		return clientes;

	}

}
