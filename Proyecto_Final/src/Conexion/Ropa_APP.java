package Conexion;

import java.util.Scanner;

import Controlador.RopaControlador;
import Modelo.Ropa;
public class Ropa_APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner salida = new Scanner (System.in);
	Ropa ro= new Ropa ();
	RopaControlador R=new RopaControlador ();
	
	
		
		//---------CREAR COMPUTADORA----------//

	/*ro.setId(4);
	ro.setTipo("Vestidos");
	ro.setMarca("SHEIN Vestido de tirante ajustado fruncido delantero");
	ro.setPrecio(186);
	R.crearRopa(ro);*/
	
	
		//---------ELIMINAR COMPUTADORA----------//
	
	//R.eliminarRopa("4");
	
		//---------CONSULTAR COMPUTADORA----------//		

	//R.consultarRopa("1");
	
		//---------EDITAR COMPUTADORA----------//		
	/*ro.setId(3);
	ro.setTipo("VESTIDOS");
	ro.setMarca("SHEIN Vestido de tirante ajustado fruncido delantero");
	ro.setPrecio(186);
	R.editarRopa(ro);*/

			//---------EDITAR COMPUTADORA OPCION NUMERO 2----------//	
			/*System.out.println("Ingrese el Nombre del producto: ");
			String nombre = salida.next();
			ro.setMarca(nombre);
			System.out.println("Ingrese ID del producto: ");;
			ro.setId(Integer.parseInt(salida.next()));
			R.editarRopa(ro);]*/
	}

}
