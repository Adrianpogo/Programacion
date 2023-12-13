package juegosT1;

import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {
        // Palabra secreta
        String palabraSecreta = "programacion";
        int intentosMaximos = 6;
        char[] palabraAdivinada = new char[palabraSecreta.length()];

        for (int i = 0; i < palabraAdivinada.length; i++) {
            palabraAdivinada[i] = '_';
        }

        int intentos = 0;
        Scanner scanner = new Scanner(System.in);

        while (intentos < intentosMaximos) {
            System.out.println("Palabra adivinada: " + String.valueOf(palabraAdivinada));
            System.out.println("Intentos restantes: " + (intentosMaximos - intentos));

            char letra = obtenerLetra(scanner);

            boolean letraAdivinada = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    palabraAdivinada[i] = letra;
                    letraAdivinada = true;
                }
            }

            if (!letraAdivinada) {
                intentos++;
                System.out.println("Letra incorrecta. Intenta de nuevo.");
            }

            if (String.valueOf(palabraAdivinada).equals(palabraSecreta)) {
                System.out.println("¡Felicidades! Has adivinado la palabra secreta: " + palabraSecreta);
                break;
            }
        }

        if (intentos == intentosMaximos) {
            System.out.println("Agotaste tus intentos. La palabra secreta era: " + palabraSecreta);
        }
    }

    public static char obtenerLetra(Scanner scanner) {
        char letra = '\0'; // Inicializamos a un valor nulo
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Ingresa una letra: ");
            try {
                String input = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para simplificar la comparación
                if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                    letra = input.charAt(0);
                    entradaValida = true;
                } else {
                    System.out.println("Por favor, ingresa una única letra válida.");
                }
            } catch (Exception e) {
                System.err.println("Error al leer la entrada. Intenta de nuevo.");
                scanner.next(); // Limpiar el búfer
            }
        }
        return letra;
    }
}
