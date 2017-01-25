package mundo;

import java.awt.Image;
import java.util.List;

/**
 * @author juanestebanchaparromachete
 *
 */
public class Proveedor {

	/**
	 * nombre o razon social del proveedor
	 */
	private String nombreORazonSocial;

	/**
	 * numero de identificacion tributario.
	 */
	private int nit;

	/**
	 * pais dond ese encuentra la sucursal principal del cliente.
	 */
	private String pais;

	/**
	 * dirreccion asociada a la sede principal del cliente .
	 */
	private String dirreccionSedePrincipal;

	/**
	 * estado o provincia al cual pertenece el  cliente en la ciudad.
	 */
	private String estadoOrovincia;

	/**
	 * ciudad a la cual pertenece el cliente.
	 */
	private String ciudad;

	/**
	 * codigo postal de la ciudad a la que pertenece el cliente .
	 */
	private int codigoPostal;

	/**
	 * telefono de la sede principal del cliente.
	 */
	private int telefono;

	/**
	 * correo de contacto del cliente.
	 */
	private String correo;

	/**
	 * actividad economica que desempeña la compañia.
	 */
	private String actividadEconomica;

	/**
	 * logotipo de la compañia.
	 */
	private Image logotipo;

	/**
	 * persona asignada por el cliente a la compañia para contacto.
	 */
	private String contactoAsociado;
	
	/**
	 * lista ordenes de compra asociadas al proveedor
	 */
	private List<OrdenDeCompra> ordenesDecompra;

	/**
	 * lista facturas de compra asociadas al proveedor
	 */
	private List<FacturaDeCompra> facturasDeCompra;

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
			String actividadEconomica, Image logotipo, String contactoAsociado, List<OrdenDeCompra> ordenesDecompra,
			List<FacturaDeCompra> facturasDeCompra) {
		super();
		this.nombreORazonSocial = nombreORazonSocial;
		this.nit = nit;
		this.pais = pais;
		this.dirreccionSedePrincipal = dirreccionSedePrincipal;
		this.estadoOrovincia = estadoOrovincia;
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
		return estadoOrovincia;
	}

	/**
	 * @param estadoOrovincia
	 */
	public void setEstadoOrovincia(String estadoOrovincia) {
		this.estadoOrovincia = estadoOrovincia;
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
	public List<OrdenDeCompra> getOrdenesDecompra() {
		return ordenesDecompra;
	}

	/**
	 * @param ordenesDecompra
	 */
	public void setOrdenesDecompra(List<OrdenDeCompra> ordenesDecompra) {
		this.ordenesDecompra = ordenesDecompra;
	}

	/**
	 * @return
	 */
	public List<FacturaDeCompra> getFacturasDeCompra() {
		return facturasDeCompra;
	}

	/**
	 * @param facturasDeCompra
	 */
	public void setFacturasDeCompra(List<FacturaDeCompra> facturasDeCompra) {
		this.facturasDeCompra = facturasDeCompra;
	}

}
