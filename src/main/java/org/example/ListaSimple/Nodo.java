package org.example.ListaSimple;

public class Nodo {

    String nombre;
    String artista;
    String genero;
    int duracion; // en segundos

    // Constructor
    public Nodo(String nombre, String artista, String genero, int duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
    }

    // Método para imprimir los detalles de la canción
    public void imprimirDetalles() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Artista: " + this.artista);
        System.out.println("Género: " + this.genero);
        System.out.println("Duración: " + this.duracion + " segundos");
    }

}
