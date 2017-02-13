package dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import com.mongodb.WriteResult;

import mundo.OrdenDeCompra;

public class OrdenDeCompraDAOImpl extends BasicDAO<OrdenDeCompra, ObjectId> implements OrdenDeCompraDAO {

	/**
	 * @param entityClass
	 * @param ds
	 */
	public OrdenDeCompraDAOImpl(Class<OrdenDeCompra> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.OrdenDeCompraDAO#getById(int)
	 */
	public OrdenDeCompra getById(OrdenDeCompra ordenDeCompra) {

		Query<OrdenDeCompra> query = createQuery().field("numeroInterno").equal(ordenDeCompra.getId());

		return query.get();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.OrdenDeCompraDAO#updateById(int, java.lang.String, java.lang.String)
	 */
	public OrdenDeCompra updateById(int numeroInterno, String campo, String valor) {

		Query<OrdenDeCompra> query = createQuery().field("id").equal(numeroInterno);

		UpdateOperations<OrdenDeCompra> ops = createUpdateOperations().set(campo, valor);

		update(query, ops);
		return query.get();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.OrdenDeCompraDAO#createOrdenDeCompra(mundo.OrdenDeCompra)
	 */
	public Key<OrdenDeCompra> createOrdenDeCompra(OrdenDeCompra ordenDeCompra) {
		Key<OrdenDeCompra> key = save(ordenDeCompra);
		return key;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.OrdenDeCompraDAO#deleteObject(mundo.OrdenDeCompra)
	 */
	public WriteResult deleteObject(OrdenDeCompra ordenDeCompra) {

		Query<OrdenDeCompra> query = createQuery();
		query.field("id").equals(ordenDeCompra.getId());
		return deleteByQuery(query);
	}

}
