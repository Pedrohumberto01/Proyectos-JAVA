package basic.c05_structures;

/*
Clase 44 - Ejercicios: Estructuras
Vídeo: https://youtu.be/JOAqpdM36wI?t=15680
*/

import java.util.ArrayList;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.

        int[] array = new int[5];
        System.out.println(array.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.

        System.out.println(array[1]);

        array[1] = 3;

        System.out.println(array[1]);
        // 3. Crea un ArrayList vacío.

        ArrayList<String> lista = new ArrayList<>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.

        lista.add("primero");
        lista.add("Segundo");
        lista.add("Tercero");
        lista.add("Cuarto");

        System.out.println(lista);

        lista.remove(2);

        System.out.println(lista);
        // 5. Crea un HashSet con 2 valores diferentes.

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.

        // 7. Elimina uno de los elementos del HashSet.

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.

        // 9. Modifica uno de los contactos y elimina otro.

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
    }
}
