package dao;


import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;

import com.mongodb.WriteResult;

import mundo.Repuesto;

public interface RepuestoDAO extends DAO< Repuesto, ObjectId > {

	
	
		//------------------------------Getters
	
		public Repuesto getById(Repuesto repuesto);
		
		
		//------------------------------Updates
		
		public Repuesto updateById(int numeroInterno, String campo, String valor);
		
		//------------------------------Create
		
		public Key<Repuesto> createRepuesto(Repuesto repuesto);
		
		//------------------------------Delete
		
		public WriteResult deleteObject(Repuesto repuesto);
}
