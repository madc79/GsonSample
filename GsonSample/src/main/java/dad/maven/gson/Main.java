package dad.maven.gson;

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el nombre:");
        String nombre = scanner.nextLine();
        
        System.out.println("Introduce los apellidos:");
        String apellidos = scanner.nextLine();
        
        System.out.println("Introduce la edad:");
        int edad = Integer.parseInt(scanner.nextLine());

        // Crear una instancia de Persona y almacenar los datos
        Persona p = new Persona();
        p.setNombre(nombre);
        p.setApellidos(apellidos);
        p.setEdad(edad);

        // Convertir la instancia de Persona a JSON y mostrarlo en la consola
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(p);
        System.out.println(json);

        // Cerrar el scanner
        scanner.close();
    }
}

