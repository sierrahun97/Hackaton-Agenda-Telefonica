import java.util.ArrayList;
import java.util.Comparator;


public class Agenda {

    private ArrayList<Contacto> listaContactos;
    private int maxContactos = 10;

    public Agenda() {
        this.listaContactos = new ArrayList<>();
    }

    public Agenda(ArrayList<Contacto> listaContactos, int maxContactos) {
        this.listaContactos = listaContactos;
        this.maxContactos = maxContactos;
    }

    public boolean añadirContacto(Contacto contacto) {
        if (listaContactos.size() >= maxContactos) {
            System.out.println("La agenda está llena, no se pueden agregar más contactos.");
            return false;
        }
        for (Contacto c : listaContactos) {
            if (c.getNombre().equalsIgnoreCase(contacto.getNombre()) && c.getApellido().equalsIgnoreCase(contacto.getApellido())) {
                System.out.println("Error, el contacto: " + contacto.getNombre() + " " + contacto.getApellido()
                        + "," + " ya existe, agrega otro nuevamente. ");
                return false;
            }
        }
        if (contacto.getNombre().isEmpty() || contacto.getApellido().isEmpty()) {
            System.out.println("No se puede añadir, completa todos los campos requeridos");
            return false;
        } else {
            listaContactos.add(contacto);
            System.out.println("Contacto añadido: " + contacto);
            return true;
        }
    }

    public boolean existeContacto(String nombre, String apellido) {
        for (Contacto e : listaContactos) {
            if (e.getNombre().equalsIgnoreCase(nombre) && e.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("El contacto: " + nombre + " " + apellido + ", ya existe");
                return true;
            }
        }
        System.out.println("El contacto no existe");
        return false;
    }

    public void listarContactos() {
        if (listaContactos.isEmpty()) {
            System.out.println("No hay contactos en la agenda.");
            return;
        }
        listaContactos.sort(Comparator.comparing(Contacto::getNombre)
                .thenComparing(Contacto::getApellido));
        int contador = 1;
        for (Contacto c : listaContactos) {
            System.out.println(contador + ". " + c.getNombre() + " " + c.getApellido() + "-->" + c.getTelefono());
            contador++;
        }
    }

    public boolean buscarContacto(String nombre, String apellido) {
        for (Contacto e : listaContactos) {
            if (e.getNombre().equalsIgnoreCase(nombre) && e.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("Información del contacto: " + e.nombre + " " + e.apellido + "-" + e.telefono);
                return true;
            }
        }
        System.out.println("El contacto no existe");
        return false;
    }

    public void eliminarContacto(Contacto contacto) {
        for (Contacto e : listaContactos) {
            if (e.getNombre().equalsIgnoreCase(contacto.getNombre()) && e.getApellido().equalsIgnoreCase(contacto.getApellido())) {
                listaContactos.remove(e);
                System.out.println("El contacto ha sido eliminado correctamente.");
                return;
            }
        }
        System.out.println("El contacto que se intentó eliminar no existe.");
    }

    public void modificarContacto(String nombre, String apellido, int telefono) {
        boolean encontrado = false;
        for (Contacto e : listaContactos) {
            if (e.getNombre().equalsIgnoreCase(nombre) &&
                    e.getApellido().equalsIgnoreCase(apellido)) {
                e.setTelefono(telefono);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El contacto no se ha encontrado: ");
        }
    }

    public void agendaLlena() {
        if (listaContactos.size() >= maxContactos) {
            System.out.println("La agenda está llena, no se pueden agregar más contactos.");
        }
    }
    public void espaciosLibres(){
        System.out.println("Los espacios disponibles en la agenda son: " + (maxContactos - listaContactos.size()) );
    }
}






