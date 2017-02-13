package dao;


import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;

import com.mongodb.WriteResult;

import mundo.Cliente;

public interface ClienteDAO extends DAO< Cliente, ObjectId > {

	
	
		//------------------------------Getters
	
		public Cliente getById(Cliente cliente);
		
		
		//------------------------------Updates
		
		public Cliente updateById(int numeroInterno, String campo, String valor);
		
		//------------------------------Create
		
		public Key<Cliente> createCliente(Cliente cliente);
		
		//------------------------------Delete
		
		public WriteResult deleteObject(Cliente cliente);
}
