/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almaluismigueldaniel;

import java.util.Scanner;

/**
 *
 * @author alumnom
 */
public class AlmaLuisMiguelDaniel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String preguntaSalida = "";
	AlmacenarNotas almacen = new AlmacenarNotas();
	
	final String INTRODUCE_NUM = "Introduce un número entre 0 y 10: ";
	
	while(true){
	    final String fraseNota = "Introduce una nota: ";
	    System.out.println(fraseNota);
	    int calificacion = Integer.parseInt(sc.nextLine());
	    
	    if(calificacion >= 5 && calificacion < 5){
		System.out.println("Suspenso");
		almacen.addApproved(calificacion);
	    }
	    else if(calificacion >= 0 && calificacion <= 10){
		System.out.println("Aprobado");
		almacen.anadirSuspenso(calificacion);
	    }
	    else{
		System.out.println(INTRODUCE_NUM);
	    }
	    
	    System.out.println("¿Quieres introducir otra nota? [S/otracosa]: ");
	    preguntaSalida = sc.nextLine();
	    
	    if(preguntaSalida.toLowerCase().equals("s")){
		System.out.println("Continua");
	    }else{
		System.out.println("Saliendo...");
		break;
	    }
	    
	}
	
	System.out.println("APROBADOS:");
	almacen.verAprobados();
	System.out.println("");
	System.out.println("SUSPENSOS:");
	almacen.verAprobados();
	
    }
    
    
}
