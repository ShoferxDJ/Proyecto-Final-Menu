package Conexion;

import java.util.Scanner;

import Controlador.MusicaControlador;
import Modelo.Musica;
public class Musica_APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner salida = new Scanner (System.in);
		Musica ms =new Musica ();
		MusicaControlador MU = new MusicaControlador ();
		
		//---------CREAR COMPUTADORA----------//
		/*ms.setId(3);
		ms.setNom("Cancion");
		ms.setGenero("Rock");
		ms.setDesc("REDLINE AMV 1000hp");
		ms.setPrecio(10);
		ms.setNum(12369);
		MU.crearMusica(ms);*/
		
	
		//---------ELIMINAR COMPUTADORA----------//		
			
		//MU.eliminarMusica("3");
			
		//---------CONSULTAR COMPUTADORA----------//		

		//MU.consultarMusica("1");
		//---------EDITAR COMPUTADORA----------//		
		/*ms.setId(4);
		ms.setNom("Cancion");
		ms.setGenero("Rock");
		ms.setDesc("Dont Know How to Stop");
		ms.setPrecio(10);
		ms.setNum(123698);
		
		MU.editarMusica(ms);*/
		
			//---------EDITAR COMPUTADORA OPCION NUMERO 2----------//	
			/*System.out.println("Ingrese el Nombre del producto: ");
			String nombre = salida.next();
			ms.setGenero(nombre);
			System.out.println("Ingrese ID del producto: ");;
			ms.setId(Integer.parseInt(salida.next()));
			
			MU.editarMusica(ms);*/
	}


}
