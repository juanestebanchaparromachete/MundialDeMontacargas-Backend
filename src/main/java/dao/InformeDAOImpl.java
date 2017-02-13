package dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import com.mongodb.WriteResult;

import mundo.Informe;

public class InformeDAOImpl extends BasicDAO<Informe, ObjectId> implements InformeDAO {

	/**
	 * @param entityClass
	 * @param ds
	 */
	public InformeDAOImpl(Class<Informe> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.InformeDAO#getById(int)
	 */
	public Informe getById(Informe informe) {

		Query<Informe> query = createQuery().field("numeroInterno").equal(informe.getId());

		return query.get();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.InformeDAO#updateById(int, java.lang.String, java.lang.String)
	 */
	public Informe updateById(int numeroInterno, String campo, String valor) {

		Query<Informe> query = createQuery().field("id").equal(numeroInterno);

		UpdateOperations<Informe> ops = createUpdateOperations().set(campo, valor);

		update(query, ops);
		return query.get();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.InformeDAO#createInforme(mundo.Informe)
	 */
	public Key<Informe> createInforme(Informe informe) {
		Key<Informe> key = save(informe);
		return key;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.InformeDAO#deleteObject(mundo.Informe)
	 */
	public WriteResult deleteObject(Informe informe) {

		Query<Informe> query = createQuery();
		query.field("id").equals(informe.getId());
		return deleteByQuery(query);
	}

}
