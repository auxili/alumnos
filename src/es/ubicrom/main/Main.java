/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ubicrom.main;

import es.ubicrom.controlador.AlumnoController;
import es.ubicrom.vista.AlumnoVista;
import java.io.IOException;

/**
 *
 * @author KiKe
 */
public class Main {

    public static void main(String[] args) throws IOException {
        AlumnoController miAlumnoController = new AlumnoController();
        AlumnoVista miAlumnoVista = new AlumnoVista();
        miAlumnoVista.arrancaAplicacion();
    }

}
