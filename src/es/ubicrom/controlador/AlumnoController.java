/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ubicrom.controlador;

import es.ubicrom.modelo.bll.AlumnoBLL;
import es.ubicrom.vista.AlumnoVista;

/**
 *
 * @author KiKe
 */
public class AlumnoController {

    private AlumnoBLL miAlumnoBLL;
    private AlumnoVista miAlumnoVista;

    public AlumnoController() {
        super();
    }

    /**
     * @return the miAlumnoBLL
     */
    public AlumnoBLL getMiAlumnoBLL() {
        return miAlumnoBLL;
    }

    /**
     * @param miAlumnoBLL the miAlumnoBLL to set
     */
    public void setMiAlumnoBLL(AlumnoBLL miAlumnoBLL) {
        this.miAlumnoBLL = miAlumnoBLL;
    }

    /**
     * @return the miAlumnoVista
     */
    public AlumnoVista getMiAlumnoVista() {
        return miAlumnoVista;
    }

    /**
     * @param miAlumnoVista the miAlumnoVista to set
     */
    public void setMiAlumnoVista(AlumnoVista miAlumnoVista) {
        this.miAlumnoVista = miAlumnoVista;
    }

}
