import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Usuario[] usuarios = crearUsuarios(3); // Cambia 3 por el número que desees
        mostrarUsuarios(usuarios);
    }

    public static Usuario[] crearUsuarios(int cantidad) {
        Scanner scanner = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce el nombre del usuario " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            System.out.println("Introduce los apellidos del usuario " + (i + 1) + ": ");
            String apellidos = scanner.nextLine();
            System.out.println("Introduce el email del usuario " + (i + 1) + ": ");
            String email = scanner.nextLine();

            usuarios[i] = new Usuario(nombre, apellidos, email);
        }
        return usuarios;
    }

    public static void mostrarUsuarios(Usuario[] usuarios) {
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Apellidos: " + usuario.apellidos);
            System.out.println("Email: " + usuario.email);
            System.out.println();
        }
    }
}

