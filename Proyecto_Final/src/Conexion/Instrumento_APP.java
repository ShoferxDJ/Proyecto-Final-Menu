package Conexion;

import java.util.Scanner;

import Controlador.InstrumentosControlador;
import Modelo.Instrumentos;

public class Instrumento_APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner salida = new Scanner (System.in);
		Instrumentos I = new Instrumentos ();
		InstrumentosControlador in = new InstrumentosControlador ();

		
		//---------CREAR INSTRUMENTO----------//
		
			/*I.setId(3);
			I.setTipo("CUERDA");
			I.setNombre("Guitarra Acustica vz Negra (Natural)");
			I.setDesc("Detalles del producto, Color: Natural, Peso del envío: 6 Kg, ASIN: B07QWNQCSQ");
			I.setPrecio(1150);
			in.crearInstrumentos(I);*/
		
		//---------ELIMINAR INSTRUMENTO----------//		
			
		
			//in.eliminarInstrumentos("3");
		
		//---------CONSULTAR INSTRUMENTO----------//		
		
			//in.consultarInstrumentos("1");

		
		//---------EDITAR INSTRUMENTO----------//		
		/*I.setId(2);
		I.setTipo("Cuerda");
		I.setNombre("Guitarra Eléctrica Smithfire SMI111-PACK Sombreada");
		I.setDesc("Selector de 5 posiciones, 3 Potentes Pickups Single Coil, Cuerpo de Basswood");
		I.setPrecio(3150);
		in.editarInstrumentos(I);*/
			
			//---------EDITAR INSTRUMENTO OPCION NUMERO 2----------//	
		
			/*System.out.println("Ingrese el Nombre del producto: ");
			String nombre = salida.next();
			I.setTipo(nombre);
			System.out.println("Ingrese ID del producto: ");;
			I.setId(Integer.parseInt(salida.next()));
			in.editarInstrumentos(I);*/
			
	}

}
