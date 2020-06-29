package Conexion;

import java.util.Scanner;

import Controlador.AutoControlador;
import Modelo.Auto;

public class Auto_APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto = new Auto();
		AutoControlador autoC = new AutoControlador ();
		
		Scanner salida = new Scanner (System.in);

	
	//---------CREAR AUTO----------//
		
	/*auto.setIdproductos(1);
	auto.setModelo("GT 2017");
	auto.setMarca("Ford");
	auto.setDescripcion("SUPER AUTO");
	auto.setPrecio(3450000);
	
	autoC.crearAuto(auto);*/
		
	//---------ELIMINAR AUTO----------//		
		
	//autoC.eliminarAuto("2");
		
	//---------CONSULTAR AUTO----------//		
		//autoC.consultarAuto("3");

	//---------EDITAR AUTO----------//		
		/*auto.setIdproductos(2);
		auto.setModelo("Versa TM 2020");
		auto.setMarca("Nissan");
		auto.setDescripcion("5 pasajeros\n"
				+ "118 hp\n"
				+ "torque 110-4000 RPM\n"
				+ "Motor 1.6 Lt\n");
		auto.setPrecio(285000);
		
		autoC.editarAuto(auto);*/

		//---------EDITAR AUTO OPCION NUMERO 2----------//	
		/*System.out.println("Ingrese el Nombre del producto: ");
		String nombre = salida.next();
		auto.setModelo(nombre);
		System.out.println("Ingrese ID del producto: ");;
		auto.setIdproductos(Integer.parseInt(salida.next()));
		
		autoC.editarAuto(auto);*/
	}

}
