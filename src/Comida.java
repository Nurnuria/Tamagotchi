
/*
 * @class Comida, CLASE DONDE PUEDO CATALOGAR LOS TIPOS DE COMIDA POSIBLES EN MI MAIN.
 * @author Nuria López García
 * @date 2018-05-31
 */


public class Comida { 
	
	/* ATRIBUTOS. */
	private String descripcion; //esto es la descripcion
	private int cantidadHambre;


/* CONSTRUCTOR. */
	public Comida (String descripcion,int cantidadHambre) {
		this.descripcion=descripcion;    
		this.cantidadHambre=cantidadHambre;
	}

  /* GETTERS Y SETTERS. */
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidadHambre() {
		return this.cantidadHambre;
	}

}
