package dao;


import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;

import com.mongodb.WriteResult;

import mundo.Area;

public interface AreaDAO extends DAO< Area, ObjectId > {

	
	
		//------------------------------Getters
	
		public Area getById(Area area);
		
		
		//------------------------------Updates
		
		public Area updateById(int numeroInterno, String campo, String valor);
		
		//------------------------------Create
		
		public Key<Area> createArea(Area area);
		
		//------------------------------Delete
		
		public WriteResult deleteObject(Area area);
}
