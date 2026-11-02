import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mascota> listaMascotas = new ArrayList<>();
        int opcion = 0;

        do {
            System.out.println("   SISTEMA DE GESTIÓN - VETERINARIA JAVA   ");
            System.out.println("1. Registrar un perro");
            System.out.println("2. Registrar un gato");
            System.out.println("3. Mostrar todas las mascotas registradas");
            System.out.println("4. Salir del programa");
            System.out.print("Seleccione una opción (1-4): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println(" REGISTRO DE NUEVO PERRO ");
                    System.out.print("Ingrese el nombre del perro: ");
                    String nombrePerro = scanner.nextLine();

                    System.out.print("Ingrese la edad del perro: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Ingrese un número válido para la edad.");
                        scanner.next();
                    }
                    int edadPerro = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese la raza del perro: ");
                    String razaPerro = scanner.nextLine();

                    Perro nuevoPerro = new Perro(nombrePerro, edadPerro, razaPerro);
                    listaMascotas.add(nuevoPerro);
                    System.out.println("¡Perro registrado exitosamente!");
                    break;

                case 2:
                    System.out.println(" REGISTRO DE NUEVO GATO ");
                    System.out.print("Ingrese el nombre del gato: ");
                    String nombreGato = scanner.nextLine();

                    System.out.print("Ingrese la edad del gato: ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Ingrese un número válido para la edad.");
                        scanner.next();
                    }
                    int edadGato = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el color del gato: ");
                    String colorGato = scanner.nextLine();

                    Gato nuevoGato = new Gato(nombreGato, edadGato, colorGato);
                    listaMascotas.add(nuevoGato);
                    System.out.println("¡Gato registrado exitosamente!");
                    break;

                case 3:
                    System.out.println(" LISTA DE MASCOTAS REGISTRADAS ");
                    if (listaMascotas.isEmpty()) {
                        System.out.println("No hay mascotas registradas en el sistema todavía.");
                    } else {
                        for (int i = 0; i < listaMascotas.size(); i++) {
                            System.out.println("Mascota " + (i + 1));
                            Mascota Mascota = listaMascotas.get(i);
                            Mascota.mostrarInformation();
                            System.out.print("Sonido: ");
                            Mascota.emitterSonido();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del sistema de la veterinaria. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, elija un número entre 1 y 4.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}