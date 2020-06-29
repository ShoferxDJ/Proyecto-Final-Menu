package Conexion;
import java.util.Scanner;

import Controlador.LineBlancaControlador;
import Modelo.Linea_Blanca;
public class Linea_APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner salida = new Scanner (System.in);
		Linea_Blanca li=new Linea_Blanca ();
		LineBlancaControlador L = new LineBlancaControlador ();
		
		//---------CREAR LINEA BLANCA----------//
		/*li.setId(3);
		li.setTipo("Refrigerador");
		li.setMarca("Samsung");
		li.setDesc("DOS PUESTA COLOR GRIS CON BLANCO");
		li.setPrecio(6630);
		L.crearLinea_Blanca(li);*/
	
		//---------ELIMINAR LINEA BLANCA----------//		
			
		//L.eliminarLinea_Blanca("3");
			
		//---------CONSULTAR LINEA BLANCA----------//		
			//L.consultarLinea_Blanca("4");

		//---------EDITAR LINEA BLANCA----------//		
	
		/*li.setId(4);
		li.setTipo("Refrigerador");
		li.setMarca("Samsung");
		li.setDesc("Dos puesta, color blanco, manijas cromadas");
		li.setPrecio(6800);
		L.editarLinea_Blanca(li);*/
		
		
			//---------EDITAR COMPUTADORA OPCION NUMERO 2----------//	
			/*System.out.println("Ingrese el Nombre del producto: ");
			String nombre = salida.next();
			li.setMarca(nombre);
			System.out.println("Ingrese ID del producto: ");;
			li.setId(Integer.parseInt(salida.next()));
			L.editarLinea_Blanca(li);*/
		
			
	}

}
