package dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import com.mongodb.WriteResult;

import mundo.MantenimientoPreventivo;

public class MantenimientoPreventivoDAOImpl extends BasicDAO<MantenimientoPreventivo, ObjectId> implements MantenimientoPreventivoDAO {

	/**
	 * @param entityClass
	 * @param ds
	 */
	public MantenimientoPreventivoDAOImpl(Class<MantenimientoPreventivo> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.MantenimientoPreventivoDAO#getById(int)
	 */
	public MantenimientoPreventivo getById(MantenimientoPreventivo mantenimientoPreventivo) {

		Query<MantenimientoPreventivo> query = createQuery().field("numeroInterno").equal(mantenimientoPreventivo.getId());

		return query.get();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.MantenimientoPreventivoDAO#updateById(int, java.lang.String, java.lang.String)
	 */
	public MantenimientoPreventivo updateById(int numeroInterno, String campo, String valor) {

		Query<MantenimientoPreventivo> query = createQuery().field("id").equal(numeroInterno);

		UpdateOperations<MantenimientoPreventivo> ops = createUpdateOperations().set(campo, valor);

		update(query, ops);
		return query.get();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.MantenimientoPreventivoDAO#createMantenimientoPreventivo(mundo.MantenimientoPreventivo)
	 */
	public Key<MantenimientoPreventivo> createMantenimientoPreventivo(MantenimientoPreventivo mantenimientoPreventivo) {
		Key<MantenimientoPreventivo> key = save(mantenimientoPreventivo);
		return key;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.MantenimientoPreventivoDAO#deleteObject(mundo.MantenimientoPreventivo)
	 */
	public WriteResult deleteObject(MantenimientoPreventivo mantenimientoPreventivo) {

		Query<MantenimientoPreventivo> query = createQuery();
		query.field("id").equals(mantenimientoPreventivo.getId());
		return deleteByQuery(query);
	}

}
