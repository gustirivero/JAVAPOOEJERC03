/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MAIN;

import SERVICIO.ServicioOperacion;

/**
 *
 * @author Usuario
 */
public class OperacionAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioOperacion so = new ServicioOperacion();
        so.crearOperacion();
        so.sumar();
        so.restar();
        so.multiplicar();
        so.dividir();
        
    }
    
}
