

/*
 * @class Gato, CLASE QUE EXTIENDE DE TAMAGOTCHI, DONDE LE ASIGNO LOS VALORES A "GATO".
 * @author Nuria López García
 * @date 2018-05-31
 */


public class Gato extends Tamagotchi{
	
	/* CONSTRUCTOR. */
	Gato(String nombre,int hambre, int energia, int aburrimiento, int suciedad, boolean contento,
			boolean muerto) {
		super(nombre,hambre, energia, aburrimiento, suciedad, contento, muerto);
	
		/* SELECCIONO QUIÉN ES VEGETARIANO Y QUIÉN NO. */
		this.setVegetariano(false);
	}



}
