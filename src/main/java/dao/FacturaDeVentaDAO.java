package dao;


import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;

import com.mongodb.WriteResult;

import mundo.FacturaDeVenta;

public interface FacturaDeVentaDAO extends DAO< FacturaDeVenta, ObjectId > {

	
	
		//------------------------------Getters
	
		public FacturaDeVenta getById(FacturaDeVenta facturaDeVenta);
		
		
		//------------------------------Updates
		
		public FacturaDeVenta updateById(int numeroInterno, String campo, String valor);
		
		//------------------------------Create
		
		public Key<FacturaDeVenta> createFacturaDeVenta(FacturaDeVenta facturaDeVenta);
		
		//------------------------------Delete
		
		public WriteResult deleteObject(FacturaDeVenta facturaDeVenta);
}
