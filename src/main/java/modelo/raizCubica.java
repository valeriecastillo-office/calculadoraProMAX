/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class raizCubica extends operacion {
    @Override
    public double calcular(double a, double b) {
        return Math.cbrt(a);
    }

    @Override
    public boolean esUnaria() {
        return true;
    }
}