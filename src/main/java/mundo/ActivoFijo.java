package mundo;

import java.awt.Image;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * @author juanestebanchaparromachete
 *
 */

@Entity("ActivoFijo")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ActivoFijo {

	@Id
	@XmlElement(name = "id")
	private ObjectId id;
	/**
	 * numero que se le asigna al activo fijo para la identificacion en la
	 * empresa
	 */
	@XmlElement(name = "numeroInterno")
	private int numeroInterno;

	/**
	 * tipo de montacargas a cual pertenece
	 */
	@XmlElement(name = "tipo")
	private String tipo;

	/**
	 * marca del montacargas
	 */
	@XmlElement(name = "marca")
	private String marca;

	/**
	 * año en el que fue ensamblada la montacargas
	 */
	@XmlElement(name = "modelo")
	private String modelo;

	/**
	 * identificador unico que se le asigna a una montacargas
	 */
	@XmlElement(name = "serial")
	private String serial;

	/**
	 * capacidad o fuerza que puede realizar el montacargas
	 */
	@XmlElement(name = "capacidad")
	private double capacidad;

	/**
	 * numero asociado al motor de la montacargas
	 */
	@XmlElement(name = "numeroMotor")
	private int numeroMotor;

	/**
	 * altura del mastil recogido de la montacargas
	 */
	@XmlElement(name = "alturaMastilRecogido")
	private double alturaMastilRecogido;

	/**
	 * altura del mastil extendido de la montacargas
	 */
	@XmlElement(name = "alturaMastilExtendido")
	private double alturaMastilExtendido;

	/**
	 * numero de secciones que contiene el mastil
	 */
	@XmlElement(name = "numeroSeccionesMastil")
	private int numeroSeccionesMastil;

	/**
	 * tipo de bateria que maneja el montacargas
	 */
	@XmlElement(name = "tipoBateria")
	private String tipoBateria;

	/**
	 * fecha en la que se adquirio el montacargas
	 */
	@XmlElement(name = "fechaCompra")
	private Date fechaCompra;

	/**
	 * factura de la compra del montacargas
	 */
	@XmlElement(name = "facturaCompra")
	private Image facturaCompra;

	/**
	 * valor por el cual fue adquirida la montacargas
	 */
	@XmlElement(name = "valorCompra")
	private int valorCompra;

	/**
	 * proveedor con el cual se adquirio la montacargas
	 */
	@XmlElement(name = "proveedor")
	private Proveedor proveedor;

	/**
	 * foto de la montacargas
	 */
	@XmlElement(name = "fotoMontacarga")
	private Image fotoMontacarga;

	/**
	 * manifiesto de importacion de la montacargas
	 */
	@XmlElement(name = "manifiestoDeImportacion")
	private Image manifiestoDeImportacion;

	/**
	 * Area en sucursal de un cliente a la cual se le encuentra asignada la
	 * montacargas
	 */
	@XmlElement(name = "areaAlquilerAsignada")
	private String areaAlquilerAsignada;

	/**
	 * Area en sucursal de un cliente a la cual se le encuentra asignada la
	 * montacargas
	 */
	@XmlElement(name = "sucursalAsignada")
	private Sucursal sucursalAsignada;

	/**
	 * cliente al cual se le realiza el alquiler de la montacargas
	 */
	@XmlElement(name = "clienteAlquiler")
	private Cliente clienteAlquiler;

	/**
	 * hoja de vida atributo correspondiente a toda la informacion de
	 * mantenimientos e informes del activo fijo.
	 */
	@XmlElement(name = "hojaDeVida")
	private HojaDeVida hojaDeVida;

	/**
	 * fecha en la que se alquila el activo fijo a un cliente
	 */
	@XmlElement(name = "fechaInicioAlquiler")
	private Date fechaInicioAlquiler;

	/**
	 * fecha en la que setermina en alquiler del activo fijo a un cliente
	 */
	@XmlElement(name = "fechaFinAlquiler")
	private Date fechaFinAlquiler;

	/**
	 * El activo fijo se encuentra disponible o no. (0 no y 1 si )
	 */
	@XmlElement(name = "disponible")
	private int disponible;

	/**
	 * @param numeroInterno
	 * @param tipo
	 * @param marca
	 * @param modelo
	 * @param serial
	 * @param capacidad
	 * @param numeroMotor
	 * @param alturaMastilRecogido
	 * @param alturaMastilExtendido
	 * @param numeroSeccionesMastil
	 * @param tipoBateria
	 * @param fechaCompra
	 * @param facturaCompra
	 * @param valorCompra
	 * @param proveedor
	 * @param fotoMontacarga
	 * @param manifiestoDeImportacion
	 * @param areaAlquilerAsignada
	 * @param clienteAlquiler
	 * @param hojaDeVida
	 * @param fechaInicioAlquiler
	 * @param fechaFinAlquiler
	 * @param disponible
	 */
	public ActivoFijo(ObjectId id, int numeroInterno, String tipo, String marca, String modelo, String serial,
			double capacidad, int numeroMotor, double alturaMastilRecogido, double alturaMastilExtendido,
			int numeroSeccionesMastil, String tipoBateria, Date fechaCompra, Image facturaCompra, int valorCompra,
			Proveedor proveedor, Image fotoMontacarga, Image manifiestoDeImportacion, String areaAlquilerAsignada,
			Sucursal sucursalAsignada, Cliente clienteAlquiler, HojaDeVida hojaDeVida, Date fechaInicioAlquiler,
			Date fechaFinAlquiler, int disponible) {
		super();
		this.id = id;
		this.numeroInterno = numeroInterno;
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.serial = serial;
		this.capacidad = capacidad;
		this.numeroMotor = numeroMotor;
		this.alturaMastilRecogido = alturaMastilRecogido;
		this.alturaMastilExtendido = alturaMastilExtendido;
		this.numeroSeccionesMastil = numeroSeccionesMastil;
		this.tipoBateria = tipoBateria;
		this.fechaCompra = fechaCompra;
		this.facturaCompra = facturaCompra;
		this.valorCompra = valorCompra;
		this.proveedor = proveedor;
		this.fotoMontacarga = fotoMontacarga;
		this.manifiestoDeImportacion = manifiestoDeImportacion;
		this.areaAlquilerAsignada = areaAlquilerAsignada;
		this.sucursalAsignada = sucursalAsignada;
		this.clienteAlquiler = clienteAlquiler;
		this.hojaDeVida = hojaDeVida;
		this.fechaInicioAlquiler = fechaInicioAlquiler;
		this.fechaFinAlquiler = fechaFinAlquiler;
		this.disponible = disponible;
	}

	
	/**
	 * constructor que utilizara morphia
	 */
	public ActivoFijo()
	{
		
	}
	
	
	/**
	 * @return
	 */
	public int getNumeroInterno() {
		return numeroInterno;
	}

	/**
	 * @param numeroInterno
	 */
	public void setNumeroInterno(int numeroInterno) {
		this.numeroInterno = numeroInterno;
	}

	/**
	 * @return
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return
	 */
	public String getSerial() {
		return serial;
	}

	/**
	 * @param serial
	 */
	public void setSerial(String serial) {
		this.serial = serial;
	}

	/**
	 * @return
	 */
	public double getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return
	 */
	public int getNumeroMotor() {
		return numeroMotor;
	}

	/**
	 * @param numeroMotor
	 */
	public void setNumeroMotor(int numeroMotor) {
		this.numeroMotor = numeroMotor;
	}

	/**
	 * @return
	 */
	public double getAlturaMastilRecogido() {
		return alturaMastilRecogido;
	}

	/**
	 * @param alturaMastilRecogido
	 */
	public void setAlturaMastilRecogido(double alturaMastilRecogido) {
		this.alturaMastilRecogido = alturaMastilRecogido;
	}

	/**
	 * @return
	 */
	public double getAlturaMastilExtendido() {
		return alturaMastilExtendido;
	}

	/**
	 * @param alturaMastilExtendido
	 */
	public void setAlturaMastilExtendido(double alturaMastilExtendido) {
		this.alturaMastilExtendido = alturaMastilExtendido;
	}

	/**
	 * @return
	 */
	public int getNumeroSeccionesMastil() {
		return numeroSeccionesMastil;
	}

	/**
	 * @param numeroSeccionesMastil
	 */
	public void setNumeroSeccionesMastil(int numeroSeccionesMastil) {
		this.numeroSeccionesMastil = numeroSeccionesMastil;
	}

	/**
	 * @return
	 */
	public String getTipoBateria() {
		return tipoBateria;
	}

	/**
	 * @param tipoBateria
	 */
	public void setTipoBateria(String tipoBateria) {
		this.tipoBateria = tipoBateria;
	}

	/**
	 * @return
	 */
	public Date getFechaCompra() {
		return fechaCompra;
	}

	/**
	 * @param fechaCompra
	 */
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	/**
	 * @return
	 */
	public Image getFacturaCompra() {
		return facturaCompra;
	}

	/**
	 * @param facturaCompra
	 */
	public void setFacturaCompra(Image facturaCompra) {
		this.facturaCompra = facturaCompra;
	}

	/**
	 * @return
	 */
	public int getValorCompra() {
		return valorCompra;
	}

	/**
	 * @param valorCompra
	 */
	public void setValorCompra(int valorCompra) {
		this.valorCompra = valorCompra;
	}

	/**
	 * @return
	 */
	public Proveedor getProveedor() {
		return proveedor;
	}

	/**
	 * @param proveedor
	 */
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	/**
	 * @return
	 */
	public Image getFotoMontacarga() {
		return fotoMontacarga;
	}

	/**
	 * @param fotoMontacarga
	 */
	public void setFotoMontacarga(Image fotoMontacarga) {
		this.fotoMontacarga = fotoMontacarga;
	}

	/**
	 * @return
	 */
	public Image getManifiestoDeImportacion() {
		return manifiestoDeImportacion;
	}

	/**
	 * @param manifiestoDeImportacion
	 */
	public void setManifiestoDeImportacion(Image manifiestoDeImportacion) {
		this.manifiestoDeImportacion = manifiestoDeImportacion;
	}

	/**
	 * @return
	 */
	public String getAreaAlquilerAsignada() {
		return areaAlquilerAsignada;
	}

	/**
	 * @param areaAlquilerAsignada
	 */
	public void setAreaAlquilerAsignada(String areaAlquilerAsignada) {
		this.areaAlquilerAsignada = areaAlquilerAsignada;
	}

	/**
	 * @return
	 */
	public Cliente getClienteAlquiler() {
		return clienteAlquiler;
	}

	/**
	 * @param clienteAlquiler
	 */
	public void setClienteAlquiler(Cliente clienteAlquiler) {
		this.clienteAlquiler = clienteAlquiler;
	}

	/**
	 * @return
	 */
	public HojaDeVida getHojaDeVida() {
		return hojaDeVida;
	}

	/**
	 * @param hojaDeVida
	 */
	public void setHojaDeVida(HojaDeVida hojaDeVida) {
		this.hojaDeVida = hojaDeVida;
	}

	/**
	 * @return
	 */
	public Date getFechaInicioAlquiler() {
		return fechaInicioAlquiler;
	}

	/**
	 * @param fechaInicioAlquiler
	 */
	public void setFechaInicioAlquiler(Date fechaInicioAlquiler) {
		this.fechaInicioAlquiler = fechaInicioAlquiler;
	}

	/**
	 * @return
	 */
	public Date getFechaFinAlquiler() {
		return fechaFinAlquiler;
	}

	/**
	 * @param fechaFinAlquiler
	 */
	public void setFechaFinAlquiler(Date fechaFinAlquiler) {
		this.fechaFinAlquiler = fechaFinAlquiler;
	}

	/**
	 * @return
	 */
	public int getDisponible() {
		return disponible;
	}

	/**
	 * @param disponible
	 */
	public void setDisponible(int disponible) {
		this.disponible = disponible;
	}

	/**
	 * @param capacidad
	 */
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
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

	/**
	 * @return
	 */
	public Sucursal getSucursalAsignada() {
		return sucursalAsignada;
	}

	/**
	 * @param sucursalAsignada
	 */
	public void setSucursalAsignada(Sucursal sucursalAsignada) {
		this.sucursalAsignada = sucursalAsignada;
	}

	
}
