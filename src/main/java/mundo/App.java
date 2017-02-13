package mundo;

import java.awt.Image;
import java.util.Date;
import java.util.List;

import javax.swing.ImageIcon;

import dao.ActivoFijoDAO;
import dao.ActivoFijoDAOImpl;
import utilidades.MorphiaService;

public class App {

	private MorphiaService morphiaService;
	private ActivoFijoDAO userDAO;

	public App() {
		this.morphiaService = new MorphiaService();
		this.userDAO = new ActivoFijoDAOImpl(ActivoFijo.class, morphiaService.getDatastore());
	}

	public void saveEntityExample() {

		System.out.println("Save entity example");

		ActivoFijo user1 = new ActivoFijo(1, "tipo1", "marca1", "modelo1", "serial1", 100.0, 1, 1.1, 2.0, 3,
				"tipoBateria1", new Date(), "pathfactura", 1000000, new Proveedor(), "path", "path",
				"areaAlquilerAsignada1", new Sucursal(), new Cliente(), new HojaDeVida(), new Date(), new Date(), 0);
		ActivoFijo user2 = new ActivoFijo(2, "tipo2", "marca2", "modelo2", "serial2", 100.0, 2, 1.2, 2.4, 2,
				"tipoBateria2", new Date(), "pathfactura", 1000000, new Proveedor(), "path", "path",
				"areaAlquilerAsignada2", new Sucursal(), new Cliente(), new HojaDeVida(), new Date(), new Date(), 1);
		ActivoFijo user3 = new ActivoFijo(3, "tipo3", "marca3", "modelo3", "serial3", 100.0, 3, 1.2, 2.6, 3,
				"tipoBateria3", new Date(), "pathfactura", 1000000, new Proveedor(), "path", "path",
				"areaAlquilerAsignada3", new Sucursal(), new Cliente(), new HojaDeVida(), new Date(), new Date(), 0);

		System.out.println("Before persist  : ");
		System.out.println("User1 objectId " + user1.getId());
		System.out.println("User2 objectId " + user2.getId());
		System.out.println("User3 objectId " + user3.getId());

		userDAO.save(user1);
		userDAO.save(user2);
		userDAO.save(user3);

		System.out.println("Before persist  : ");
		System.out.println("User1 objectId " + user1.getId());
		System.out.println("User2 objectId " + user2.getId());
		System.out.println("User3 objectId " + user3.getId());
	}

	public void retrieveEntityExample() {

		System.out.println("Retrieve entity example ");

		System.out.println("Retrieve by Id ");
		ActivoFijo user2 = userDAO.getById(new ActivoFijo());

		System.out.println("numero interno " + user2.getId());
		System.out.println("numero interno " + user2.getNumeroInterno());
		System.out.println("tipo " + user2.getTipo());
		System.out.println("marca " + user2.getMarca());
		System.out.println("serial " + user2.getSerial());
		

		System.out.println();

		System.out.println("Retrive list of activo by capacidad ");

		List<ActivoFijo> alexs = userDAO.getByCapaciddad(100.0);
		for (ActivoFijo user : alexs) {
			System.out.println("numero interno " + user.getNumeroInterno());
			System.out.println("tipo " + user.getTipo());
			System.out.println("marca " + user.getMarca());
			System.out.println("serial " + user.getSerial());
			System.out.println("-------");
		}

	}

	public static void main(String[] args) {

		App app = new App();
		app.saveEntityExample();
		app.retrieveEntityExample();
	}

}
