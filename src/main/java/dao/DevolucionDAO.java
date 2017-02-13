package dao;


import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;

import com.mongodb.WriteResult;

import mundo.Devolucion;

public interface DevolucionDAO extends DAO< Devolucion, ObjectId > {

	
	
		//------------------------------Getters
	
		public Devolucion getById(Devolucion devolucion);
		
		
		//------------------------------Updates
		
		public Devolucion updateById(int numeroInterno, String campo, String valor);
		
		//------------------------------Create
		
		public Key<Devolucion> createDevolucion(Devolucion devolucion);
		
		//------------------------------Delete
		
		public WriteResult deleteObject(Devolucion devolucion);
}
