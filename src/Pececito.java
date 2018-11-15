import java.util.Date;

/*
 * @class Pececito, CLASE QUE EXTIENDE DE TAMAGOTCHI, DONDE LE ASIGNO LOS VALORES A "PECECITO".
 * @author Nuria López García
 * @date 2018-05-31
 */

public class Pececito extends Tamagotchi{
	/* CONSTRUCTOR. */
	public Pececito(String nombre, int hambre, int energia, int aburrimiento, int suciedad, boolean contento,
			boolean muerto) {
		super(nombre, hambre, energia, aburrimiento, suciedad, contento, muerto);

		/* SELECCIONO QUIÉN ES VEGETARIANO Y QUIÉN NO. */
		this.setVegetariano(true);
	}


}
