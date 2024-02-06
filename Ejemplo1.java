import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int cantidadUsuarios = scanner.nextInt();
        Usuario[] usuarios = crearUsuarios(cantidadUsuarios);
        System.out.println("Los usuarios ingresados son:");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.nombre + ", Apellidos: " + usuario.apellidos + ", Email: " + usuario.email);
        }
        scanner.close();
    }

    public static Usuario[] crearUsuarios(int cantidad) {
        Scanner scanner = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del usuario " + (i + 1) + ":");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese los apellidos del usuario " + (i + 1) + ":");
            String apellidos = scanner.nextLine();
            System.out.println("Ingrese el email del usuario " + (i + 1) + ":");
            String email = scanner.nextLine();
            usuarios[i] = new Usuario(nombre, apellidos, email);
        }
        scanner.close();
        return usuarios;
    }
}
