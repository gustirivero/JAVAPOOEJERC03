/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVICIO;

import ENTINDAD.Operacion;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ServicioOperacion {


    Scanner leer = new Scanner(System.in);
    Operacion op = new Operacion();

    public Operacion crearOperacion() {
        System.out.println("Ingrese el primer numero");
        op.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo numero");
        op.setNumero2(leer.nextInt());
        return op;
    }

    public int sumar() {
        int sumar;
        sumar = op.getNumero1() + op.getNumero2();
        System.out.println("la suma es: " + sumar);
    return sumar;
    }

    public int restar() {
        int restar;
        restar = op.getNumero1() - op.getNumero2();
        System.out.println("la resta es " + restar);
        return restar;
    }

    public void multiplicar() {
        int multiplicar;

        if (op.getNumero1() == 0 || op.getNumero2() == 0) {
            multiplicar = op.getNumero1() * op.getNumero2();
            System.out.println("ERROR no se puede multiplicar por: " + multiplicar);
        } else {
            multiplicar = op.getNumero1() * op.getNumero2();
            System.out.println("la multiplicacione es:" + multiplicar);
        }
       
    }

    public void dividir() {
        int dividir;
         try {
        dividir = op.getNumero1() / op.getNumero2();
        System.out.println("la division es: " + dividir);
        } catch (ArithmeticException e) {
        System.out.println("No se puede dividir por cero. Por favor ingrese un divisor distinto de cero.");
        }

    }
    
}


