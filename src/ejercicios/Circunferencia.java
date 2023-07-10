/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author d1360
 */
import java.util.Scanner;

public class Circunferencia {
    private double radio;
    
    // Método constructor que inicializa el radio pasado como parámetro
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    // Métodos getter y setter para el atributo radio
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    // Método para crear una Circunferencia pidiendo el radio al usuario
    public void crearCircunferencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        radio = scanner.nextDouble();
    }
    
    // Método para calcular el área de la circunferencia
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    // Método para calcular el perímetro de la circunferencia
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
    
    public static void main(String[] args) {
        Circunferencia circunferencia = new Circunferencia(0); // Creamos un objeto Circunferencia
        
        circunferencia.crearCircunferencia(); // Pedimos al usuario el radio de la circunferencia
        
        System.out.println("Área de la circunferencia: " + circunferencia.area());
        System.out.println("Perímetro de la circunferencia: " + circunferencia.perimetro());
    }
}
