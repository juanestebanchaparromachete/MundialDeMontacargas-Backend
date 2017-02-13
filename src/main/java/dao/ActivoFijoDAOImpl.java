package dao;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import com.mongodb.WriteResult;

import mundo.ActivoFijo;
import mundo.Area;

public class ActivoFijoDAOImpl extends BasicDAO<ActivoFijo, ObjectId> implements ActivoFijoDAO {

	public ActivoFijoDAOImpl(Class<ActivoFijo> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.AreaDAO#getById(int)
	 */
	public ActivoFijo getById(ActivoFijo activoFijo) {

		Query<ActivoFijo> query = createQuery().field("numeroInterno").equal(activoFijo.getNumeroInterno());

		return query.get();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.AreaDAO#updateById(int, java.lang.String, java.lang.String)
	 */
	public ActivoFijo updateById(int numeroInterno, String campo, String valor) {

		Query<ActivoFijo> query = createQuery().field("numeroInterno").equal(numeroInterno);

		UpdateOperations<ActivoFijo> ops = createUpdateOperations().set(campo, valor);

		update(query, ops);
		return query.get();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.AreaDAO#createArea(mundo.Area)
	 */
	public Key<ActivoFijo> createActivoFijo(ActivoFijo activoFijo) {
		Key<ActivoFijo> key = save(activoFijo);
		return key;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.AreaDAO#deleteObject(mundo.Area)
	 */
	public WriteResult deleteObject(ActivoFijo activoFijo) {

		Query<ActivoFijo> query = createQuery();
		query.field("id").equals(activoFijo.getId());
		return deleteByQuery(query);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.ActivoFijoDAO#getByCapaciddad(double)
	 */
	public List<ActivoFijo> getByCapaciddad(double capacidad) {

		Query<ActivoFijo> query = createQuery().field("capacidad").equal(capacidad);

		return query.asList();
	}

}
