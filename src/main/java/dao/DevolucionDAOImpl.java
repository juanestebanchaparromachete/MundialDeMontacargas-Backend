package dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import com.mongodb.WriteResult;

import mundo.Devolucion;

public class DevolucionDAOImpl extends BasicDAO<Devolucion, ObjectId> implements DevolucionDAO {

	/**
	 * @param entityClass
	 * @param ds
	 */
	public DevolucionDAOImpl(Class<Devolucion> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.DevolucionDAO#getById(int)
	 */
	public Devolucion getById(Devolucion devolucion) {

		Query<Devolucion> query = createQuery().field("numeroInterno").equal(devolucion.getId());

		return query.get();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.DevolucionDAO#updateById(int, java.lang.String, java.lang.String)
	 */
	public Devolucion updateById(int numeroInterno, String campo, String valor) {

		Query<Devolucion> query = createQuery().field("id").equal(numeroInterno);

		UpdateOperations<Devolucion> ops = createUpdateOperations().set(campo, valor);

		update(query, ops);
		return query.get();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.DevolucionDAO#createDevolucion(mundo.Devolucion)
	 */
	public Key<Devolucion> createDevolucion(Devolucion devolucion) {
		Key<Devolucion> key = save(devolucion);
		return key;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.DevolucionDAO#deleteObject(mundo.Devolucion)
	 */
	public WriteResult deleteObject(Devolucion devolucion) {

		Query<Devolucion> query = createQuery();
		query.field("id").equals(devolucion.getId());
		return deleteByQuery(query);
	}

}
