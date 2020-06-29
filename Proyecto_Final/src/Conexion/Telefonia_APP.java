package Conexion;

import java.util.Scanner;

import Controlador.TelefoniaControlador;
import Modelo.Telefonia;
public class Telefonia_APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner salida = new Scanner (System.in);
		Telefonia te= new Telefonia ();
		TelefoniaControlador T = new TelefoniaControlador ();
		
		//---------CREAR TELEFONO----------//
		/*te.setId(4);
		te.setMarca("HUAWEI");
		te.setNombre("Y9 2019 Prime");
		te.setDesc("Pantalla, 6.59 Pulgadas, color negro, 4GB RAM, 64 GB ROM");
		te.setPrecio(4500);
		T.crearTelefono(te);*/
	
		//---------ELIMINAR TELEFONO----------//		
			//T.eliminarTelefono("3");

			
		//---------CONSULTAR TELEFONO----------//		
			//T.consultarTelefono("2");

		//---------EDITAR TELEFONO----------//		
		/*te.setId(3);
		te.setMarca("HUAWEI");
		te.setNombre("Y9 2019 ");
		te.setDesc("Pantalla, 6.59 Pulgadas, color blanco, 3GB RAM, 64 GB ROM");
		te.setPrecio(4500);
		T.editarTelefono(te);*/
		
			//---------EDITAR TELEFONO OPCION NUMERO 2----------//	
			/*System.out.println("Ingrese el Nombre del producto: ");
			String nombre = salida.next();
			te.setNombre(nombre);
			System.out.println("Ingrese ID del producto: ");;
			te.setId(Integer.parseInt(salida.next()));
			T.editarTelefono(te);*/
			
	}

}
