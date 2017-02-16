package mundo;

import java.awt.Image;
import java.util.List;

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
@Entity("Proveedor")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Proveedor {

	@Id
	@XmlElement(name = "id")
	private ObjectId id;
	
	/**
	 * nombre o razon social del proveedor
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
	private String direccionSedePrincipal;

	/**
	 * estado o provincia al cual pertenece el  cliente en la ciudad.
	 */
	@XmlElement(name = "estadoOProvincia")
	private String estadoOProvincia;

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
	 * lista ordenes de compra asociadas al proveedor
	 */
	@XmlElement(name = "ordenesDeCompra")
	private List<String> ordenesDecompra;

	/**
	 * lista facturas de compra asociadas al proveedor
	 */
	@XmlElement(name = "facturasDeCompra")
	private List<String> facturasDeCompra;

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
	 * @param ordenesDecompra
	 * @param facturasDeCompra
	 */
	public Proveedor(String nombreORazonSocial, int nit, String pais, String dirreccionSedePrincipal,
			String estadoOrovincia, String ciudad, int codigoPostal, int telefono, String correo,
			String actividadEconomica, Image logotipo, String contactoAsociado, List<String> ordenesDecompra,
			List<String> facturasDeCompra) {
		super();
		this.nombreORazonSocial = nombreORazonSocial;
		this.nit = nit;
		this.pais = pais;
		this.direccionSedePrincipal = dirreccionSedePrincipal;
		this.estadoOProvincia = estadoOrovincia;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
		this.telefono = telefono;
		this.correo = correo;
		this.actividadEconomica = actividadEconomica;
		this.logotipo = logotipo;
		this.contactoAsociado = contactoAsociado;
		this.ordenesDecompra = ordenesDecompra;
		this.facturasDeCompra = facturasDeCompra;
	}
	
	public Proveedor()
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
		return direccionSedePrincipal;
	}

	/**
	 * @param dirreccionSedePrincipal
	 */
	public void setDirreccionSedePrincipal(String dirreccionSedePrincipal) {
		this.direccionSedePrincipal = dirreccionSedePrincipal;
	}

	/**
	 * @return
	 */
	public String getEstadoOrovincia() {
		return estadoOProvincia;
	}

	/**
	 * @param estadoOrovincia
	 */
	public void setEstadoOrovincia(String estadoOrovincia) {
		this.estadoOProvincia = estadoOrovincia;
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
	public List<String> getOrdenesDecompra() {
		return ordenesDecompra;
	}

	/**
	 * @param ordenesDecompra
	 */
	public void setOrdenesDecompra(List<String> ordenesDecompra) {
		this.ordenesDecompra = ordenesDecompra;
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
