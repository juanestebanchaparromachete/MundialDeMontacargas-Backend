package dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import com.mongodb.WriteResult;

import mundo.Remision;

public class RemisionDAOImpl extends BasicDAO<Remision, ObjectId> implements RemisionDAO {

	/**
	 * @param entityClass
	 * @param ds
	 */
	public RemisionDAOImpl(Class<Remision> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.RemisionDAO#getById(int)
	 */
	public Remision getById(Remision remision) {

		Query<Remision> query = createQuery().field("numeroInterno").equal(remision.getId());

		return query.get();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.RemisionDAO#updateById(int, java.lang.String, java.lang.String)
	 */
	public Remision updateById(int numeroInterno, String campo, String valor) {

		Query<Remision> query = createQuery().field("id").equal(numeroInterno);

		UpdateOperations<Remision> ops = createUpdateOperations().set(campo, valor);

		update(query, ops);
		return query.get();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.RemisionDAO#createRemision(mundo.Remision)
	 */
	public Key<Remision> createRemision(Remision remision) {
		Key<Remision> key = save(remision);
		return key;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.RemisionDAO#deleteObject(mundo.Remision)
	 */
	public WriteResult deleteObject(Remision remision) {

		Query<Remision> query = createQuery();
		query.field("id").equals(remision.getId());
		return deleteByQuery(query);
	}

}
