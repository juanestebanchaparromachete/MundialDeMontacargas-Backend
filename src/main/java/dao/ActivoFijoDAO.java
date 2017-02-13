package dao;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.dao.DAO;

import com.mongodb.WriteResult;

import mundo.ActivoFijo;
import mundo.Area;

public interface ActivoFijoDAO extends DAO<ActivoFijo, ObjectId> {

	// ------------------------------Getters

	public ActivoFijo getById(ActivoFijo activoFijo);

	public List<ActivoFijo> getByCapaciddad(double activoFijo);

	// ------------------------------Updates

	public ActivoFijo updateById(int numeroInterno, String campo, String valor);

	// ------------------------------Create

	public Key<ActivoFijo> createActivoFijo(ActivoFijo activoFijo);

	// ------------------------------Delete

	public WriteResult deleteObject(ActivoFijo activoFijo);

}
