package mundo;

import java.util.Date;
import java.util.List;

public class Devolucion {

	
	/**
	 * numero interno asignado a la devolucion 
	 */
	private int numeroDevolucion;
	
	/**
	 *  Remision asociada a la devolucion 
	 */
	private Remision remision;
	
	/**
	 * Empleado encargado que realiza la devolucion 
	 */
	private Usuario  empleadoEncargado;
	
	/**
	 * fehca en la cual se realiza la devolucion 
	 */
	private Date fecha;
	
	/**
	 * cliente que realiza la devolucion 
	 */
	private Cliente cliente;
	
	/**
	 * Anotaciones asociadas a la devolucion informacion importante
	 */
	private String anotaciones;
	
	/**
	 * lista de items que seran devueltos a la empresa por algún motivo 
	 */
	private List<Item> items;
	
	
	/**
	 * @param numeroDevolucion
	 * @param remision
	 * @param empleadoEncargado
	 * @param fecha
	 * @param cliente
	 * @param anotaciones
	 * @param items
	 */
	public Devolucion(int numeroDevolucion, Remision remision, Usuario empleadoEncargado, Date fecha, Cliente cliente,
			String anotaciones, List<Item> items) {
		super();
		this.numeroDevolucion = numeroDevolucion;
		this.remision = remision;
		this.empleadoEncargado = empleadoEncargado;
		this.fecha = fecha;
		this.cliente = cliente;
		this.anotaciones = anotaciones;
		this.items = items;
	}


	/**
	 * @return
	 */
	public int getNumeroDevolucion() {
		return numeroDevolucion;
	}


	/**
	 * @param numeroDevolucion
	 */
	public void setNumeroDevolucion(int numeroDevolucion) {
		this.numeroDevolucion = numeroDevolucion;
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
	public String getAnotaciones() {
		return anotaciones;
	}


	/**
	 * @param anotaciones
	 */
	public void setAnotaciones(String anotaciones) {
		this.anotaciones = anotaciones;
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
	
	
	
	
}
