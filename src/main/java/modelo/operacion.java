/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juan Carlos
 */
public abstract class operacion {
    
    // Método abstracto que cada operación implementa
    public abstract double calcular(double a, double b) throws ArithmeticException;
    
    // Método para saber si la operación requiere 1 solo número (unaria) o 2 (binaria)
    public boolean esUnaria() {
        return false; // Por defecto casi todas usan 2 números
    }
}