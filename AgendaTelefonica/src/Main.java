public class Main {
    public static void main(String[] args) {

    Agenda agenda = new Agenda();
    Contacto contacto1 = new Contacto("Aleja", "Urrea",12345);
    Contacto contacto2 = new Contacto("Juan", "Sierra",12345);
    Contacto contacto3 = new Contacto("Christian", "Jimenez",4567);
    Contacto contacto4 = new Contacto("Ana", "Alvarado",9876);


    agenda.añadirContacto(contacto1);
    agenda.añadirContacto(contacto2);
    agenda.añadirContacto(contacto3);
    agenda.añadirContacto(contacto4);


        agenda.existeContacto("Christian","Jimenez");
        agenda.buscarContacto("Aleja", "Urrea");
        agenda.eliminarContacto(new Contacto("Ana","Alvarado", 9876));
        agenda.listarContactos();

        System.out.println(agenda);
    }

}
