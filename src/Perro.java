import java.util.Date;

/*
 * @class Perro, CLASE QUE EXTIENDE DE TAMAGOTCHI, DONDE LE ASIGNO LOS VALORES A "PERRO" MÁS SUS RESPECTIVOS MÉTODOS.
 * @author Nuria López García
 * @date 2018-05-31
 */

public class Perro extends Tamagotchi{

	/* ATRIBUTOS. */
	private int paseo;
	private Date ultimaVezPaseo;

	/* CONSTRUCTOR. */
	public Perro(String nombre,int hambre, int energia, int aburrimiento, int suciedad, int paseo, boolean contento,
			boolean muerto) {
		super(nombre,hambre, energia, aburrimiento, suciedad, contento, muerto);
		this.paseo=paseo;

		/* SELECCIONO QUIÉN ES VEGETARIANO Y QUIÉN NO. */
		this.setVegetariano(false);

	}

	/* METODO PASEO */
	public void pasear(int pasear) {    
		this.paseo=this.paseo+pasear*30;
		this.ultimaVezPaseo=new Date();
	}


	/* GETTERS Y SETTERS */
	public int getPaseo() {
		return paseo;
	}
	public void setPaseo(int paseo) throws Exception {
		this.paseo=paseo;
	}

	public Date getUltimaVezPaseo() {
		return ultimaVezPaseo;
	}


	public void setUltimaVezPaseo(Date ultimaVezPaseo) {
		this.ultimaVezPaseo = ultimaVezPaseo;
	}


	/* METODO TOSTRING. */
	public String toString() {
		return super.toString()+"Tengo " +paseo+ " puntos de paseo. Mi último paseo fue: " +this.ultimaVezPaseo+ "\n";
	}

}
