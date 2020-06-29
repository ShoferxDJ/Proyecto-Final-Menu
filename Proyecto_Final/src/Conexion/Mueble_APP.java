package Conexion;

import java.util.Scanner;

import Controlador.MueblesControlador;
import Modelo.Muebles;

public class Mueble_APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner salida = new Scanner (System.in);
		Muebles mu = new Muebles();
		MueblesControlador M = new MueblesControlador ();
		
		
		//---------CREAR COMPUTADORA----------//
		/*mu.setId(5);
		mu.setPara("Jardin");
		mu.setNombre("Silla de plastico");
		mu.setDesc("Color Blanco");
		mu.setPrecio(800);
		M.crearMuebles(mu);*/
	 
		//---------ELIMINAR COMPUTADORA----------//		
			//M.eliminarMuebles("3");
			
			
		//---------CONSULTAR COMPUTADORA----------//		

		//M.consultarMuebles("1");	
		
		//---------EDITAR COMPUTADORA----------//		
		/*mu.setId(4);
		mu.setPara("Jardin");
		mu.setNombre("Silla de plastico");
		mu.setDesc("Color Rojo");
		mu.setPrecio(800);
		M.editarMuebles(mu);*/

			//---------EDITAR COMPUTADORA OPCION NUMERO 2----------//	
			/*System.out.println("Ingrese el Nombre del producto: ");
			String nombre = salida.next();
			mu.setPara(nombre);
			System.out.println("Ingrese ID del producto: ");;
			mu.setId(Integer.parseInt(salida.next()));
			
			M.editarMuebles(mu);*/
			
	}

}
