package mundo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.bson.types.ObjectId;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Area {

	
	@XmlElement(name = "id")
	private ObjectId id;
	
	/**
	 * sucursal del cliente  a la cual se encuentra asociada el area
	 */
	@XmlElement(name = "sucursal")
	private Sucursal sucursal;
	
	/**
	 * empleado encargado de los activos fijos que se encuentren en el area 
	 */
	@XmlElement(name = "empleadoEncargado")
	private Usuario empleadoEncargado;
	
	/**
	 * 
	 */
	@XmlElement(name = "remision")
	private Remision remision; // revisar este atributo no lo considero necesario 
	
	/**
	 * activos fijos que se encuentran en el area se encuentra el Id del activo fijo
	 */
	@XmlElement(name = "activosFijos")
	private List<String> activosFijos;

	/**
	 * @param sucursal
	 * @param empleadoEncargado
	 * @param remision
	 * @param activosFijos
	 */
	public Area(Sucursal sucursal, Usuario empleadoEncargado, Remision remision, List<String> activosFijos) {
		super();
		this.sucursal = sucursal;
		this.empleadoEncargado = empleadoEncargado;
		this.remision = remision;
		this.activosFijos = activosFijos;
	}

	/**
	 * @return
	 */
	public Sucursal getSucursal() {
		return sucursal;
	}

	/**
	 * @param sucursal
	 */
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	/**
	 * @return
	 */
	public Usuario getEmpleadoEncargado() {
		return empleadoEncargado;
	}

	/**
	 * @param empleadoEncargado
	 */
	public void setEmpleadoEncargado(Usuario empleadoEncargado) {
		this.empleadoEncargado = empleadoEncargado;
	}

	/**
	 * @return
	 */
	public Remision getRemision() {
		return remision;
	}

	/**
	 * @param remision
	 */
	public void setRemision(Remision remision) {
		this.remision = remision;
	}

	/**
	 * @return
	 */
	public List<String> getActivosFijos() {
		return activosFijos;
	}

	/**
	 * @param activosFijos
	 */
	public void setActivosFijos(List<String> activosFijos) {
		this.activosFijos = activosFijos;
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
