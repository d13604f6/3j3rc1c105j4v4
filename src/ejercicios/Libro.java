/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    
    // Constructor con todos los atributos pasados por parámetro
    public Libro(String isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    // Constructor vacío
    public Libro() {
    }
    
    // Método para cargar un libro pidiendo los datos al usuario
    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ISBN: ");
        isbn = scanner.nextLine();
        
        System.out.print("Título: ");
        titulo = scanner.nextLine();
        
        System.out.print("Autor: ");
        autor = scanner.nextLine();
        
        System.out.print("Número de páginas: ");
        numeroPaginas = scanner.nextInt();
    }
    
    // Método para informar los datos del libro
    public void informarLibro() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
    
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.cargarLibro();
        System.out.println();
        libro.informarLibro();
    }
}
