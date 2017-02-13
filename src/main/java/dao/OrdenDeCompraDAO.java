package dao;


import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;

import com.mongodb.WriteResult;

import mundo.OrdenDeCompra;

public interface OrdenDeCompraDAO extends DAO< OrdenDeCompra, ObjectId > {

	
	
		//------------------------------Getters
	
		public OrdenDeCompra getById(OrdenDeCompra ordenDeCompra);
		
		
		//------------------------------Updates
		
		public OrdenDeCompra updateById(int numeroInterno, String campo, String valor);
		
		//------------------------------Create
		
		public Key<OrdenDeCompra> createOrdenDeCompra(OrdenDeCompra ordenDeCompra);
		
		//------------------------------Delete
		
		public WriteResult deleteObject(OrdenDeCompra ordenDeCompra);
}
