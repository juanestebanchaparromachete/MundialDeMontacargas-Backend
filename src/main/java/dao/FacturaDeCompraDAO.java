package dao;


import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;

import com.mongodb.WriteResult;

import mundo.FacturaDeCompra;

public interface FacturaDeCompraDAO extends DAO< FacturaDeCompra, ObjectId > {

	
	
		//------------------------------Getters
	
		public FacturaDeCompra getById(FacturaDeCompra facturaDeCompra);
		
		
		//------------------------------Updates
		
		public FacturaDeCompra updateById(int numeroInterno, String campo, String valor);
		
		//------------------------------Create
		
		public Key<FacturaDeCompra> createFacturaDeCompra(FacturaDeCompra facturaDeCompra);
		
		//------------------------------Delete
		
		public WriteResult deleteObject(FacturaDeCompra facturaDeCompra);
}
