package dao;


import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;

import com.mongodb.WriteResult;

import mundo.Informe;

public interface InformeDAO extends DAO< Informe, ObjectId > {

	
	
		//------------------------------Getters
	
		public Informe getById(Informe informe);
		
		
		//------------------------------Updates
		
		public Informe updateById(int numeroInterno, String campo, String valor);
		
		//------------------------------Create
		
		public Key<Informe> createInforme(Informe informe);
		
		//------------------------------Delete
		
		public WriteResult deleteObject(Informe informe);
}
