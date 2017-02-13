package mundo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.bson.types.ObjectId;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Sucursal {


	@XmlElement(name = "id")
	private ObjectId id;
	
	/**
	 * lista de las areas que pertenecen a la sucursal
	 */
	@XmlElement(name = "areas")
	private List<Area> areas;

	/**
	 * cliente al cual le pertenece la sucursal
	 */
	@XmlElement(name = "cliente")
	private Cliente cliente;

	/**
	 * @param areas
	 * @param cliente
	 */
	public Sucursal(List<Area> areas, Cliente cliente) {
		super();
		this.areas = areas;
		this.cliente = cliente;
	}

	public Sucursal()
	{
		
	}
	/**
	 * @return
	 */
	public List<Area> getAreas() {
		return areas;
	}

	/**
	 * @param areas
	 */
	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	/**
	 * @return
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(ObjectId id) {
		this.id = id;
	}
}
