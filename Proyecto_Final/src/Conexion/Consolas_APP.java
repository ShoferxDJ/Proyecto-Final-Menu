package Conexion;

import java.util.Scanner;

import Controlador.ConsolasControlador;
import Modelo.Consolas;


public class Consolas_APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner salida = new Scanner (System.in);
		Consolas c = new Consolas ();
		ConsolasControlador co = new ConsolasControlador ();
		
		//---------CREAR COMPUTADORA----------//
		/*c.setId(3);
		c.setNombre("PS 4 Pro");
		c.setMarca("Play Station");
		c.setDescripcion("PlayStation con 1 TB de almacenamiento,Memoria Interna: 1 TB, Garantía: Directa con el proveedor, País de Origen: México, Reacondicionado: No, Género del Juego: Acción, Puertos: 1 Entrada auxiliar 3.5 mm y 1 HDMI, Gama Color: Negro");
		c.setPrecio(6550);
		co.crearConsolas(c);*/
	
		//---------ELIMINAR COMPUTADORA----------//		
			
		//co.eliminarConsolas("3");
			
		//---------CONSULTAR COMPUTADORA----------//		
			//co.consultarConsolas("55569");

		//---------EDITAR COMPUTADORA----------//		
		/*c.setId(2);
		c.setNombre("PS 4 Pro");
		c.setMarca("Play Station");
		c.setDescripcion("PlayStation con 1 TB de almacenamiento,Memoria Interna: 1 TB, Garantía: Directa con el proveedor, País de Origen: México, Reacondicionado: No, Género del Juego: Acción, Puertos: 1 Entrada auxiliar 3.5 mm y 1 HDMI, Gama Color: Negro");
		c.setPrecio(7550);
		co.editarConsolas(c);*/
		

			//---------EDITAR COMPUTADORA OPCION NUMERO 2----------//	
		/*System.out.println("Ingrese el Nombre del producto: ");
		String nombre = salida.next();
		c.setNombre(nombre);
		System.out.println("Ingrese ID del producto: ");;
		c.setId(Integer.parseInt(salida.next()));
		co.editarConsolas(c);*/
	}

}
