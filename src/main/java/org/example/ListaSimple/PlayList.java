package org.example.ListaSimple;

import java.util.Comparator;
import java.util.LinkedList;

public class PlayList {

    LinkedList<Nodo> canciones;

    // Constructor
    public Playlist() {
        this.canciones = new LinkedList<>();
    }

    // Método para agregar una canción a la lista de reproducción
    public void agregarCancion(Nodo cancion) {
        this.canciones.add(cancion);
    }

    // Método para eliminar una canción de la lista de reproducción por su nombre
    public void eliminarCancion(String nombre) {
        this.canciones.removeIf(cancion -> cancion.nombre.equals(nombre));
    }

    // Método para insertar una canción en una posición específica
    public void insertarCancion(int indice, Nodo cancion) {
        this.canciones.add(indice, cancion);
    }

    // Método para buscar una canción por su nombre y mostrar su información
    public void buscarCancion(String nombre) {
        for (Nodo cancion : this.canciones) {
            if (cancion.nombre.equals(nombre)) {
                cancion.imprimirDetalles();
                break;
            }
        }
    }

    // Método para ordenar la lista de reproducción por nombre de canción
    public void ordenarPorNombre() {
        this.canciones.sort(Comparator.comparing(cancion -> cancion.nombre));
    }

    // Método para calcular la duración total de la lista de reproducción en minutos y segundos
    public void calcularDuracionTotal() {
        int totalSegundos = this.canciones.stream().mapToInt(cancion -> cancion.duracion).sum();
        int minutos = totalSegundos / 60;
        int segundos = totalSegundos % 60;
        System.out.println("Duración total: " + minutos + " minutos y " + segundos + " segundos");
    }

    // Método para imprimir la lista de reproducción completa en orden de inserción
    public void imprimirPlaylist() {
        this.canciones.forEach(Nodo::imprimirDetalles);
    }
}
