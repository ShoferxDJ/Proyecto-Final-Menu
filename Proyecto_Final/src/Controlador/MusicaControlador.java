package Controlador;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexion.conexion;
import Modelo.Auto;
import Modelo.Musica;

public class MusicaControlador {
	private conexion con;
	
	//----------CREAR MUSICA----------//
    public void crearMusica (Musica mu) {
    	
    	String insertSQL = "INSERT INTO `música`(`idcategorias`, `Producto`, `Genero`, `Descripcion`, `Precio`,`Numero`)"
+ " VALUES ("+mu.getId()+",'"+mu.getNom()+"','"+mu.getGenero()+"','"+mu.getDesc()+"',"+mu.getPrecio()+","+mu.getNum()+")";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------EDITAR MUSICA----------//    
    public void editarMusica (Musica mu) {
    	
    	String insertSQL = "  UPDATE `música` SET Producto='"+mu.getNom()+"',Genero= '"+mu.getGenero()+"',Descripcion= '" +mu.getDesc()+"',Precio= '"+mu.getPrecio()+"', Numero= "+mu.getNum()+" WHERE idcategorias = "+mu.getId()+";";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------ELIMINAR MUSICA----------//    
    
    public String eliminarMusica (String id) {
    	String response = "";
    	String insertSQL = "DELETE FROM `música` WHERE idcategorias = "+ id+";";
    	con = new conexion ();
    	response = con.ejecutarQery(insertSQL);
    	return response;
    }
	//----------CONSULTAR MUSICA----------//    
    public void consultarMusica (String id) {
    	String response = "";
    	String insertSQL = "SELECT * FROM `música` WHERE idcategorias = "+ id+";";
    	con = new conexion ();
    	
    	try {
    		ResultSet rs = con.consultarRegistros (insertSQL);
    	while (rs.next()) {
    		System.out.println("\nID: "+rs.getInt (1)+ "\nProducto: "+ rs.getString (2) + "\nGenero: "+ rs.getString (3) + "\nDescripcion: "+ rs.getString (4) + "\nPrecio: $"+ rs.getString (5) + " MXN" );
    	}
    	}catch  (SQLException e) {
    		e.printStackTrace();
    		
    	}
    }
}