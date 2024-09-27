import java.util.Scanner;
import java.util.Stack;

class Libro {
    String titulo;
    String autor;
    String fechaPublicacion;

   
    public Libro(String titulo, String autor, String fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
    }

    
    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Fecha de Publicacion: " + fechaPublicacion;
    }
}

public class Pila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Libro> pilaLibros = new Stack<>();

        while (true) {
            System.out.print("Ingrese el titulo del libro: ");
            String titulo = scanner.nextLine();

            System.out.print("Ingrese el autor del libro: ");
            String autor = scanner.nextLine();

            System.out.print("Ingrese la fecha de publicacion del libro: ");
            String fechaPublicacion = scanner.nextLine();

            
            pilaLibros.push(new Libro(titulo, autor, fechaPublicacion));

            System.out.print(" Desea agregar otro libro? (si/no): ");
            String continuar = scanner.nextLine().toLowerCase();
            if (!continuar.equals("si")) {
                break;
            }
        }

        
        System.out.println("\nPila de libros:");
        while (!pilaLibros.isEmpty()) {
            System.out.println(pilaLibros.pop());
        }

        scanner.close();
    }
}
