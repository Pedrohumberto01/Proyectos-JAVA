package basic.c04_conditionals;

/*
Clase 38 - Ejercicios: Condicionales
Vídeo: https://youtu.be/JOAqpdM36wI?t=11021
*/

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).

        int edad = 17;

        if(edad >= 18){
            System.out.println("Puede votar");
        }else{
            System.out.println("No puede votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.

        int a = 3;
        int b = 3;

        if (a == b){
            System.out.println("Son Iguales");
        } else if  (a > b) {
            System.out.println("a es mayor");
        }else {
            System.out.println("b es mayor");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.

        int n = -56;

        if (n == 0){
            System.out.println("El numero es cero");
        } else if (n < 0) {
            System.out.println("El numero es negativo");
        }else {
            System.out.println("El numero es positivo");
        }

        // 4. Crea un programa que diga si un número es par o impar.

        int verificar = 87;

        if(verificar % 2 == 0){
            System.out.println("El numero es par");
        } else if (verificar % 2 == 1) {
            System.out.println("El numero es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.

        int rango = 986;

        if (rango >= 1 && rango <= 100){
            System.out.println("El numero esta en rango entre 1 y 100");
        }else {
            System.out.println("Fuera de rango");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

        int dia = 5;

        switch (dia){
            case 1: System.out.println("Lunes");
                break;
            case 2: System.out.println("Martes");
                break;
            case 3: System.out.println("Miercoles");
                break;
            case 4: System.out.println("Jueves");
                break;
            case 5: System.out.println("Viernes");
                break;
            case 6: System.out.println("Sabado");
                break;
            case 7: System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero tiene que ser entre 1 y 7");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

        int nota = 99;

        if (nota > 90){
            System.out.println("Sobresaliente");
        } else if (nota >= 70 && nota < 90) {
            System.out.println("Aprobado");
        }else {
            System.out.println("Suspendo");
        }


        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        boolean acompañado = false;
        int AlMenos = 15;

        if (AlMenos >= 15 || acompañado){
            System.out.println("Puedes entrar al cine");
        }else {
            System.out.println("No puedes entrar al cine");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        char letra = 'j';

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("La letra es una vocal");
        }else {
            System.out.println("La letra es una consonante");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        int n1 = 45;
        int n2 = 40;
        int n3 = 36;

        if (n1 > n2 && n1 > n3){
            System.out.println("El n1 es mayor");
        } else if (n2 > n3) {
            System.out.println("El n2 es mayor");
        }else {
            System.out.println("El n3 es mayor");
        }
    }
}
