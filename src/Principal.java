import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<PersonaImpl> listaPersonas = new ArrayList<>();
        listaPersonas.add(new PersonaImpl("Juan", "Pérez", 30));
        listaPersonas.add(new PersonaImpl("Ana", "Gómez", 25));
        String nombreBuscado = "Juan";
        for (PersonaImpl persona : listaPersonas) {
            if (persona.getNombre().equals(nombreBuscado)) {
                System.out.println(persona.getNombre() + " " + persona.getApellido() + ", " + persona.getEdad() + " años");
                break;
            }
        }
        int nuevaEdad = 31;
        for (PersonaImpl persona : listaPersonas) {
            if (persona.getNombre().equals(nombreBuscado)) {
                persona.setEdad(nuevaEdad);
                System.out.println("La edad de " + persona.getNombre() + " ha sido actualizada a " + persona.getEdad());
                break;
            }
        }
        String nombreEliminar = "Ana";
        listaPersonas.removeIf(persona -> persona.getNombre().equals(nombreEliminar));
        System.out.println("La persona con el nombre " + nombreEliminar + " ha sido eliminada de la lista.");


        System.out.println("Lista de personas:");
        for (PersonaImpl persona : listaPersonas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido() + ", " + persona.getEdad() + " años");
        }
    }
}