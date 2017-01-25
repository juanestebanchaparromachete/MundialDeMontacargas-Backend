package mundo;

import java.awt.Image;
import java.util.Date;

/**
 * @author juanestebanchaparromachete
 *
 */
public class ActivoFijo {

	/**
	 * numero que se le asigna al activo fijo para la identificacion en la empresa
	 */
	private int numeroInterno;

	/**
	 * tipo de montacargas a cual pertenece 
	 */
	private String tipo;

	/**
	 * marca del montacargas
	 */
	private String marca;

	/**
	 * año en el que fue ensamblada la montacargas
	 */
	private String modelo;

	/**
	 * identificador unico que se le asigna a una montacargas
	 */
	private String serial;

	/**
	 * capacidad o fuerza que puede realizar el montacargas
	 */
	private double capacidad;

	/**
	 * numero asociado al motor de la montacargas
	 */
	private int numeroMotor;

	/**
	 * altura del mastil recogido de la montacargas
	 */
	private double alturaMastilRecogido;

	/**
	 * altura del mastil extendido de la montacargas
	 */
	private double alturaMastilExtendido;

	/**
	 * numero de secciones que contiene el mastil
	 */
	private int numeroSeccionesMastil;

	/**
	 * tipo de bateria que maneja el montacargas
	 */
	private String tipoBateria;

	/**
	 * fecha en la que se adquirio el montacargas
	 */
	private Date fechaCompra;

	/**
	 * factura de la compra del montacargas
	 */
	private Image facturaCompra;

	/**
	 * valor por el cual fue adquirida la montacargas
	 */
	private int valorCompra;

	/**
	 * proveedor con el cual se adquirio la montacargas
	 */
	private Proveedor proveedor;

	/**
	 * foto de la montacargas
	 */
	private Image fotoMontacarga;

	/**
	 * manifiesto de importacion de la montacargas
	 */
	private Image manifiestoDeImportacion;

	/**
	 * Area en sucursal de un cliente a la cual se le encuentra asignada la montacargas
	 */
	private Area areaAlquilerAsignada;

	/**
	 * cliente al cual se le realiza el alquiler de la montacargas
	 */
	private Cliente clienteAlquiler;

	/**
	 * 
	 */
	private Remision salidaAlmacen;// no necesito q el activo conosca su salida
									// revisar

	/**
	 * hoja de vida atributo correspondiente a toda la informacion de mantenimientos e informes del activo fijo.
	 */
	private HojaDeVida hojaDeVida;

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
	 * @param salidaAlmacen
	 * @param hojaDeVida
	 */
	public ActivoFijo(int numeroInterno, String tipo, String marca, String modelo, String serial, double capacidad,
			int numeroMotor, double alturaMastilRecogido, double alturaMastilExtendido, int numeroSeccionesMastil,
			String tipoBateria, Date fechaCompra, Image facturaCompra, int valorCompra, Proveedor proveedor,
			Image fotoMontacarga, Image manifiestoDeImportacion, Area areaAlquilerAsignada, Cliente clienteAlquiler,
			Remision salidaAlmacen, HojaDeVida hojaDeVida) {
		super();
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
		this.clienteAlquiler = clienteAlquiler;
		this.salidaAlmacen = salidaAlmacen;
		this.hojaDeVida = hojaDeVida;
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
	public Area getAreaAlquilerAsignada() {
		return areaAlquilerAsignada;
	}

	/**
	 * @param areaAlquilerAsignada
	 */
	public void setAreaAlquilerAsignada(Area areaAlquilerAsignada) {
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
	public Remision getSalidaAlmacen() {
		return salidaAlmacen;
	}

	/**
	 * @param salidaAlmacen
	 */
	public void setSalidaAlmacen(Remision salidaAlmacen) {
		this.salidaAlmacen = salidaAlmacen;
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

}
