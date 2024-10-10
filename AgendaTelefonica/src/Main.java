import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n*--Menú de agenda de contactos--*");
            System.out.println("\n1. Añadir contacto.");
            System.out.println("2. Mostrar lista de contactos.");
            System.out.println("3. Buscar contacto.");
            System.out.println("4. Eliminar contacto.");
            System.out.println("5. Modificar teléfono de contacto.");
            System.out.println("6. Espacio disponible en la agenda de contactos.");
            System.out.println("7. Finalizar menú.");
            System.out.println("\nIngresa un número para acceder al menú:");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el nombre de contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingresa el apellido de contacto: ");
                    String apellido = scanner.nextLine();
                    System.out.println("Ingresa el telefono de contacto: ");
                    int telefono = scanner.nextInt();
                    Contacto contacto = new Contacto(nombre, apellido, telefono);
                    agenda.añadirContacto(contacto);
                    break;

                case 2:
                    agenda.listarContactos();
                    break;

                case 3:
                    System.out.println("Ingresa el nombre del contacto que deseas buscar: ");
                    nombre = scanner.nextLine();
                    System.out.println("Ingresa el apellido del contacto que deseas buscar: ");
                    apellido = scanner.nextLine();
                    agenda.buscarContacto(nombre, apellido);
                    break;

                case 4:
                    System.out.println("Ingresa el nombre del contacto que deseas eliminar: ");
                    nombre = scanner.nextLine();
                    System.out.println("Ingresa el apellido del contacto que deseas eliminar: ");
                    apellido = scanner.nextLine();
                    System.out.println("Ingresa el teléfono del contacto que deseas eliminar");
                    telefono = scanner.nextInt();
                    agenda.eliminarContacto(new Contacto(nombre, apellido, telefono));
                    break;

                case 5:
                    System.out.println("Ingresa el nombre del contacto que deseas modificar: ");
                    nombre = scanner.nextLine();
                    System.out.println("Ingresa el apellido del contacto que deseas modificar: ");
                    apellido = scanner.nextLine();
                    System.out.println("Ingresa el nuevo teléfono del contacto que deseas modificar");
                    telefono = scanner.nextInt();
                    agenda.modificarContacto(nombre, apellido, telefono);
                    break;

                case 6:
                    agenda.espaciosLibres();
                    break;

                case 7:
                    System.out.println("Menú finalizado.");
                    break;

                default:
                    System.out.println("Opción no válida, ingresa un número del menú");
            }
        } while (opcion != 7);
    }
}
