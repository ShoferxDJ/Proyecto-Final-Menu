package Conexion;

import java.util.Scanner;

import Controlador.ComputadoraControlador;
import Modelo.Computadora;

public class Computadora_APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner salida = new Scanner (System.in);
		Computadora cu = new Computadora ();
		ComputadoraControlador C = new ComputadoraControlador ();
		
		//---------CREAR COMPUTADORA----------//
		/*cu.setIdcategorias(3);
		cu.setProducto("Lenovo");
		cu.setModelo("Legion Y520");
		cu.setDescripcion("Intel (R)Core(TM) i7-7700HQ, CPU @ 2.80 GHz, NVIVIDA GTX 1050, 8.0 GB RAM, 1 TB HHD, 256 SSD");
		cu.setPrecio(18600);
		cu.setNumerop(10589);
		C.crearComputadora(cu);*/
	
		//---------ELIMINAR COMPUTADORA----------//		
			
		//C.eliminarComputadora("1");
			
		//---------CONSULTAR COMPUTADORA----------//		
			//C.consultarComputadora("1");

		//---------EDITAR COMPUTADORA----------//		
		/*cu.setIdcategorias(1);
		cu.setProducto("Lenovo");
		cu.setModelo("Legion Y520");
		cu.setDescripcion("Intel (R)Core(TM) i7-7700HQ, CPU @ 2.80 GHz, NVIVIDA GTX 1050, 8.0 GB RAM, 1 TB HHD, 256 SSD");
		cu.setPrecio(17000);
		cu.setNumerop(1000);
		C.editarComputadora(cu);*/

			//---------EDITAR COMPUTADORA OPCION NUMERO 2----------//	
			/*System.out.println("Ingrese el Nombre del producto: ");
			String nombre = salida.next();
			cu.setProducto(nombre);
			System.out.println("Ingrese ID del producto: ");;
			cu.setIdcategorias(Integer.parseInt(salida.next()));
			C.editarComputadora(cu);*/
			
	}

}
