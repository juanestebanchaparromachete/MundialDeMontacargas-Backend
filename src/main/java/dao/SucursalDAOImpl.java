package dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import com.mongodb.WriteResult;

import mundo.Sucursal;

public class SucursalDAOImpl extends BasicDAO<Sucursal, ObjectId> implements SucursalDAO {

	/**
	 * @param entityClass
	 * @param ds
	 */
	public SucursalDAOImpl(Class<Sucursal> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.SucursalDAO#getById(int)
	 */
	public Sucursal getById(Sucursal sucursal) {

		Query<Sucursal> query = createQuery().field("numeroInterno").equal(sucursal.getId());

		return query.get();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.SucursalDAO#updateById(int, java.lang.String, java.lang.String)
	 */
	public Sucursal updateById(int numeroInterno, String campo, String valor) {

		Query<Sucursal> query = createQuery().field("id").equal(numeroInterno);

		UpdateOperations<Sucursal> ops = createUpdateOperations().set(campo, valor);

		update(query, ops);
		return query.get();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.SucursalDAO#createSucursal(mundo.Sucursal)
	 */
	public Key<Sucursal> createSucursal(Sucursal sucursal) {
		Key<Sucursal> key = save(sucursal);
		return key;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.SucursalDAO#deleteObject(mundo.Sucursal)
	 */
	public WriteResult deleteObject(Sucursal sucursal) {

		Query<Sucursal> query = createQuery();
		query.field("id").equals(sucursal.getId());
		return deleteByQuery(query);
	}

}
