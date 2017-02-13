package dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import com.mongodb.WriteResult;

import mundo.Area;

public class AreaDAOImpl extends BasicDAO<Area, ObjectId> implements AreaDAO {

	/**
	 * @param entityClass
	 * @param ds
	 */
	public AreaDAOImpl(Class<Area> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.AreaDAO#getById(int)
	 */
	public Area getById(Area area) {

		Query<Area> query = createQuery().field("numeroInterno").equal(area.getId());

		return query.get();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.AreaDAO#updateById(int, java.lang.String, java.lang.String)
	 */
	public Area updateById(int numeroInterno, String campo, String valor) {

		Query<Area> query = createQuery().field("id").equal(numeroInterno);

		UpdateOperations<Area> ops = createUpdateOperations().set(campo, valor);

		update(query, ops);
		return query.get();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.AreaDAO#createArea(mundo.Area)
	 */
	public Key<Area> createArea(Area area) {
		Key<Area> key = save(area);
		return key;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.AreaDAO#deleteObject(mundo.Area)
	 */
	public WriteResult deleteObject(Area area) {

		Query<Area> query = createQuery();
		query.field("id").equals(area.getId());
		return deleteByQuery(query);
	}

}
