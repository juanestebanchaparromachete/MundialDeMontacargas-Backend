package dao;


import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;

import com.mongodb.WriteResult;

import mundo.Usuario;

public interface UsuarioDAO extends DAO< Usuario, ObjectId > {

	
	
		//------------------------------Getters
	
		public Usuario getById(Usuario usuario);
		
		
		//------------------------------Updates
		
		public Usuario updateById(int numeroInterno, String campo, String valor);
		
		//------------------------------Create
		
		public Key<Usuario> createUsuario(Usuario usuario);
		
		//------------------------------Delete
		
		public WriteResult deleteObject(Usuario usuario);
}
