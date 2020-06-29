package Controlador;
import java.sql.ResultSet;
import java.sql.SQLException;

import Conexion.conexion;
import Modelo.Peliculas;

public class PeliculasControlador {
	private conexion con;
	
	//----------CREAR PELICULAS----------//
    public void crearPeliculas (Peliculas p) {	
    	
    	String insertSQL = "INSERT INTO `peliculas`(`idcategorias`, `Genero`, `Nombre`, `Descripcion`, `Precio`)"
+ " VALUES ("+p.getIdcategorias()+",'"+p.getGenero()+"','"+p.getNom()+"','"+p.getDesc()+"',"+p.getPrecio()+")";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------EDITAR PELICULAS----------//    
    public void editarPeliculas (Peliculas p)  {
    	
    	String insertSQL = "UPDATE `peliculas` SET Genero='"+p.getGenero()+"', Nombre= '"+p.getNom()+"',Descripcion= '" +p.getDesc()+"',Precio= "+p.getPrecio()+" WHERE idcategorias = "+p.getIdcategorias()+";";
    	con = new conexion ();
    	con.ejecutarQery(insertSQL);
    }
	//----------ELIMINAR PELICULAS----------//    
    
    public String eliminarPeliculas (String idcategorias) {
    	String response = "";
    	String insertSQL = "DELETE FROM `peliculas` WHERE idcategorias = "+ idcategorias+";";
    	con = new conexion ();
    	response = con.ejecutarQery(insertSQL);
    	return response;
    }
	//----------CONSULTAR PELICULAS----------//    
    public void consultarAuto (String idcategorias ) {
    	String response = "";
    	String insertSQL = "SELECT * FROM `peliculas` WHERE idcategorias = "+ idcategorias+";";
    	con = new conexion ();
    	
    	try {
    		ResultSet rs = con.consultarRegistros (insertSQL);
    	while (rs.next()) {
    		System.out.println("\nID: "+rs.getInt (1)+ "\nGenero: "+ rs.getString (2) + "\nNombre: "+ rs.getString (3) + "\nDescripcion: "+ rs.getString (4) + "\nPrecio: $"+ rs.getString (5) + " MXN" );
    	}
    	}catch  (SQLException e) {
    		e.printStackTrace();
    		
    	}
    }
}