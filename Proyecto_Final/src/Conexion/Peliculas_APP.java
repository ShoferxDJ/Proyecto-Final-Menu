package Conexion;

import java.util.Scanner;

import Controlador.PeliculasControlador;
import Modelo.Peliculas;
public class Peliculas_APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner salida = new Scanner (System.in);
		Peliculas pe= new Peliculas ();
		PeliculasControlador P= new PeliculasControlador ();
		
		//---------CREAR COMPUTADORA----------//
		/*pe.setIdcategorias(5);
		pe.setGenero("Acción/Artes marciales");
		pe.setNom("Never Back Down");
		pe.setDesc("Jack se ve envuelto en una dura pelea durante una fiesta, en la que es vencido y humillado. Avergonzado, Jack decide aprender artes marciales de la mano de un mentor, quien le enseñará disciplina y las claves para llegar a lo mas alto.");
		pe.setPrecio(40);
		
		P.crearPeliculas(pe);*/
		
		//---------ELIMINAR COMPUTADORA----------//		
			
			//P.eliminarPeliculas("5");
			
		//---------CONSULTAR COMPUTADORA----------//		

			//P.consultarAuto("1");
		//---------EDITAR COMPUTADORA----------//		
		/*pe.setIdcategorias(3);
		pe.setGenero("Acción/Artes marciales");
		pe.setNom("Never Back Down");
		pe.setDesc("Jack se ve envuelto en una dura pelea durante una fiesta, en la que es vencido y humillado. Avergonzado, Jack decide aprender artes marciales de la mano de un mentor, quien le enseñará disciplina y las claves para llegar a lo mas alto.");
		pe.setPrecio(140);
		P.editarPeliculas(pe);*/

			//---------EDITAR COMPUTADORA OPCION NUMERO 2----------//	
			/*System.out.println("Ingrese el Nombre del producto: ");
			String nombre = salida.next();
			pe.setNom(nombre);
			System.out.println("Ingrese ID del producto: ");;
			pe.setIdcategorias(Integer.parseInt(salida.next()));
			P.editarPeliculas(pe);*/
	}

}
