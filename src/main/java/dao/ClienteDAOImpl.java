package dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import com.mongodb.WriteResult;

import mundo.Cliente;

public class ClienteDAOImpl extends BasicDAO<Cliente, ObjectId> implements ClienteDAO {

	/**
	 * @param entityClass
	 * @param ds
	 */
	public ClienteDAOImpl(Class<Cliente> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.ClienteDAO#getById(int)
	 */
	public Cliente getById(Cliente cliente) {

		Query<Cliente> query = createQuery().field("numeroInterno").equal(cliente.getId());

		return query.get();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.ClienteDAO#updateById(int, java.lang.String, java.lang.String)
	 */
	public Cliente updateById(int numeroInterno, String campo, String valor) {

		Query<Cliente> query = createQuery().field("id").equal(numeroInterno);

		UpdateOperations<Cliente> ops = createUpdateOperations().set(campo, valor);

		update(query, ops);
		return query.get();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.ClienteDAO#createCliente(mundo.Cliente)
	 */
	public Key<Cliente> createCliente(Cliente cliente) {
		Key<Cliente> key = save(cliente);
		return key;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.ClienteDAO#deleteObject(mundo.Cliente)
	 */
	public WriteResult deleteObject(Cliente cliente) {

		Query<Cliente> query = createQuery();
		query.field("id").equals(cliente.getId());
		return deleteByQuery(query);
	}

}
