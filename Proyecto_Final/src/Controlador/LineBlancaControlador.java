package Controlador;
import java.sql.ResultSet;
import java.sql.SQLException;

import Conexion.conexion;
import Modelo.Linea_Blanca;

public class LineBlancaControlador {
	private conexion con;
	
	//----------CREAR LINEA BLANCA----------//
    public void crearLinea_Blanca (Linea_Blanca l) {
    	
    	String insertSQL = "INSERT INTO `linea blanca`(`idcategorias`, `Tipo`, `Marca`, `Descripcion`, `Precio`)"
+ " VALUES ("+l.getId()+",'"+l.getTipo()+"','"+l.getMarca()+"','"+l.getDesc()+"',"+l.getPrecio()+")";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------EDITAR LINEA BLANCA----------//    
    public void editarLinea_Blanca (Linea_Blanca l) {
    	
    	String insertSQL = "UPDATE `linea blanca` SET Tipo ='"+l.getTipo()+"',Marca = '"+l.getMarca()+"',Descripcion= '" +l.getDesc()+"',Precio= "+l.getPrecio()+" WHERE idcategorias = "+l.getId()+";";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------ELIMINAR LINEA BLANCA----------//    
    
    public String eliminarLinea_Blanca (String id) {
    	String response = "";
    	String insertSQL = "DELETE FROM `linea blanca` WHERE idcategorias = "+ id+";";
    	con = new conexion ();
    	response = con.ejecutarQery(insertSQL);
    	return response;
    }
	//----------CONSULTAR LINEA BLANCA----------//    
    public void consultarLinea_Blanca (String id) {
    	String response = "";
    	String insertSQL = "SELECT * FROM `linea blanca` WHERE idcategorias = "+ id+";";
    	con = new conexion ();
    	
    	try {
    		ResultSet rs = con.consultarRegistros (insertSQL);
    	while (rs.next()) {
    		System.out.println("\nID: "+rs.getInt (1)+ "\nTipo: "+ rs.getString (2) + "\nMarca: "+ rs.getString (3) + "\nDescripcion: "+ rs.getString (4) + "\nPrecio: $"+ rs.getString (5) + " MXN" );
    	}
    	}catch  (SQLException e) {
    		e.printStackTrace();
    		
    	}
    }
}