/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.ubicrom.vista;

import es.ubicrom.controlador.AlumnoController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author KiKe
 */
public class AlumnoVista {
    private AlumnoController miAlumnoController;

    /**
     * @return the miAlumnoController
     */
    
    //ESTE NO SALE EN EL EJEMPLO DE CLASE, PORQUE?
    public AlumnoController getMiAlumnoController() {
        return miAlumnoController;
    }

    /**
     * @param miAlumnoController the miAlumnoController to set
     */
    public void setMiAlumnoController(AlumnoController miAlumnoController) {
        this.miAlumnoController = miAlumnoController;
    }
    public void arrancaAplicacion() throws IOException{
        int opcion = -1;

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        while (opcion != 6){
            mostrarMenu();
            opcion = Integer.parseInt(stdin.readLine());
            if (opcion == 1){
            }else if(opcion==2){
            }else if(opcion==3){
            }else if(opcion==4){
            }else if(opcion==5){
            }else if(opcion==6){
            }
        }
    }
	
    private static void mostrarMenu(){
        System.out.println("1.- ");
        System.out.println("2.- ");
        System.out.println("3.- ");
        System.out.println("4.- ");
        System.out.println("5.- ");
        System.out.println("6.- ");
    }
    
}
