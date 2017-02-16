package mundo;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
@Entity("Remision")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Remision {
	@Id
	@XmlElement(name = "id")
	private ObjectId id;
	
	/**
	 *  numero asignado a la remision por la compañia
	 */
	@XmlElement(name = "numeroRemision")
	private int numeroRemision;

	/**
	 * numero de la orden de trabajo 
	 */
	@XmlElement(name = "numeroOrdenDeTrabajo")
	private int numeroOrdenDeTrabajo;

	/**
	 * empleado que realiza la remision
	 */
	@XmlElement(name = "empleadoEncargado")
	private Usuario empleadoEncargado;

	/**
	 * fecha en la que se realiza la remision
	 */
	@XmlElement(name = "fecha")
	private Date fecha;

	/**
	 * cliente al cual se le realiza la remision de una salida del almacen 
	 */
	@XmlElement(name = "cliente")
	private Cliente cliente;

	/**
	 * numero de items  en al remision
	 */
	@XmlElement(name = "cantidadItems")
	private int cantidadItems;

	/**
	 * lista Id de activos fijos de la remision
	 */
	@XmlElement(name = "activosFijos")
	private List<String> activosFijos;

	/**
	 * lista de areas donde van a ir los activod fijos
	 */
	@XmlElement(name = "areas")
	private List<String> areas;

	/**
	 * lista de devoluciones asociadas a esta remision
	 */
	@XmlElement(name = "devoluciones")
	private List<Devolucion> devoluciones;

	/**
	 * lista de items que se encuentran en la remision
	 */
	@XmlElement(name = "items")
	private List<Item> items;

	/**
	 * @param numeroRemision
	 * @param numeroOrdenDeTrabajo
	 * @param empleadoEncargado
	 * @param fecha
	 * @param cliente
	 * @param cantidadItems
	 * @param activosFijos
	 * @param areas
	 * @param devoluciones
	 * @param items
	 */
	public Remision(int numeroRemision, int numeroOrdenDeTrabajo, Usuario empleadoEncargado, Date fecha,
			Cliente cliente, int cantidadItems, List<String> activosFijos, List<String> areas,
			List<Devolucion> devoluciones, List<Item> items) {
		super();
		this.numeroRemision = numeroRemision;
		this.numeroOrdenDeTrabajo = numeroOrdenDeTrabajo;
		this.empleadoEncargado = empleadoEncargado;
		this.fecha = fecha;
		this.cliente = cliente;
		this.cantidadItems = cantidadItems;
		this.activosFijos = activosFijos;
		this.areas = areas;
		this.devoluciones = devoluciones;
		this.items = items;
	}

	/**
	 * 
	 */
	public Remision()
	{
		
	}
	/**
	 * @return
	 */
	public int getNumeroRemision() {
		return numeroRemision;
	}

	/**
	 * @param numeroRemision
	 */
	public void setNumeroRemision(int numeroRemision) {
		this.numeroRemision = numeroRemision;
	}

	/**
	 * @return
	 */
	public int getNumeroOrdenDeTrabajo() {
		return numeroOrdenDeTrabajo;
	}

	/**
	 * @param numeroOrdenDeTrabajo
	 */
	public void setNumeroOrdenDeTrabajo(int numeroOrdenDeTrabajo) {
		this.numeroOrdenDeTrabajo = numeroOrdenDeTrabajo;
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
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
	public int getCantidadItems() {
		return cantidadItems;
	}

	/**
	 * @param cantidadItems
	 */
	public void setCantidadItems(int cantidadItems) {
		this.cantidadItems = cantidadItems;
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
	public List<String> getAreas() {
		return areas;
	}

	/**
	 * @param areas
	 */
	public void setAreas(List<String> areas) {
		this.areas = areas;
	}

	/**
	 * @return
	 */
	public List<Devolucion> getDevoluciones() {
		return devoluciones;
	}

	/**
	 * @param devoluciones
	 */
	public void setDevoluciones(List<Devolucion> devoluciones) {
		this.devoluciones = devoluciones;
	}

	/**
	 * @return
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * @param items
	 */
	public void setItems(List<Item> items) {
		this.items = items;
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
