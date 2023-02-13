import java.util.Scanner;

public class Main {

    protected Scanner teclado = new Scanner(System.in);
    public static void main(String[] args){
        Opciones eleccion = new Opciones();
        String entrada = "3";
        while (!entrada.equals("9")){
            System.out.print("""
                    
                    \t1. Añadir una entrada al atlas    2. Mostrar el contenido actual del atlas
                    \t3. Buscar una entrada del atlas   4. Modificar una entrada del atlas
                    \t5. Ordenar por nombre de país     6. Mostrar el contenido del atlas con iterador
                    \t7. Eliminar una entrada del atlas 8. Eliminar el contenido completo del atlas
                    \t9. Salir
                    
                    \tTeclea una de las opciones:\s""");


            entrada = eleccion.teclado.next().trim();

            try {
                eleccion.elegirOpcion(Integer.parseInt(entrada));
            }catch (NumberFormatException n){
                System.out.println("Introduzca un número entero.");
            }


        }
    }
}