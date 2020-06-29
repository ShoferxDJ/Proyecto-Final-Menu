package Controlador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexion.conexion;
import Modelo.Auto;
import Modelo.Muebles;

public class MueblesControlador {
	private conexion con;
	
	//----------CREAR MUEBLE----------//
    public void crearMuebles (Muebles m) {
    	
    	String insertSQL = "INSERT INTO `muebles`(`idcategorias`, `Para`, `Nombre`, `Descripcion`, `Precio`)"
+ " VALUES ("+m.getId()+",'"+m.getPara()+"','"+m.getNombre()+"','"+m.getDesc()+"',"+m.getPrecio()+")";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------EDITAR MUEBLE----------//    
    public void editarMuebles (Muebles m){
    	
    	String insertSQL = "UPDATE `muebles` SET Para='"+m.getPara()+"', Nombre= '"+m.getNombre()+"',Descripcion= '" +m.getDesc()+"',Precio= "+m.getPrecio()+" WHERE idcategorias = "+m.getId()+";";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------ELIMINAR MUEBLE----------//    
    
    public String eliminarMuebles (String id) {
    	String response = "";
    	String insertSQL = "DELETE FROM `muebles` WHERE idcategorias = "+ id+";";
    	con = new conexion ();
    	response = con.ejecutarQery(insertSQL);
    	return response;
    }
	//----------CONSULTAR MUEBLE----------//    
    public void consultarMuebles (String id) {
    	String response = "";
    	String insertSQL = "SELECT * FROM `muebles` WHERE idcategorias = "+ id+";";
    	con = new conexion ();
    	
    	try {
    		ResultSet rs = con.consultarRegistros (insertSQL);
    	while (rs.next()) {
    		System.out.println("\nID: "+rs.getInt (1)+ "\nPara: "+ rs.getString (2) + "\nNombre:  "+ rs.getString (3) + "\nDescripcion: "+ rs.getString (4) + "\nPrecio: $"+ rs.getString (5) + " MXN" );
    	}
    	}catch  (SQLException e) {
    		e.printStackTrace();
    		
    	}
    }
}