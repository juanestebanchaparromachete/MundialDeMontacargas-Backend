package dao;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;

import mundo.ActivoFijo;

public class ActivoFijoDAOImpl extends BasicDAO<ActivoFijo, ObjectId> implements ActivoFijoDAO {

	public ActivoFijoDAOImpl(Class<ActivoFijo> entityClass, Datastore ds) {
		super(entityClass, ds);
	}
	
	
	public ActivoFijo getById(String id) {
		Query<ActivoFijo> query = createQuery().field("id").equal(id);
				
		
		return query.get();
	}
	
	public List<ActivoFijo> getByCapaciddad(String capacidad) {
		 
		Query<ActivoFijo> query = createQuery().
				field("capacidad").equal(capacidad);
		
		return query.asList();
	}
}
