package dao;


import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;

import com.mongodb.WriteResult;

import mundo.MantenimientoPreventivo;

public interface MantenimientoPreventivoDAO extends DAO< MantenimientoPreventivo, ObjectId > {

	
	
		//------------------------------Getters
	
		public MantenimientoPreventivo getById(MantenimientoPreventivo mantenimientoPreventivo);
		
		
		//------------------------------Updates
		
		public MantenimientoPreventivo updateById(int numeroInterno, String campo, String valor);
		
		//------------------------------Create
		
		public Key<MantenimientoPreventivo> createMantenimientoPreventivo(MantenimientoPreventivo mantenimientoPreventivo);
		
		//------------------------------Delete
		
		public WriteResult deleteObject(MantenimientoPreventivo mantenimientoPreventivo);
}
