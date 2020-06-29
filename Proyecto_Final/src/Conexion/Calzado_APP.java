package Conexion;

import java.util.Scanner;

import Controlador.CalzadoControlador;
import Modelo.Calzado;

public class Calzado_APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calzado z = new Calzado ();
		CalzadoControlador ZAP = new CalzadoControlador();
		
		Scanner salida = new Scanner (System.in);
		
	
	//---------CREAR ZAPATO----------//
		/*z.setIdproductos(1);
		z.setProducto("ZAPATO ESCOLAR");
		z.setMarca("APACHE");
		z.setNumero(24);
		z.setPrecio(230);
		
		ZAP.crearCalzado(z);*/
		
		
	//---------ELIMINAR ZAPATO----------//		
		
	//ZAP.eliminarCalzado("1");
		
		
		
	//---------CONSULTAR ZAPATO----------//		
		//ZAP.consultarCalzado("5508");
		
		

	//---------EDITAR ZAPATO----------//		
		
		/*z.setIdproductos(1);
		z.setProducto("ZAPATO ESCOLAR");
		z.setMarca("FLEXI");
		z.setNumero(24);
		z.setPrecio(230);
		ZAP.editarCalzado(z);*/
		

	//---------EDITAR ZAPATO OPCION NUMERO 2----------//	
		/*System.out.println("Ingrese el Nombre del producto: ");
		String nombre = salida.next();
		z.setProducto(nombre);
		System.out.println("Ingrese ID del producto: ");;
		z.setIdproductos(Integer.parseInt(salida.next()));
		
		ZAP.editarCalzado(z);*/
	}

}

