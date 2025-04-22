package Views;

import Models.Persona;

import java.util.Scanner;

public class ViewConsole {
    public void printPersona(Persona [] persona) {
        for (int i = 0; i < persona.length; i++) {
            System.out.println(persona[i]);
        }
    }
    public void prinrMessage(String mensaje) {
        System.out.println(mensaje);
    }
    public int getEdad(){
        Scanner scanner = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad: ");
        edad = scanner.nextInt();
        return edad;
    }
}
