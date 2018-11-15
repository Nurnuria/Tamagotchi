
import java.util.HashMap;
import java.util.Scanner;

import Interfaz.VentanaPrincipal;

public class Main {

	public static void main(String[] args) {

		/*NTERFAZ DEL PROGRAMA.
		VentanaPrincipal ventana= new VentanaPrincipal();
		ventana.setVisible(true);
		 


		EMPIEZA EL JUEGO ELIGIENDO EL TIPO DE COMPAÑERO QUE QUIERES TENER 
		/* AQUI, TAMBIÉN, COMPRUEBO SI EXISTE YA TU TAMAGOTCHI EN LA BASE DE DATOS Y SINO, CREA UNO NUEVO. */
		Juego tama1=new Juego();            
		tama1.seleccion();  
		tama1.Conexion();


		/* CREACION DE LAS COMIDAS POSIBLES */
		HashMap<String,Comida> comidasPosibles= new HashMap <> ();
		comidasPosibles.put("fileton", new Comida("fileton",30));
		comidasPosibles.put("albondigas", new Comida("patatitas",15));
		comidasPosibles.put("pizza", new Comida("pizza",20));
		comidasPosibles.put("calabacin", new ComidaVegetariana("calabacin",30));
		comidasPosibles.put("ensalada", new ComidaVegetariana("ensalada",15));
		comidasPosibles.put("lechuga", new ComidaVegetariana("patatitas",20));


		/* MIENTRAS QUE NO SEA UNA DE LAS OPCIONES SIGUE PREGUNTANDO QUÉ QUIERES HACER. */
		String accion="";

		while(!accion.equals("salir")) {
			accion="";
			System.out.println(tama1.getTamagotchi()); 

			/* MIENTRAS QUE NO SELECCIONE "SALIR" PERMANECERÁ EN EL JUEGO PREGUNTANDO QUÉ QUIERES HACER. */
			while(!accion.equals("comer")&&!accion.equals("dormir")&&!accion.equals("jugar")&&!accion.equals("bañar")&&!accion.equals("pasear")&&!accion.equals("salir")) {   

				/* PIDE AL USUARIO QUE INGRESE LA ACCION QUE QUIERE REALIZAR CON SU TAMAGOTCHI. */
				System.out.print("¿Qué quieres hacer?: \n ¿?¿ comer, dormir, jugar, bañar, ");
				/* SEGÚN LA CLASE EN LA QUE ESTÉ, EN ESTE CASO DEBE SER SÓLO EN LA CLASE PERRO PARA ASÍ PODER HACER EL METODO "PASEAR". */
				if(tama1.getTamagotchi().getClass().getName().equals("Perro")) {
					System.out.print("pasear ");				
				}
				/* SI SELECCIONA LA OPCION "SALIR" SALDRÁ DEL JUEGO FINALMENTE. */
				System.out.println("salir ?¿? ");
				Scanner entradaEscaner = new Scanner (System.in);       
				accion = entradaEscaner.nextLine ();
				System.out.println ("Has elegido: " + accion + ". \n");    	


				/* SEGÚN LA OPCIÓN QUE INGRESE, HARÁ UN MÉTODO U OTRO. */
				if (accion.equals("comer")) {
					String plato="";
					/* MIENTRAS QUE NO SEA UNO DE ESTOS PLATOS, VOLVERÁ A PEDIRLO POR PANTALLA. */
					while(!plato.equals("fileton")&&!plato.equals("albondigas")&&!plato.equals("pizza")&&!plato.equals("calabacin")&&!plato.equals("ensalada")&&!plato.equals("lechuga")) {  
					System.out.println("¿Y qué quieres darle de comer?: \n ¿?¿ fileton, albondigas, pizza ?¿? "
							+ "\n Opciones vegetarianas: \n ¿?¿ Calabacin, ensalada y lechuga ?¿?");
					/* CREO UN SCANNER PARA INGRESAR LA OPCION DEL USUARIO. */
					Scanner entrada = new Scanner (System.in);                
					plato = entrada.nextLine (); 
					}
					/* MUESTRO LO INTRODUCIDO. */
					System.out.println ("Has elegido: " + plato + "");        
					tama1.getTamagotchi().comer(comidasPosibles.get(plato));   
					System.out.println("Mi estado de hambre es: "+tama1.getTamagotchi().getHambre()+ "\n");

					/* SI DESPUES DE LA ACCION COMER ESTÁ CONTENTO LO MUESTRA. */
					tama1.getTamagotchi().contento(); 
					/* EN CASO DE QUE NO ESTÉS CUIDANDO DE TU COMPAÑERO CORRECTAMENTE, MORIRÁ. */
					tama1.getTamagotchi().muerto();
				}


				if (accion.equals("dormir")) {
					System.out.println("¿Y cuántas horas quieres dormir?");
					int descanso;
					Scanner entrada = new Scanner (System.in);              
					descanso = entrada.nextInt(); 
					System.out.println ("Has elegido dormir: " + descanso + " hora/s.\n¡Buenas noches! \nzZzZzZ");     
					tama1.getTamagotchi().dormir(descanso);
					System.out.println("Mi estado de energia es "+tama1.getTamagotchi().getEnergia());

					tama1.getTamagotchi().contento(); 
					tama1.getTamagotchi().muerto();
				}

				/* ACERTIJOS */
				if (accion.equals("jugar")) {
					System.out.println("¿Y cuántos minutos quieres jugar?");
					int juego;
					Scanner entrada = new Scanner (System.in);               
					juego = entrada.nextInt(); 

					System.out.println ("Has elegido jugar: " + juego + " minuto/s con tu Tamagotchi! \n"
							+ "Si tú eres yo...¿Quién soy yo? \n"
							+ "...tic tac");     
					String respuesta1="";
					Scanner acertijo1 = new Scanner (System.in);                
					respuesta1= acertijo1.nextLine(); 
					System.out.println("RESPUESTA = YO.");

					System.out.println("Si tengo 5 vacas, voy a vender 2, y me regalan 3 ¿Cuántas vacas tengo?");
					String respuesta2="";
					Scanner acertijo2 = new Scanner (System.in);          
					respuesta2= acertijo2.nextLine(); 
					System.out.println("RESPUESTA = Tengo 8, porque todavía no he vendido las 2.");

					System.out.println("¿Cuántos meses del año tienen 28 días?");
					String respuesta3="";
					Scanner acertijo3 = new Scanner (System.in);          
					respuesta2= acertijo2.nextLine(); 
					System.out.println("RESPUESTA = Todos.");


					System.out.println("¿Por qué el tomate no toma café?");
					String respuesta4="";
					Scanner acertijo4 = new Scanner (System.in);          
					respuesta3= acertijo3.nextLine(); 
					System.out.println("RESPUESTA = Porque toma-té.\n");

					tama1.getTamagotchi().jugar(juego);
					System.out.println("¿Cuánto de entretenido estoy? "+tama1.getTamagotchi().getAburrimiento());

					tama1.getTamagotchi().contento(); 
					tama1.getTamagotchi().muerto();
				}


				if(accion.equals("bañar")) {
					System.out.println("¿Y cuántos minutos quieres que se bañe tu Tamagotchi? ");
					int baño;
					Scanner entrada = new Scanner (System.in);              
					baño = entrada.nextInt(); 
					System.out.println ("Has elegido bañar a tu Tamagotchi durante: " + baño + " minuto/s. ");
					tama1.getTamagotchi().bañar(baño);
					System.out.println("¿Cómo está tu tamagotchi de impecable?: "+tama1.getTamagotchi().getSuciedad()+"\n");

					tama1.getTamagotchi().contento(); 
					tama1.getTamagotchi().muerto();
				}


				if(accion.equals("pasear")) {
					System.out.println("¿Y cuántos minutos quieres que pasear a tu Tamagotchi? ");
					int pasear;
					Scanner entrada = new Scanner (System.in);              
					pasear = entrada.nextInt(); 
					System.out.println ("Has elegido pasear a tu Tamagotchi durante: " + pasear + " minuto/s. \n \n"
							+ "╥━━━━━━━━╭━━╮━━\n" + 
							"╢╭╮╭━━━━━┫┃▋▋━▅\n" + 
							"╢┃╰┫┈┈┈┈┈┃┃┈┈╰┫     ¡No puede estar mas contento! \n" + 
							"╢╰━┫┈┈┈┈┈╰╯╰┳━╯\n" + 
							"╢┊┊┃┏┳┳━━┓┏┳┫┊┊\n" + 
							"╨━━┗┛┗┛━━┗┛┗┛━━\n" + 
							"");
					((Perro)tama1.getTamagotchi()).pasear(pasear);
					//tama1.getTamagotchi().muerto();
				}

			}
		}

		System.out.println("¡NOS VEMOS PRONTO!\n  (っ◕‿◕)っ♥ \n\n HAS SALIDO.");
	}
}
