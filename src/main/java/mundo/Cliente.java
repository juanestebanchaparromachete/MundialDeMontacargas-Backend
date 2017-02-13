package mundo;

import java.awt.Image;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.bson.types.ObjectId;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Cliente {

	
	@XmlElement(name = "id")
	private ObjectId id;
	
	
	/**
	 * nombre o razon social del cliente.
	 */
	@XmlElement(name = "nombreORazonSocial")
	private String nombreORazonSocial;

	/**
	 * numero de identificacion tributario.
	 */
	@XmlElement(name = "nit")
	private int nit;

	/**
	 * pais dond ese encuentra la sucursal principal del cliente.
	 */
	@XmlElement(name = "pais")
	private String pais;

	/**
	 * dirreccion asociada a la sede principal del cliente .
	 */
	@XmlElement(name = "direccionSedePrincipal")
	private String dirreccionSedePrincipal;

	/**
	 * estado o provincia al cual pertenece el  cliente en la ciudad.
	 */
	@XmlElement(name = "estadoOProvincia")
	private String estadoOprovincia;

	/**
	 * ciudad a la cual pertenece el cliente.
	 */
	@XmlElement(name = "ciudad")
	private String ciudad;

	/**
	 * codigo postal de la ciudad a la que pertenece el cliente .
	 */
	@XmlElement(name = "codigoPostal")
	private int codigoPostal;

	/**
	 * telefono de la sede principal del cliente.
	 */
	@XmlElement(name = "telefono")
	private int telefono;

	/**
	 * correo de contacto del cliente.
	 */
	@XmlElement(name = "correo")
	private String correo;

	/**
	 * actividad economica que desempeña la compañia.
	 */
	@XmlElement(name = "actividadEconomica")
	private String actividadEconomica;

	/**
	 * logotipo de la compañia.
	 */
	@XmlElement(name = "logotipo")
	private Image logotipo;

	/**
	 * persona asignada por el cliente a la compañia para contacto.
	 */
	@XmlElement(name = "contactoAsociado")
	private String contactoAsociado;

	/**
	 * id de las sucursales que tiene al cliente.
	 */
	@XmlElement(name = "sucursales")
	private List<String> sucursales;

	/**
	 * id de las facturas de venta asociadas al cliente.
	 */
	@XmlElement(name = "facturaDeVenta")
	private List<String> facturasDeVenta;

	/**
	 * id de los activos fijos que se encuentran alquilados al cliente.
	 */
	@XmlElement(name = "activosFijos")
	private List<String> activosFijos;

	/**
	 * @param nombreORazonSocial
	 * @param nit
	 * @param pais
	 * @param dirreccionSedePrincipal
	 * @param estadoOrovincia
	 * @param ciudad
	 * @param codigoPostal
	 * @param telefono
	 * @param correo
	 * @param actividadEconomica
	 * @param logotipo
	 * @param contactoAsociado
	 * @param sucursales
	 * @param facturasDeVenta
	 * @param activosFijos
	 */
	public Cliente(String nombreORazonSocial, int nit, String pais, String dirreccionSedePrincipal,
			String estadoOrovincia, String ciudad, int codigoPostal, int telefono, String correo,
			String actividadEconomica, Image logotipo, String contactoAsociado, List<String> sucursales,
			List<String> facturasDeVenta, List<String> activosFijos) {
		super();
		this.nombreORazonSocial = nombreORazonSocial;
		this.nit = nit;
		this.pais = pais;
		this.dirreccionSedePrincipal = dirreccionSedePrincipal;
		this.estadoOprovincia = estadoOrovincia;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
		this.telefono = telefono;
		this.correo = correo;
		this.actividadEconomica = actividadEconomica;
		this.logotipo = logotipo;
		this.contactoAsociado = contactoAsociado;
		this.sucursales = sucursales;
		this.facturasDeVenta = facturasDeVenta;
		this.activosFijos = activosFijos;
	}

	
	public Cliente()
	{
		
	}
	/**
	 * @return
	 */
	public String getNombreORazonSocial() {
		return nombreORazonSocial;
	}

	/**
	 * @param nombreORazonSocial
	 */
	public void setNombreORazonSocial(String nombreORazonSocial) {
		this.nombreORazonSocial = nombreORazonSocial;
	}

	/**
	 * @return
	 */
	public int getNit() {
		return nit;
	}

	/**
	 * @param nit
	 */
	public void setNit(int nit) {
		this.nit = nit;
	}

	/**
	 * @return
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return
	 */
	public String getDirreccionSedePrincipal() {
		return dirreccionSedePrincipal;
	}

	/**
	 * @param dirreccionSedePrincipal
	 */
	public void setDirreccionSedePrincipal(String dirreccionSedePrincipal) {
		this.dirreccionSedePrincipal = dirreccionSedePrincipal;
	}

	/**
	 * @return
	 */
	public String getEstadoOrovincia() {
		return estadoOprovincia;
	}

	/**
	 * @param estadoOrovincia
	 */
	public void setEstadoOrovincia(String estadoOrovincia) {
		this.estadoOprovincia = estadoOrovincia;
	}

	/**
	 * @return
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return
	 */
	public int getCodigoPostal() {
		return codigoPostal;
	}

	/**
	 * @param codigoPostal
	 */
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	/**
	 * @return
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
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
	public String getActividadEconomica() {
		return actividadEconomica;
	}

	/**
	 * @param actividadEconomica
	 */
	public void setActividadEconomica(String actividadEconomica) {
		this.actividadEconomica = actividadEconomica;
	}

	/**
	 * @return
	 */
	public Image getLogotipo() {
		return logotipo;
	}

	/**
	 * @param logotipo
	 */
	public void setLogotipo(Image logotipo) {
		this.logotipo = logotipo;
	}

	/**
	 * @return
	 */
	public String getContactoAsociado() {
		return contactoAsociado;
	}

	/**
	 * @param contactoAsociado
	 */
	public void setContactoAsociado(String contactoAsociado) {
		this.contactoAsociado = contactoAsociado;
	}

	/**
	 * @return
	 */
	public List<String> getSucursales() {
		return sucursales;
	}

	/**
	 * @param sucursales
	 */
	public void setSucursales(List<String> sucursales) {
		this.sucursales = sucursales;
	}

	/**
	 * @return
	 */
	public List<String> getFacturasDeVenta() {
		return facturasDeVenta;
	}

	/**
	 * @param facturasDeVenta
	 */
	public void setFacturasDeVenta(List<String> facturasDeVenta) {
		this.facturasDeVenta = facturasDeVenta;
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
