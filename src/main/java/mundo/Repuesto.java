package mundo;

import java.awt.Image;
import java.util.List;

public class Repuesto {

	/**
	 * numero asignado al repuesto por la compañia
	 */
	private int numeroRepuesto;

	/**
	 * numero de parte con el que se identifica un repuesto en su fabricante
	 */
	private int numeroParteFabricante;

	/**
	 * descripcion del repuesto
	 */
	private String descripcion;

	/**
	 * valor unitario del repuesto
	 */
	private double valorUnitario;

	/**
	 * lista d emontacargas compatibles con el repuesto
	 */
	private List<String> montacargasCompatibles;

	/**
	 * ubicacion del del repuesto en el area de almacenamiento
	 */
	private String ubicacionAreaAlmacenamiento;

	/**
	 * imagen del repuesto
	 */
	private Image imagen;

	/**
	 * clasificacion a la cual pertenece el repuesto
	 */
	private String clasificacion;

	/**
	 * item al cual se encuentra asociado un repuesto
	 */
	private Item item;

	/**
	 * @param numeroRepuesto
	 * @param numeroParteFabricante
	 * @param descripcion
	 * @param valorUnitario
	 * @param montacargasCompatibles
	 * @param ubicacionAreaAlmacenamiento
	 * @param imagen
	 * @param clasificacion
	 * @param item
	 */
	public Repuesto(int numeroRepuesto, int numeroParteFabricante, String descripcion, double valorUnitario,
			List<String> montacargasCompatibles, String ubicacionAreaAlmacenamiento, Image imagen, String clasificacion,
			Item item) {
		super();
		this.numeroRepuesto = numeroRepuesto;
		this.numeroParteFabricante = numeroParteFabricante;
		this.descripcion = descripcion;
		this.valorUnitario = valorUnitario;
		this.montacargasCompatibles = montacargasCompatibles;
		this.ubicacionAreaAlmacenamiento = ubicacionAreaAlmacenamiento;
		this.imagen = imagen;
		this.clasificacion = clasificacion;
		this.item = item;
	}

	/**
	 * @return
	 */
	public int getNumeroRepuesto() {
		return numeroRepuesto;
	}

	/**
	 * @param numeroRepuesto
	 */
	public void setNumeroRepuesto(int numeroRepuesto) {
		this.numeroRepuesto = numeroRepuesto;
	}

	/**
	 * @return
	 */
	public int getNumeroParteFabricante() {
		return numeroParteFabricante;
	}

	/**
	 * @param numeroParteFabricante
	 */
	public void setNumeroParteFabricante(int numeroParteFabricante) {
		this.numeroParteFabricante = numeroParteFabricante;
	}

	/**
	 * @return
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return
	 */
	public double getValorUnitario() {
		return valorUnitario;
	}

	/**
	 * @param valorUnitario
	 */
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	/**
	 * @return
	 */
	public List<String> getMontacargasCompatibles() {
		return montacargasCompatibles;
	}

	/**
	 * @param montacargasCompatibles
	 */
	public void setMontacargasCompatibles(List<String> montacargasCompatibles) {
		this.montacargasCompatibles = montacargasCompatibles;
	}

	/**
	 * @return
	 */
	public String getUbicacionAreaAlmacenamiento() {
		return ubicacionAreaAlmacenamiento;
	}

	/**
	 * @param ubicacionAreaAlmacenamiento
	 */
	public void setUbicacionAreaAlmacenamiento(String ubicacionAreaAlmacenamiento) {
		this.ubicacionAreaAlmacenamiento = ubicacionAreaAlmacenamiento;
	}

	/**
	 * @return
	 */
	public Image getImagen() {
		return imagen;
	}

	/**
	 * @param imagen
	 */
	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

	/**
	 * @return
	 */
	public String getClasificacion() {
		return clasificacion;
	}

	/**
	 * @param clasificacion
	 */
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	/**
	 * @return
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * @param item
	 */
	public void setItem(Item item) {
		this.item = item;
	}

}
