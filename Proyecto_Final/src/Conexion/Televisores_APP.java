package Conexion;

import java.util.Scanner;

import Controlador.TelevisoresControlador;
import Modelo.Televisores;


public class Televisores_APP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisores tele = new Televisores();
		TelevisoresControlador tvC = new  TelevisoresControlador ();
		
		Scanner salida = new Scanner (System.in);

	
	//---------CREAR TELEVISOR----------//
		
		/*tele.setIdcategorias(3);
		tele.setMarca("HISENSE");
		tele.setModelo("Pantalla LED Hisense 40\" Full HD 40H3D");
		tele.setDescripcion("calidad Full HD, cuenta con 1920 x 1080 píxeles de resolución, Puedes conectar USB, o dispositivos mediante las 3 entradas HDMI, Pantalla 40 Pulgadas");
		tele.setPrecio(5000);
		
		tvC.crearTelevisores(tele);*/
		
	//---------ELIMINAR TELEVISOR----------//		
		
	//tvC.eliminarTelevisores("1260");
		
	//---------CONSULTAR TELEVISOR----------//		
		//tvC.consultarTelevisores("2");

	//---------EDITAR TELEVISOR----------//		
		/*tele.setIdcategorias(3);
		tele.setDescripcion("calidad Full HD, cuenta con 1920 x 1080 píxeles de resolución, Puedes conectar USB, o dispositivos mediante las 3 entradas HDMI");
		tele.setModelo("Pantalla LED Hisense 40\\\" Full HD ");
		tvC.editarTelevisores(tele);*/

		
		//---------EDITAR TELEVISOR OPCION NUMERO 2----------//	
		/*System.out.println("Ingrese el Nombre del producto: ");
		String nombre = salida.next();
		tele.setModelo(nombre);
		System.out.println("Ingrese ID del producto: ");;
		tele.setIdcategorias(Integer.parseInt(salida.next()));
		
		tvC.editarTelevisores(tele);*/
	}

}

