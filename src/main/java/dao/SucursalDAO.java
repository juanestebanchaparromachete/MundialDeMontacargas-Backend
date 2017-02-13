package dao;


import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;

import com.mongodb.WriteResult;

import mundo.Sucursal;

public interface SucursalDAO extends DAO< Sucursal, ObjectId > {

	
	
		//------------------------------Getters
	
		public Sucursal getById(Sucursal sucursal);
		
		
		//------------------------------Updates
		
		public Sucursal updateById(int numeroInterno, String campo, String valor);
		
		//------------------------------Create
		
		public Key<Sucursal> createSucursal(Sucursal sucursal);
		
		//------------------------------Delete
		
		public WriteResult deleteObject(Sucursal sucursal);
}
