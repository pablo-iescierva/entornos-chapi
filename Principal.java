import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        // Llamar al método que muestra la fecha y hora actual
        mostrarFechaHoraActual();
    }

    public static void mostrarFechaHoraActual() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaHoraFormateada = fechaHoraActual.format(formato);
        System.out.println("Fecha y hora actual: " + fechaHoraFormateada);
    }
}

