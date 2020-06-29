package Controlador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexion.conexion;
import Modelo.Auto;

public class AutoControlador {
	private conexion con;
	
	//----------CREAR AUTO----------//
    public void crearAuto (Auto at) {
    	
    	String insertSQL = "INSERT INTO `auto`(`idcategorias`, `Modelo`, `Marca`, `Descripcion`, `Precio`)"
+ " VALUES ("+at.getIdproductos()+",'"+at.getModelo()+"','"+at.getMarca()+"','"+at.getDescripcion()+"',"+at.getPrecio()+")";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------EDITAR AUTO----------//    
    public void editarAuto (Auto at) {
    	
    	String insertSQL = "UPDATE `auto` SET Modelo='"+at.getModelo()+"', Marca= '"+at.getMarca()+"',Descripcion= '" + at.getDescripcion()+"',Precio= "+at.getPrecio()+" WHERE idcategorias = "+at.getIdproductos()+";";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------ELIMINAR AUTO----------//    
    
    public String eliminarAuto (String idproducto) {
    	String response = "";
    	String insertSQL = "DELETE FROM `auto` WHERE idcategorias = "+ idproducto+";";
    	con = new conexion ();
    	response = con.ejecutarQery(insertSQL);
    	return response;
    }
	//----------CONSULTAR AUTO----------//    
    public void consultarAuto (String idproducto) {
    	String response = "";
    	String insertSQL = "SELECT * FROM `auto` WHERE idcategorias = "+ idproducto+";";
    	con = new conexion ();
    	
    	try {
    		ResultSet rs = con.consultarRegistros (insertSQL);
    	while (rs.next()) {
    		System.out.println("\nID: "+rs.getInt (1)+ "\nModelo: "+ rs.getString (2) + "\nMarca: "+ rs.getString (3) + "\nDescripcion: "+ rs.getString (4) + "\nPrecio: $"+ rs.getString (5) + " MXN" );
    	}
    	}catch  (SQLException e) {
    		e.printStackTrace();
    		
    	}
    }
}