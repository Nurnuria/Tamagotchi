import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * @class Juego, CLASE DONDE CREO TANTO LOS MÉTODOS QUE VA A REALIZAR EL PROGRAMA, COMO LA CONEXIÓN A LA BASE DE DATOS DE MI PROGRAMA.
 * @author Nuria López García
 * @date 2018-05-31
 */

public class Juego {
	
	/* ATRIBUTOS. */
	private Tamagotchi tamagotchi;

	/* COMPRUEBA SI YA HAY UN TAMAGOTCHI CREADO EN LA BASE DE DATOS, SINO, LO CREA. */
	public void Conexion (){
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/BaseDeDatosTamagotchi?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false","root","simboide");
			Statement smt=(Statement) con.createStatement();
			int filas=smt.executeUpdate("create table if not exists Tamagotchi ( Nombre varchar(30), Hambre int(3), Sueño int(3), Aburrimiento int(3), Suciedad int(3) ); ");

			int insercion1=smt.executeUpdate("insert into Tamagotchi values('" +tamagotchi.getNombre()+"', "+tamagotchi.getHambre()+", "+
					tamagotchi.getEnergia() +", "+
					+tamagotchi.getAburrimiento()+", "+
					tamagotchi.getSuciedad()+ " )");

			ResultSet rs=smt.executeQuery("select * from Tamagotchi");

			while(rs.next()){
				System.out.println(rs.getString("Nombre")+" : " + 
						rs.getInt("Hambre")+" : " +
						+rs.getInt("Sueño")+ " : " +
						+rs.getInt("Aburrimiento")+ " : " +
						+rs.getInt("Suciedad")+ " : ");

			}
		} catch (SQLException e) {
			e.printStackTrace(); 
		}
	}

	/**
	 * 
	 *  ELECCION DE TIPO DE COMPAÑERO. 
	 MIENTRAS QUE NO SE ELIJA UNA DE LAS OPCIONES DE COMPAÑERO, EL PROGRAMA PEDIRA QUE VUELVAS A INGRESAR EL TIPO DE COMPAÑERO*/
	public void seleccion () {
		String seleccion="";
		while(!seleccion.equals("dinosaurio")&&!seleccion.equals("cerdo volador")&&!seleccion.equals("estrella de mar")&&!seleccion.equals("gato")&&!seleccion.equals("pececito")&&!seleccion.equals("perro")) {  
			System.out.println("\n ¡Hola! \n¡Bienvenido/a a Tamagotchi!\n"
					+ "los tipos de compañero que puedes tener son: \n"
					+"*-*-* Dinosaurio, Cerdo Volador, Estrella de mar, Gato, Pececito y Perro *-*-* \n"
					+ "Y bien, ¿¿ cuál eliges ??");

			/* CREO UN SCANNER PARA INGRESAR LA OPCION.*/
			Scanner entradaEscaner = new Scanner (System.in);        
			seleccion = entradaEscaner.nextLine ();
		}
		System.out.println ("Has elegido el tipo: " + seleccion + ".");


		/*ELEJIR SU NOMBRE POR PANTALLA*/
		String nombre = "";
		boolean tengoquepedirnombre=true;
		/* EXCEPCION: SI NO INTRODUCE UN NOMBRE, MUESTRA UN ERROR, VUELVE A INGRESARLO */
		while(tengoquepedirnombre) {
			try {
				System.out.println ("¿Cómo quieres que se llame tu nuevo compañero Tamagotchi? ");  
				Scanner entradaPorEscaner = new Scanner (System.in);       
				nombre = entradaPorEscaner.nextLine ();
				if(nombre.equals("")) {
					throw new NivelFueraDeLimitesException("(╯°□°)╯");
				}
				tengoquepedirnombre=false;
				System.out.println("¡¡¡Acabo de nacer!!! mi nombre es... ' "+nombre+ " ' (ノ^_^)ノ \n");
			}catch (NivelFueraDeLimitesException excepcion) {
				System.out.println(" ERROR \n ¡escribe un nombre!"+excepcion.getMessage());
			}
		}

		if(seleccion.equals("dinosaurio")) {
			tamagotchi=new Dinosaurio(nombre,80,80,80,60,true,false);
		}
		if(seleccion.equals("cerdo volador")) {
			tamagotchi=new CerdoVolador(nombre,80,80,80,80,true,false);
		}
		if(seleccion.equals("estrella de mar")) {
			tamagotchi=new EstrellaDeMar(nombre,80,80,80,80,true,false);
		}
		if(seleccion.equals("gato")) {
			tamagotchi=new Gato(nombre,80,80,80,80,true,false);
		}
		if(seleccion.equals("pececito")) {
			tamagotchi=new Pececito(nombre,80,80,80,60,true,false);
		}
		if(seleccion.equals("perro")) {
			tamagotchi=new Perro(nombre,80,80,80,80,80,true,false);
		}		
	}


	public Tamagotchi getTamagotchi() {
		return tamagotchi;
	}


}
