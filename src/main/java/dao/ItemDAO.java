package dao;


import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;

import com.mongodb.WriteResult;

import mundo.Item;

public interface ItemDAO extends DAO< Item, ObjectId > {

	
	
		//------------------------------Getters
	
		public Item getById(Item item);
		
		
		//------------------------------Updates
		
		public Item updateById(int numeroInterno, String campo, String valor);
		
		//------------------------------Create
		
		public Key<Item> createItem(Item item);
		
		//------------------------------Delete
		
		public WriteResult deleteObject(Item item);
}
