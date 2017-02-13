package dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import com.mongodb.WriteResult;

import mundo.HojaDeVida;

public class HojaDeVidaDAOImpl extends BasicDAO<HojaDeVida, ObjectId> implements HojaDeVidaDAO {

	/**
	 * @param entityClass
	 * @param ds
	 */
	public HojaDeVidaDAOImpl(Class<HojaDeVida> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.HojaDeVidaDAO#getById(int)
	 */
	public HojaDeVida getById(HojaDeVida hojaDeVida) {

		Query<HojaDeVida> query = createQuery().field("numeroInterno").equal(hojaDeVida.getId());

		return query.get();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.HojaDeVidaDAO#updateById(int, java.lang.String, java.lang.String)
	 */
	public HojaDeVida updateById(int numeroInterno, String campo, String valor) {

		Query<HojaDeVida> query = createQuery().field("id").equal(numeroInterno);

		UpdateOperations<HojaDeVida> ops = createUpdateOperations().set(campo, valor);

		update(query, ops);
		return query.get();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.HojaDeVidaDAO#createHojaDeVida(mundo.HojaDeVida)
	 */
	public Key<HojaDeVida> createHojaDeVida(HojaDeVida hojaDeVida) {
		Key<HojaDeVida> key = save(hojaDeVida);
		return key;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.HojaDeVidaDAO#deleteObject(mundo.HojaDeVida)
	 */
	public WriteResult deleteObject(HojaDeVida hojaDeVida) {

		Query<HojaDeVida> query = createQuery();
		query.field("id").equals(hojaDeVida.getId());
		return deleteByQuery(query);
	}

}
