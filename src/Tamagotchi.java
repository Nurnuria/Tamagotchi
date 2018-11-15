import java.util.Date;
import java.util.Scanner;


/*
 * @class Tamagotchi, CLASE PRINCIPAL, DONDE EL TAMAGOTCHI TIENE TODOS SUS ATRIBUTOS Y RESPECTIVOS MÉTODOS A REALIZAR CON ÉL.
 * @author Nuria López García
 * @date 2018-05-31
 */

/* ATRIBUTOS */
public class Tamagotchi {
	private String nombre;
	private int hambre;
	private Date ultimaVezComer;
	private int energia;
	private Date ultimaVezDormir;
	private int aburrimiento; 
	private Date ultimaVezJugar;
	private int suciedad;      
	private Date ultimaVezBañarse;
	private boolean contento;
	private boolean muerto;
	private boolean vegetariano;	


	/* CONSTRUCTOR, LOS INICIALIZO */
	public Tamagotchi (String nombre,int hambre, int energia, int aburrimiento, int suciedad, boolean contento, boolean muerto) {   
		this.nombre=nombre;
		this.hambre=hambre; 
		this.ultimaVezComer=new Date();
		this.energia=energia;
		this.ultimaVezDormir= new Date();
		this.aburrimiento=aburrimiento;
		this.ultimaVezJugar= new Date();
		this.suciedad=suciedad;
		this.ultimaVezBañarse= new Date();
		this.contento=true;
		this.muerto=false;
	}

	/* ¿ESTÁ CONTENTO? */
	public boolean contento () {
		if(hambre>=100&energia>=100) {
			this.contento=true;
			System.out.println("¡¡Tu Tamagotchi no puede estar más contento!!");
		}
		return contento;
	}

	/* ¿HA MUERTO? */
	public boolean muerto () {
		if(hambre==0&energia==0&&suciedad==0) {
			this.muerto=true;
			System.out.println("Ops...Tu Tamagotchi ha muerto.");
		}
		return muerto;
	}


	/* MÉTODOS PARA LAS ACCIONES CON TU TAMAGOTCHI */

	public void comer(Comida plato) {
		if(vegetariano==true&&!plato.getClass().getName().equals("ComidaVegetariana")) {
			System.out.println("No me lo como!\n -puede que tu compañero sea vegetariano!-\n");	
		}else{
			this.hambre=this.hambre+plato.getCantidadHambre();
			this.ultimaVezComer=new Date();
			System.out.println(" ÑAM ÑAM ÑAM \n");
		}
		/* AL COMER, LA SUCIEDAD DE TU TAMAGOTCHI EMPEORA. */
		this.suciedad=this.suciedad-30;  
		System.out.println("la limpieza de tu Tamagotchi disminuye a -30 por comer...");
	}


	public void dormir(int cantidadHoras) {
		/* CADA HORA QUE DUERME,SUMA 20: 40 DE ENERGIA,DUERME 1H.= *20 DE ENERGIA*/   
		this.energia=this.energia+cantidadHoras*20;       
		this.ultimaVezDormir=new Date();
	}


	public void jugar(int cantidadHoras) {
		/* CADA HORA QUE JUEGA,SUMA,JUEGA 1H.= *20 DE ABURRIMIENTO*/   
		this.aburrimiento=this.aburrimiento+cantidadHoras*20;       
		this.ultimaVezDormir=new Date();
		/* AL JUGAR, LA ENERGIA DE TU TAMAGOTCHI EMPEORA. */
		this.energia=this.energia-20;
		System.out.println("la energia de tu Tamagotchi disminuye a -20 por jugar...");
		/* AL JUGAR, EL HAMBRE DE TU TAMAGOTCHI AUMENTA. */
		this.hambre=this.hambre-30;
		System.out.println("el hambre de tu Tamagotchi disminuye a -30 por jugar...");
	}


	public void bañar(int cantidadMinutos) {
		/* CADA HORA QUE SE BAÑA, ESTÁ MÁS LIMPIO. */
		this.suciedad=this.suciedad+cantidadMinutos*10;
		this.ultimaVezBañarse=new Date();
		/* AL BAÑARSE, LA ENERGIA DE TU TAMAGOTCHI DISMINUYE POR MOMENTO RELAJACIÓN ZEN. */
		this.energia=this.energia-30;
		System.out.println("Qué sueñecito le ha entrado a tu Tamagotchi después del baño! -30 en energía...");
	}


	/* GETTERS AND SETTERS */

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isContento() {
		return contento;
	}
	public void setContento(boolean contento) {
		this.contento = contento;
	}
	public boolean isMuerto() {
		return muerto;
	}
	public void setMuerto(boolean muerto) {
		this.muerto = muerto;
	}
	public int getHambre() {
		return hambre;
	}
	public void setHambre(int hambre) throws Exception {
		this.hambre = hambre;
	}

	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) throws Exception {
		this.energia= energia;
	}

	public int getAburrimiento() {
		return aburrimiento;
	}
	public void setAburrimiento(int aburrimiento) throws Exception {
		this.aburrimiento=aburrimiento;
	}

	public int getSuciedad() {
		return suciedad;
	}
	public void setSuciedad(int suciedad) throws Exception {
		this.suciedad=suciedad;
	}

	public boolean getVegetariano() {
		return this.vegetariano;
	}

	public void setVegetariano(boolean esVeg) {
		this.vegetariano=esVeg;
	}

	/* METODO TOSTRING PARA MOSTRAR EL RESULTADO. */
	public String toString() { 
		return "\nEstado de tu Tamagotchi: \nTengo " +hambre+ " puntos de hambre. Comí por última vez: " +this.ultimaVezComer+ "\n"
				+"Tengo " +energia+ " puntos de energia. Dormí por última vez: " +this.ultimaVezDormir+ "\n"
				+"Tengo " +aburrimiento+ " puntos de aburrimiento. Jugé por última vez: " +this.ultimaVezJugar+ "\n"
				+"Tengo " +suciedad+ " puntos de suciedad. Recogiste las caquitas por última vez: " +this.ultimaVezBañarse+ "\n";
	}







}

