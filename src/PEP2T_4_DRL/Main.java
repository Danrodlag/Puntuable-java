package PEP2T_4_DRL;

import PEP2T_4_DRL.Array.OpcionesA;
import PEP2T_4_DRL.HashMap.Opciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Opciones eleccionH = new Opciones();
        OpcionesA eleccionA = new OpcionesA();
        int entrada = 0;
        Scanner teclado = new Scanner(System.in);
        boolean modo = true;
        while (entrada != 9){
            System.out.print("""
                    
                    \t1. Añadir una entrada al atlas    2. Mostrar el contenido actual del atlas
                    \t3. Buscar una entrada del atlas   4. Modificar una entrada del atlas
                    \t5. Ordenar por nombre de país     6. Mostrar el contenido del atlas con iterador
                    \t7. Eliminar una entrada del atlas 8. Eliminar el contenido completo del atlas
                    \t9. Salir
                    
                    \tTeclea una de las opciones:\s""");





            try {
                entrada = teclado.nextInt();
                if(entrada < 10 && modo){
                    eleccionH.elegirOpcion(entrada);
                } else if (entrada == 10){
                    modo = !modo;
                } else if (entrada < 10){
                    eleccionA.elegirOpcion(entrada);
                }else{
                    System.out.println("\n\tDebes teclear un número entero");
                }

            }catch (InputMismatchException n){
                System.out.println("Introduzca un número entero.");
            }

        }
    }
}