package dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import com.mongodb.WriteResult;

import mundo.FacturaDeCompra;

public class FacturaDeCompraDAOImpl extends BasicDAO<FacturaDeCompra, ObjectId> implements FacturaDeCompraDAO {

	/**
	 * @param entityClass
	 * @param ds
	 */
	public FacturaDeCompraDAOImpl(Class<FacturaDeCompra> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.FacturaDeCompraDAO#getById(int)
	 */
	public FacturaDeCompra getById(FacturaDeCompra facturaDeCompra) {

		Query<FacturaDeCompra> query = createQuery().field("numeroInterno").equal(facturaDeCompra.getId());

		return query.get();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.FacturaDeCompraDAO#updateById(int, java.lang.String, java.lang.String)
	 */
	public FacturaDeCompra updateById(int numeroInterno, String campo, String valor) {

		Query<FacturaDeCompra> query = createQuery().field("id").equal(numeroInterno);

		UpdateOperations<FacturaDeCompra> ops = createUpdateOperations().set(campo, valor);

		update(query, ops);
		return query.get();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.FacturaDeCompraDAO#createFacturaDeCompra(mundo.FacturaDeCompra)
	 */
	public Key<FacturaDeCompra> createFacturaDeCompra(FacturaDeCompra facturaDeCompra) {
		Key<FacturaDeCompra> key = save(facturaDeCompra);
		return key;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.FacturaDeCompraDAO#deleteObject(mundo.FacturaDeCompra)
	 */
	public WriteResult deleteObject(FacturaDeCompra facturaDeCompra) {

		Query<FacturaDeCompra> query = createQuery();
		query.field("id").equals(facturaDeCompra.getId());
		return deleteByQuery(query);
	}

}
