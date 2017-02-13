package dao;


import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;

import com.mongodb.WriteResult;

import mundo.HojaDeVida;

public interface HojaDeVidaDAO extends DAO< HojaDeVida, ObjectId > {

	
	
		//------------------------------Getters
	
		public HojaDeVida getById(HojaDeVida hojaDeVida);
		
		
		//------------------------------Updates
		
		public HojaDeVida updateById(int numeroInterno, String campo, String valor);
		
		//------------------------------Create
		
		public Key<HojaDeVida> createHojaDeVida(HojaDeVida hojaDeVida);
		
		//------------------------------Delete
		
		public WriteResult deleteObject(HojaDeVida hojaDeVida);
}
