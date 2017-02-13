package dao;


import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;

import com.mongodb.WriteResult;

import mundo.Proveedor;

public interface ProveedorDAO extends DAO< Proveedor, ObjectId > {

	
	
		//------------------------------Getters
	
		public Proveedor getById(Proveedor proveedor);
		
		
		//------------------------------Updates
		
		public Proveedor updateById(int numeroInterno, String campo, String valor);
		
		//------------------------------Create
		
		public Key<Proveedor> createProveedor(Proveedor proveedor);
		
		//------------------------------Delete
		
		public WriteResult deleteObject(Proveedor proveedor);
}
