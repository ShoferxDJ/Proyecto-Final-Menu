package Controlador;
import java.sql.ResultSet;
import java.sql.SQLException;

import Conexion.conexion;
import Modelo.Herramientas;

public class HerramientasControlador {
	private conexion con;
	
	//----------CREAR HERRAMIENTA----------//
    public void crearHerramientas (Herramientas h) {
    	
    	String insertSQL = "INSERT INTO `herramientas`(`idcategorias`, `Para`, `Nombre`, `Descripcion`, `Precio`)"
+ " VALUES ("+h.getId()+",'"+h.getPara()+"','"+h.getNombre()+"','"+h.getDesc()+"',"+h.getPrecio()+")";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------EDITAR HERRAMIENTA----------//    
    public void editarHerramientas (Herramientas h) {
    	
    	String insertSQL = "UPDATE `herramientas` SET Para='"+h.getPara()+"', Nombre= '"+h.getNombre()+"',Descripcion= '" +h.getDesc()+"',Precio= "+h.getPrecio()+" WHERE idcategorias = "+h.getId()+";";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------ELIMINAR HERRAMIENTA----------//    
    
    public String eliminarHerramientas (String id) {
    	String response = "";
    	String insertSQL = "DELETE FROM `herramientas` WHERE idcategorias = "+ id+";";
    	con = new conexion ();
    	response = con.ejecutarQery(insertSQL);
    	return response;
    }
	//----------CONSULTAR HERRAMIENTA----------//    
    public void consultarHerramientas (String id) {
    	String response = "";
    	String insertSQL = "SELECT * FROM `herramientas` WHERE idcategorias = "+ id+";";
    	con = new conexion ();
    	
    	try {
    		ResultSet rs = con.consultarRegistros (insertSQL);
    	while (rs.next()) {
    		System.out.println("\nID: "+rs.getInt (1)+ "\nPara: "+ rs.getString (2) + "\nNombre: "+ rs.getString (3) + "\nDescripcion: "+ rs.getString (4) + "\nPrecio: $"+ rs.getString (5) + " MXN" );
    	}
    	}catch  (SQLException e) {
    		e.printStackTrace();
    		
    	}
    }
}