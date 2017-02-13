package dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import com.mongodb.WriteResult;

import mundo.Proveedor;

public class ProveedorDAOImpl extends BasicDAO<Proveedor, ObjectId> implements ProveedorDAO {

	/**
	 * @param entityClass
	 * @param ds
	 */
	public ProveedorDAOImpl(Class<Proveedor> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.ProveedorDAO#getById(int)
	 */
	public Proveedor getById(Proveedor proveedor) {

		Query<Proveedor> query = createQuery().field("numeroInterno").equal(proveedor.getId());

		return query.get();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.ProveedorDAO#updateById(int, java.lang.String, java.lang.String)
	 */
	public Proveedor updateById(int numeroInterno, String campo, String valor) {

		Query<Proveedor> query = createQuery().field("id").equal(numeroInterno);

		UpdateOperations<Proveedor> ops = createUpdateOperations().set(campo, valor);

		update(query, ops);
		return query.get();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.ProveedorDAO#createProveedor(mundo.Proveedor)
	 */
	public Key<Proveedor> createProveedor(Proveedor proveedor) {
		Key<Proveedor> key = save(proveedor);
		return key;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.ProveedorDAO#deleteObject(mundo.Proveedor)
	 */
	public WriteResult deleteObject(Proveedor proveedor) {

		Query<Proveedor> query = createQuery();
		query.field("id").equals(proveedor.getId());
		return deleteByQuery(query);
	}

}
