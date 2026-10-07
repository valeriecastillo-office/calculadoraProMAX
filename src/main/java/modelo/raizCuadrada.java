/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class raizCuadrada extends operacion {
    @Override
    public double calcular(double a, double b) {
        if (a < 0) {
            throw new ArithmeticException("No existe raíz cuadrada de números negativos.");
        }
        return Math.sqrt(a);
    }

    @Override
    public boolean esUnaria() {
        return true; // Solo usa un número (a)
    }
}