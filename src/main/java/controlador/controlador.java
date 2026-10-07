/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Juan Carlos
 */

import modelo.*;

public class controlador {

   public static operacion crearOperacion(String tipo) {
        switch (tipo) {
            case "+": return new suma();
            case "-": return new resta();
            case "*": return new multiplicacion();
            case "/": return new division();
            case "raiz2": return new raizCuadrada();
            case "raiz3": return new raizCubica();
            case "ln": return new logaritmoNatural();
            default: return null;
        }
    }

    // Ahora devuelve un String en lugar de abrir la ventanita
    public static String procesarCalculo(String tipoOperacion, double num1, double num2) {
        try {
            operacion op = crearOperacion(tipoOperacion);
            
            if (op == null) {
                return "Operación no válida";
            }

            double resultado = op.calcular(num1, num2);
            return String.valueOf(resultado); // Devuelve el número como texto

        } catch (ArithmeticException ex) {
            return "Error: " + ex.getMessage();
        } catch (Exception ex) {
            return "Error al calcular";
        }
    }
}
