


/*
 * @class EstrellaDeMar, CLASE QUE EXTIENDE DE TAMAGOTCHI, DONDE LE ASIGNO LOS VALORES A "ESTRELLADEMAR".
 * @author Nuria López García
 * @date 2018-05-31
 */


public class EstrellaDeMar extends Tamagotchi{
	
	/* CONSTRUCTOR. */
	public EstrellaDeMar(String nombre,int hambre, int energia, int aburrimiento, int suciedad, boolean contento,
			boolean muerto) {
		super(nombre,hambre, energia, aburrimiento, suciedad, contento, muerto);
		
		/* SELECCIONO QUIÉN ES VEGETARIANO Y QUIÉN NO. */
		this.setVegetariano(true);
	}

}
