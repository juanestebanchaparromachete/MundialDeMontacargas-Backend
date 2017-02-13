package dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import com.mongodb.WriteResult;

import mundo.FacturaDeVenta;

public class FacturaDeVentaDAOImpl extends BasicDAO<FacturaDeVenta, ObjectId> implements FacturaDeVentaDAO {

	/**
	 * @param entityClass
	 * @param ds
	 */
	public FacturaDeVentaDAOImpl(Class<FacturaDeVenta> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.FacturaDeVentaDAO#getById(int)
	 */
	public FacturaDeVenta getById(FacturaDeVenta facturaDeVenta) {

		Query<FacturaDeVenta> query = createQuery().field("numeroInterno").equal(facturaDeVenta.getId());

		return query.get();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.FacturaDeVentaDAO#updateById(int, java.lang.String, java.lang.String)
	 */
	public FacturaDeVenta updateById(int numeroInterno, String campo, String valor) {

		Query<FacturaDeVenta> query = createQuery().field("id").equal(numeroInterno);

		UpdateOperations<FacturaDeVenta> ops = createUpdateOperations().set(campo, valor);

		update(query, ops);
		return query.get();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.FacturaDeVentaDAO#createFacturaDeVenta(mundo.FacturaDeVenta)
	 */
	public Key<FacturaDeVenta> createFacturaDeVenta(FacturaDeVenta facturaDeVenta) {
		Key<FacturaDeVenta> key = save(facturaDeVenta);
		return key;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.FacturaDeVentaDAO#deleteObject(mundo.FacturaDeVenta)
	 */
	public WriteResult deleteObject(FacturaDeVenta facturaDeVenta) {

		Query<FacturaDeVenta> query = createQuery();
		query.field("id").equals(facturaDeVenta.getId());
		return deleteByQuery(query);
	}

}
