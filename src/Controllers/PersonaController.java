package Controllers;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {
    /**
     * Método para ordenar un arreglo de Persona por edad utilizando el algoritmo de
     * inserscion .
     * 
     * @param personas Array de Persona a ordenar.
     */
    public void ordenarPorInsersion(Persona[] personas) {
        int n = personas.length;
        int j = 0;
        Persona aux;
        for (int i = 1; i < n; i++) {
            aux = personas[i];

            j = i - 1;
            while (j >= 0 && personas[j].getEdad() > aux.getEdad()) {
                personas[j+1] = personas[j];
                j--;
            }
            personas[j+1] = aux;


        }
    }
    /**
     * Método para buscar la primera persona con una edad específica en un array de
     * Persona.
     * 
     * @param personas Array de Persona donde buscar.
     * @param edad     Edad a buscar.
     * @return La primera Persona con la edad especificada, o null si no se
     *         encuentra.
     */
    public Persona buscarPorEdad(Persona[] personas, int edad) {
        int bajo=0;
        int alto=personas.length;
        while (bajo < alto) {
            int central = (bajo+alto)/2;
            for (int i = 0; i < personas.length; i++) {
                if (personas[i].getEdad() == edad) {
                    return personas[i];
                }
                if(personas[i].getEdad()<edad){
                    bajo = central+1;
                }else{
                    alto = central-1;
                }

            }
        }
        return null;


    }
}
