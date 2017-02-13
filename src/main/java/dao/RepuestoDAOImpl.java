package dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import com.mongodb.WriteResult;

import mundo.Repuesto;

public class RepuestoDAOImpl extends BasicDAO<Repuesto, ObjectId> implements RepuestoDAO {

	/**
	 * @param entityClass
	 * @param ds
	 */
	public RepuestoDAOImpl(Class<Repuesto> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.RepuestoDAO#getById(int)
	 */
	public Repuesto getById(Repuesto repuesto) {

		Query<Repuesto> query = createQuery().field("numeroInterno").equal(repuesto.getId());

		return query.get();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.RepuestoDAO#updateById(int, java.lang.String, java.lang.String)
	 */
	public Repuesto updateById(int numeroInterno, String campo, String valor) {

		Query<Repuesto> query = createQuery().field("id").equal(numeroInterno);

		UpdateOperations<Repuesto> ops = createUpdateOperations().set(campo, valor);

		update(query, ops);
		return query.get();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.RepuestoDAO#createRepuesto(mundo.Repuesto)
	 */
	public Key<Repuesto> createRepuesto(Repuesto repuesto) {
		Key<Repuesto> key = save(repuesto);
		return key;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.RepuestoDAO#deleteObject(mundo.Repuesto)
	 */
	public WriteResult deleteObject(Repuesto repuesto) {

		Query<Repuesto> query = createQuery();
		query.field("id").equals(repuesto.getId());
		return deleteByQuery(query);
	}

}
