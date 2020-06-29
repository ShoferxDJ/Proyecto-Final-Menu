package Controlador;
import java.sql.ResultSet;
import java.sql.SQLException;

import Conexion.conexion;
import Modelo.Computadora;

public class ComputadoraControlador {
	private conexion con;
	
    public void crearComputadora (Computadora c) {
    	
    	String insertSQL = " INSERT INTO `computadoras`(`idcategorias`, `Producto`, `Modelo`, `Descripcion`, `Precio`,`Numero`)"
+ " VALUES ("+c.getIdcategorias()+",'"+c.getProducto()+"','"+c.getModelo()+"','"+c.getDescripcion()+"',"+c.getPrecio()+","+c.getNumerop()+")";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------EDITAR COMPUTADORA----------//    
    public void editarComputadora (Computadora c) {
    	
    	String insertSQL = " UPDATE `computadoras` SET Producto='"+c.getProducto()+"', Modelo= '"+c.getModelo()+"',Descripcion= '" +c.getDescripcion()+"',Precio= '"+c.getPrecio()+"', Numero= "+c.getNumerop()+" WHERE idcategorias = "+c.getIdcategorias()+";";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------ELIMINAR COMPUTADORA----------//    
    
    public String eliminarComputadora (String idcategorias) {
    	String response = "";
    	String insertSQL = " DELETE FROM `computadoras` WHERE idcategorias = "+ idcategorias+";";
    	con = new conexion ();
    	response = con.ejecutarQery(insertSQL);
    	return response;
    }
	//----------CONSULTAR COMPUTADORA----------//    
    public void consultarComputadora (String idcategorias) {
    	String response = "";
    	String insertSQL = " SELECT * FROM `computadoras` WHERE idcategorias = "+idcategorias +";";
    	con = new conexion ();
    	
    	try {
    		ResultSet rs = con.consultarRegistros (insertSQL);
    	while (rs.next()) {
    		System.out.println("\nID: "+rs.getInt (1)+ "\nProducto: "+ rs.getString (2) + "\nModelo: "+ rs.getString (3) + "\nDescripcion: "+ rs.getString (4) + "\nPrecio: $"+ rs.getString (5) + " MXN"+ "\nNumero del Producto: "+ rs.getString (6));
    	}
    	}catch  (SQLException e) {
    		e.printStackTrace();
    		
    	}
    }
}