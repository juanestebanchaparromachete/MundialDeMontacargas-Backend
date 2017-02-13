package dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import com.mongodb.WriteResult;

import mundo.Item;

public class ItemDAOImpl extends BasicDAO<Item, ObjectId> implements ItemDAO {

	/**
	 * @param entityClass
	 * @param ds
	 */
	public ItemDAOImpl(Class<Item> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.ItemDAO#getById(int)
	 */
	public Item getById(Item item) {

		Query<Item> query = createQuery().field("numeroInterno").equal(item.getId());

		return query.get();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.ItemDAO#updateById(int, java.lang.String, java.lang.String)
	 */
	public Item updateById(int numeroInterno, String campo, String valor) {

		Query<Item> query = createQuery().field("id").equal(numeroInterno);

		UpdateOperations<Item> ops = createUpdateOperations().set(campo, valor);

		update(query, ops);
		return query.get();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.ItemDAO#createItem(mundo.Item)
	 */
	public Key<Item> createItem(Item item) {
		Key<Item> key = save(item);
		return key;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.ItemDAO#deleteObject(mundo.Item)
	 */
	public WriteResult deleteObject(Item item) {

		Query<Item> query = createQuery();
		query.field("id").equals(item.getId());
		return deleteByQuery(query);
	}

}
