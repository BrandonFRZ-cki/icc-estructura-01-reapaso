
import Controllers.PersonaController;
import Models.Persona;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26),
        };

        /*
        * Imprimoir Arreglo
        * ordenar
        * imprimir el arreglo ordenado
        * buscar edad 40
        * Imprimir Resultado
        * Buscar edad 90
        * Imprimir Resultado
        * */

        ViewConsole view = new ViewConsole();
        view.printPersona(personas);

        PersonaController personaController = new PersonaController();
        personaController.ordenarPorInsersion(personas);
        view.prinrMessage("\n--- Se ha ordenado las personas\n");
        view.printPersona(personas);

        Persona persona = personaController.buscarPorEdad(personas,40);
        if (persona == null) {
            view.prinrMessage("No se ha encontrado la persona\n");
        }else{
            view.prinrMessage("\n------- \nPersona Encontrada");
            System.out.println(persona);
        }
        Persona persona2 = personaController.buscarPorEdad(personas,99);
        if (persona2 == null) {
            view.prinrMessage("\n------- \nNo se ha encontrado la persona con edad de " + 99 );
        }else{
            view.prinrMessage("\nPersona Encontrada");
            System.out.println(persona);
        }


    }
}
