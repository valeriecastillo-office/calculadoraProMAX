/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Juan Carlos
 */
import javax.swing.JOptionPane;
import modelo.*;

public class controlador {

    //  
    public static operacion crearOperacion(String tipo) {
        switch (tipo.toLowerCase()) {
            case "sumar":
            case "+":
                return new suma();
            case "restar":
            case "-":
                return new resta();
            case "multiplicar":
            case "*":
                return new multiplicacion();
            case "dividir":
            case "/":
                return new division();
            case "raiz2":
            case "√":
                return new raizCuadrada();
            case "raiz3":
            case "∛":
                return new raizCubica();
            case "ln":
                return new logaritmoNatural();
            default:
                return null;
        }
    }

    // Ejecuta el cálculo atrapando errores de validación
    public static void procesarCalculo(String tipoOperacion, double num1, double num2) {
        try {
            operacion op = crearOperacion(tipoOperacion);

            if (op == null) {
                JOptionPane.showMessageDialog(null, "Operación no válida.");
                return;
            }

            double resultado = op.calcular(num1, num2);
            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);

        } catch (ArithmeticException ex) {
            // Muestra mensaje claro si hay división entre 0, raíz de negativo, etc.
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado al calcular.");
        }
    }
}
