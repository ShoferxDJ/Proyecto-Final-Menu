package Conexion;

import java.util.Scanner;

import Controlador.HerramientasControlador;
import Modelo.Herramientas;

public class Herramienta_APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner salida = new Scanner (System.in);
		Herramientas H = new Herramientas();
		HerramientasControlador he = new HerramientasControlador();
		
		//---------CREAR COMPUTADORA----------//
		/*H.setId(4);
		H.setPara("Oficina");
		H.setNombre("Calculadora");
		H.setDesc("Calculadora Cientifica");
		H.setPrecio(260);
		
		he.crearHerramientas(H);*/
	
		//---------ELIMINAR COMPUTADORA----------//		
			//he.eliminarHerramientas("4");
		
			
		//---------CONSULTAR COMPUTADORA----------//		
		//he.consultarHerramientas("4");
		
		//---------EDITAR COMPUTADORA----------//		
		/*H.setId(3);
		H.setPara("Oficina");
		H.setNombre("Calculadora");
		H.setDesc("Calculadora Cientifica");
		H.setPrecio(260);
		he.editarHerramientas(H);*/

			//---------EDITAR COMPUTADORA OPCION NUMERO 2----------//	
			/*System.out.println("Ingrese el Nombre del producto: ");
			String nombre = salida.next();
			H.setNombre(nombre);
			System.out.println("Ingrese ID del producto: ");;
			H.setId(Integer.parseInt(salida.next()));
			he.editarHerramientas(H);*/
			
			
	}

}
