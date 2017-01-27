package mundo;

import java.awt.Image;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.bson.types.ObjectId;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Usuario {

	
	@XmlElement(name = "id")
	private ObjectId id;
	
	/**
	 * login del usuario
	 */
	@XmlElement(name = "login")
	private String login;

	/**
	 * contraseña del usuario
	 */
	@XmlElement(name = "contraseña")
	private String contrasena;

	/**
	 * rol que se le asigno al usuario en la compañia
	 */
	@XmlElement(name = "rol")
	private String rol;

	/**
	 * nombre del usuario
	 */
	@XmlElement(name = "nombre")
	private String nombre;

	/**
	 * edad del usuario
	 */
	@XmlElement(name = "edad")
	private int edad;

	/**
	 * fecha de nacimiento del usuario
	 */
	@XmlElement(name = "fechaDeNacimiento")
	private Date fechaDeNacimiento;

	/**
	 * correo del usuario
	 */
	@XmlElement(name = "correo")
	private String correo;

	/**
	 * cedula del usuario
	 */
	@XmlElement(name = "cedula")
	private int cedula;

	/**
	 * direccion de residencia del usuario
	 */
	@XmlElement(name = "direccionDeResidencia")
	private String direccionDeResidencia;

	/**
	 * telefono fijo del usuario
	 */
	@XmlElement(name = "telefonoFijo")
	private int telefonoFijo;

	/**
	 * celular del usuario
	 */
	@XmlElement(name = "celular")
	private int celular;

	/**
	 * numero de Arp del usuario
	 */
	@XmlElement(name = "numeroArp")
	private int numeroArp;

	/**
	 * cargo del usuario
	 */
	@XmlElement(name = "cargo")
	private String cargo;

	/**
	 * foto del usuario
	 */
	@XmlElement(name = "foto")
	private Image foto;

	/**
	 * lista de las ordenes de compra que el usuario ha realizado
	 */
	@XmlElement(name = "ordenesDeCompra")
	private List<String> ordenesDeCompra;

	/**
	 * lista de las devoluciones que el usuario ha realizado
	 */
	@XmlElement(name = "devoluciones")
	private List<String> devoluciones;

	/**
	 * lista de las facturas de compra que el usuario ha realizado
	 */
	@XmlElement(name = "facturasDeCompra")
	private List<String> facturasDeCompra;

	/**
	 * area asignada al usuario de mantenimiento para mantenimiento preventivo
	 */
	@XmlElement(name = "areaAsignada")
	private Area areaAsignada;

	/**
	 * lista de las remisiones que el usuario ha realizado
	 */
	@XmlElement(name = "salidaDeAlmacen")
	private List<String> salidasDeAlmacen;

	/**
	 * lista de mantenimientos preventivos que el usuario ha realizado
	 */
	@XmlElement(name = "mantenimientosPreventivos")
	private List<MantenimientoPreventivo> mantenimientosPreventivos;

	/**
	 * @param login : login del usuario
	 * @param contrasena :  contraseña del usuario
	 * @param rol : rol que se le asigno al usuario en la compañia
	 * @param nombre : nombre del usuario
	 * @param edad : edad del usuario
	 * @param fechaDeNacimiento : fecha de nacimiento del usuario
	 * @param correo : correo del usuario
	 * @param cedula : cedula del usuario
	 * @param direccionDeResidencia : direccion de residencia del usuario
	 * @param telefonoFijo : telefono fijo del usuario
	 * @param celular : celular del usuario
	 * @param numeroArp : numero Arp del usuario
	 * @param cargo :  cargo del usuario en la compañia
	 * @param foto : fotol del usuario
	 * @param ordenesDeCompra : lista de las ordenes de compra que el usuario ha realizado
	 * @param devoluciones : lista de las devoluciones que el usuario ha realizado
	 * @param facturasDeCompra : lista de las facturas de compra que el usuario ha realizado
	 * @param areaAsignada : area asignada al usuario de mantenimiento para mantenimiento preventivo
	 * @param salidasDeAlmacen : lista de las remisiones que el usuario ha realizado
	 * @param mantenimientosPreventivos : lista de mantenimientos preventivos que el usuario ha realizado
	 */
	public Usuario(String login, String contrasena, String rol, String nombre, int edad, Date fechaDeNacimiento,
			String correo, int cedula, String direccionDeResidencia, int telefonoFijo, int celular, int numeroArp,
			String cargo, Image foto, List<String> ordenesDeCompra, List<String> devoluciones,
			List<String> facturasDeCompra, Area areaAsignada, List<String> salidasDeAlmacen,
			List<MantenimientoPreventivo> mantenimientosPreventivos) {
		super();
		this.login = login;
		this.contrasena = contrasena;
		this.rol = rol;
		this.nombre = nombre;
		this.edad = edad;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.correo = correo;
		this.cedula = cedula;
		this.direccionDeResidencia = direccionDeResidencia;
		this.telefonoFijo = telefonoFijo;
		this.celular = celular;
		this.numeroArp = numeroArp;
		this.cargo = cargo;
		this.foto = foto;
		this.ordenesDeCompra = ordenesDeCompra;
		this.devoluciones = devoluciones;
		this.facturasDeCompra = facturasDeCompra;
		this.areaAsignada = areaAsignada;
		this.salidasDeAlmacen = salidasDeAlmacen;
		this.mantenimientosPreventivos = mantenimientosPreventivos;
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
	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * @param contrasena
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	/**
	 * @return
	 */
	public String getRol() {
		return rol;
	}

	/**
	 * @param rol
	 */
	public void setRol(String rol) {
		this.rol = rol;
	}

	/**
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return
	 */
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	/**
	 * @param fechaDeNacimiento
	 */
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	/**
	 * @return
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return
	 */
	public int getCedula() {
		return cedula;
	}

	/**
	 * @param cedula
	 */
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	/**
	 * @return
	 */
	public String getDireccionDeResidencia() {
		return direccionDeResidencia;
	}

	/**
	 * @param direccionDeResidencia
	 */
	public void setDireccionDeResidencia(String direccionDeResidencia) {
		this.direccionDeResidencia = direccionDeResidencia;
	}

	/**
	 * @return
	 */
	public int getTelefonoFijo() {
		return telefonoFijo;
	}

	/**
	 * @param telefonoFijo
	 */
	public void setTelefonoFijo(int telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	/**
	 * @return
	 */
	public int getCelular() {
		return celular;
	}

	/**
	 * @param celular
	 */
	public void setCelular(int celular) {
		this.celular = celular;
	}

	/**
	 * @return
	 */
	public int getNumeroArp() {
		return numeroArp;
	}

	/**
	 * @param numeroArp
	 */
	public void setNumeroArp(int numeroArp) {
		this.numeroArp = numeroArp;
	}

	/**
	 * @return
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * @param cargo
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	/**
	 * @return
	 */
	public Image getFoto() {
		return foto;
	}

	/**
	 * @param foto
	 */
	public void setFoto(Image foto) {
		this.foto = foto;
	}

	/**
	 * @return
	 */
	public List<String> getOrdenesDeCompra() {
		return ordenesDeCompra;
	}

	/**
	 * @param ordenesDeCompra
	 */
	public void setOrdenesDeCompra(List<String> ordenesDeCompra) {
		this.ordenesDeCompra = ordenesDeCompra;
	}

	/**
	 * @return
	 */
	public List<String> getDevoluciones() {
		return devoluciones;
	}

	/**
	 * @param devoluciones
	 */
	public void setDevoluciones(List<String> devoluciones) {
		this.devoluciones = devoluciones;
	}

	/**
	 * @return
	 */
	public List<String> getFacturasDeCompra() {
		return facturasDeCompra;
	}

	/**
	 * @param facturasDeCompra
	 */
	public void setFacturasDeCompra(List<String> facturasDeCompra) {
		this.facturasDeCompra = facturasDeCompra;
	}

	/**
	 * @return
	 */
	public Area getAreaAsignada() {
		return areaAsignada;
	}

	/**
	 * @param areaAsignada
	 */
	public void setAreaAsignada(Area areaAsignada) {
		this.areaAsignada = areaAsignada;
	}

	/**
	 * @return
	 */
	public List<String> getSalidasDeAlmacen() {
		return salidasDeAlmacen;
	}

	/**
	 * @param salidasDeAlmacen
	 */
	public void setSalidasDeAlmacen(List<String> salidasDeAlmacen) {
		this.salidasDeAlmacen = salidasDeAlmacen;
	}

	/**
	 * @return
	 */
	public List<MantenimientoPreventivo> getMantenimientosPreventivos() {
		return mantenimientosPreventivos;
	}

	/**
	 * @param mantenimientosPreventivos
	 */
	public void setMantenimientosPreventivos(List<MantenimientoPreventivo> mantenimientosPreventivos) {
		this.mantenimientosPreventivos = mantenimientosPreventivos;
	}

	
}
