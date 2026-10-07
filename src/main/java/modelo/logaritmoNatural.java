/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juan Carlos
 */
public class logaritmoNatural extends operacion {
    @Override
    public double calcular(double a, double b) {
        if (a <= 0) {
            throw new ArithmeticException("El logaritmo natural requiere números mayores a cero.");
        }
        return Math.log(a);
    }

    @Override
    public boolean esUnaria() {
        return true;
    }
}