package dao;


import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;

import com.mongodb.WriteResult;

import mundo.Remision;

public interface RemisionDAO extends DAO< Remision, ObjectId > {

	
	
		//------------------------------Getters
	
		public Remision getById(Remision remision);
		
		
		//------------------------------Updates
		
		public Remision updateById(int numeroInterno, String campo, String valor);
		
		//------------------------------Create
		
		public Key<Remision> createRemision(Remision remision);
		
		//------------------------------Delete
		
		public WriteResult deleteObject(Remision remision);
}
