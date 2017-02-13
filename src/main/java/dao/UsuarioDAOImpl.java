package dao;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;

import com.mongodb.WriteResult;

import mundo.Usuario;

public class UsuarioDAOImpl extends BasicDAO<Usuario, ObjectId> implements UsuarioDAO {

	/**
	 * @param entityClass
	 * @param ds
	 */
	public UsuarioDAOImpl(Class<Usuario> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.UsuarioDAO#getById(int)
	 */
	public Usuario getById(Usuario usuario) {

		Query<Usuario> query = createQuery().field("numeroInterno").equal(usuario.getId());

		return query.get();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.UsuarioDAO#updateById(int, java.lang.String, java.lang.String)
	 */
	public Usuario updateById(int numeroInterno, String campo, String valor) {

		Query<Usuario> query = createQuery().field("id").equal(numeroInterno);

		UpdateOperations<Usuario> ops = createUpdateOperations().set(campo, valor);

		update(query, ops);
		return query.get();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.UsuarioDAO#createUsuario(mundo.Usuario)
	 */
	public Key<Usuario> createUsuario(Usuario usuario) {
		Key<Usuario> key = save(usuario);
		return key;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.UsuarioDAO#deleteObject(mundo.Usuario)
	 */
	public WriteResult deleteObject(Usuario usuario) {

		Query<Usuario> query = createQuery();
		query.field("id").equals(usuario.getId());
		return deleteByQuery(query);
	}

}
