package basic.c01_beginner;

/*
Clase 17 - Ejercicios: Variables y constantes
Vídeo: https://youtu.be/JOAqpdM36wI?t=6732
*/

public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.

        String MyName = "Pedro";

        // 2. Crea una variable de tipo int y asígnale tu edad.

        int MyAge = 21;

        // 3. Crea una variable double con tu altura en metros.

        double MyTall = 1.62;

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.

        boolean ILikeProgramming = true;

        // 5. Declara una constante con tu email.

        final String email = "pedrorome29@gmail.com";

        // 6. Crea una variable de tipo char y guárdale tu inicial.

        char Inicial = 'P';

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.

        String MyLocalidad = "Chichigalpa";
        System.out.println("Mi localidad es: " + "" + MyLocalidad);
        MyLocalidad = "ahora cambio!";
        System.out.println("Mi localidad es: " + "" + MyLocalidad);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.

        int a = 2, b = 3;
        System.out.println("La suma de a y b es " + a+b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.



        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
    }
}
