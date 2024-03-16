/**
 * Este programa en Java verifica si un número ingresado por el usuario es par o impar,
 * utilizando operaciones aritméticas en lugar de condicionales.
 * 
 * si el numero es Par, el dato de Salida sera Even
 * si el numero es Imar, el dato de Salida sera Odd
 * 
 */

import java.util.Scanner; // Importamos la clase Scanner para leer el dato de entrada del usuario
public class ParImparChecker {
    /**
     * Método principal que inicia la ejecución del programa.
     * @param args Argumentos de la línea de comandos (no se utilizan en este programa)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario y guardamos el dato en la variable Scanner

        System.out.print("Ingrese un número entero: "); // Solicitamos al usuario que ingrese un número
        int numero = scanner.nextInt(); // Leemos el número ingresado por el usuario

        String[] resultados = {"even", "odd"}; // Creamos un arreglo de cadenas  para indicar si el número es par o impar, respectivamente.
        System.out.println(numero + " es " + resultados[Math.abs(numero % 2)]); 
        /** 
         * Utilizamos operaciones aritméticas para determinar si es par o impar
         * calcula el residuo de dividir numero entre 2 y toma el valor absoluto de ese residuo.
         * Si numero es par, el residuo será 0, por lo que resultados[0] será "even".
         * Si numero es impar, el residuo será 1 (o -1 si es negativo), por lo que resultados[1] será "odd".
         * Finalmente, concatenamos el número ingresado por el usuario con la cadena correspondiente (par o impar)
         * y lo imprimimos en la salida estándar.
         */
         

        scanner.close(); 
        /**
         * Cerramos el objeto Scanner para liberar recursos
         * Esta línea cierra el objeto Scanner para liberar los recursos asociados a la entrada estándar del usuario.
         * Es una buena práctica cerrar el Scanner una vez que ya no lo necesitamos para evitar posibles fugas de recursos.
         */
    }
}
