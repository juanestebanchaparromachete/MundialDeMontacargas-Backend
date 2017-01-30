package dao;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.DAO;

import mundo.ActivoFijo;

public interface ActivoFijoDAO extends DAO< ActivoFijo, ObjectId >{

	public ActivoFijo getById(String id);
	
	public List<ActivoFijo> getByCapaciddad(String capacidad) ;
}
