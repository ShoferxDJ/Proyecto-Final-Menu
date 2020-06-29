package Controlador;
import java.sql.ResultSet;
import java.sql.SQLException;

import Conexion.conexion;
import Modelo.Telefonia;

public class TelefoniaControlador {
	private conexion con;
	
	//----------CREAR TELEFONO ----------//
    public void crearTelefono (Telefonia t){
    	
    	String insertSQL = "INSERT INTO `telefonia`(`idcategorias`, `Marca`, `Nombre`, `Descripcion`, `Precio`)"
+ " VALUES ("+t.getId()+",'"+t.getMarca()+"','"+t.getNombre()+"','"+t.getDesc()+"',"+t.getPrecio()+")";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------EDITAR TELEFONO----------//    
    public void editarTelefono (Telefonia t) {
    	
    	String insertSQL = "UPDATE `telefonia` SET Marca='"+t.getMarca()+"',Nombre= '"+t.getNombre()+"',Descripcion= '" +t.getDesc()+"',Precio= "+t.getPrecio()+" WHERE idcategorias = "+t.getId()+";";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------ELIMINAR TELEFONO----------//    
    
    public String eliminarTelefono (String id) {
    	String response = "";
    	String insertSQL = "DELETE FROM `telefonia` WHERE idcategorias = "+ id+";";
    	con = new conexion ();
    	response = con.ejecutarQery(insertSQL);
    	return response;
    }
	//----------CONSULTAR TELEFONO----------//    
    public void consultarTelefono (String id) {
    	String response = "";
    	String insertSQL = "SELECT * FROM `telefonia` WHERE idcategorias = "+ id+";";
    	con = new conexion ();
    	
    	try {
    		ResultSet rs = con.consultarRegistros (insertSQL);
    	while (rs.next()) {
    		System.out.println("\nID: "+rs.getInt (1)+ "\nMarca: "+ rs.getString (2) + "\nNombre: "+ rs.getString (3) + "\nDescripcion: "+ rs.getString (4) + "\nPrecio: $"+ rs.getString (5) + " MXN" );
    	}
    	}catch  (SQLException e) {
    		e.printStackTrace();
    		
    	}
    }
}