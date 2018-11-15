import java.util.Date;

/*
 * @class Dinosaurio, CLASE QUE EXTIENDE DE TAMAGOTCHI, DONDE LE ASIGNO LOS VALORES A "DINOSAURIO" MÁS SUS RESPECTIVOS MÉTODOS.
 * @author Nuria López García
 * @date 2018-05-31
 */


public class Dinosaurio extends Tamagotchi {

	/* CONSTRUCTOR. */
	public Dinosaurio(String nombre,int hambre, int energia, int aburrimiento, int suciedad, boolean contento,
			boolean muerto) {
		super(nombre,hambre, energia, aburrimiento, suciedad, contento, muerto);
	
		/* SELECCIONO QUIÉN ES VEGETARIANO Y QUIÉN NO. */
		this.setVegetariano(true);
	}




}
