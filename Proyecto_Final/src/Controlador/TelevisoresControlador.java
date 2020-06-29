package Controlador;
import java.sql.ResultSet;
import java.sql.SQLException;

import Conexion.conexion;
import Modelo.Televisores;


public class TelevisoresControlador {
	private conexion con;
	
	//----------CREAR TELEVISOR----------//
    public void crearTelevisores (Televisores tv) {
    	
    	String insertSQL = "INSERT INTO `televisores`(`idcategorias`, `Marca`, `Modelo`, `Descripcion`, `Precio`)"
+ " VALUES ("+tv.getIdcategorias()+",'"+tv.getMarca()+"','"+tv.getModelo()+"','"+tv.getDescripcion()+"',"+tv.getPrecio()+")";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------EDITAR TELEVISOR----------//    
    public void editarTelevisores (Televisores tv) {
    	
    	String insertSQL = "UPDATE `Televisores` SET Marca='"+tv.getMarca()+"', Modelo= '"+tv.getModelo()+"',Descripcion= '" +tv.getDescripcion()+"',Precio= "+tv.getPrecio()+" WHERE idcategorias = "+tv.getIdcategorias()+";";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------ELIMINAR TELEVISOR----------//    
    
    public String eliminarTelevisores(String idcategorias) {
    	String response = "";
    	String insertSQL = "DELETE FROM `Televisores` WHERE idcategorias = "+ idcategorias+";";
    	con = new conexion ();
    	response = con.ejecutarQery(insertSQL);
    	return response;
    }
	//----------CONSULTAR TELEVISOR----------//    
    public void consultarTelevisores (String idcategorias) {
    	String response = "";
    	String insertSQL = "SELECT * FROM `Televisores` WHERE idcategorias = "+ idcategorias+";";
    	con = new conexion ();
    	
    	try {
    		ResultSet rs = con.consultarRegistros (insertSQL);
    	while (rs.next()) {
    		System.out.println("\nID: "+rs.getInt (1) +"\nMARCA: "+ rs.getString (2) + "\nMODELO: "+ rs.getString (3) + "\nDESCRIPCION: "+ rs.getString (4) + "\nPRECIO: $"+ rs.getString (5) + " MXN" );
    	}
    	}catch  (SQLException e) {
    		e.printStackTrace();
    		
    	}
    }
}