package PEP2T_4_DRL.Array;

import java.util.Scanner;

public class OpcionesA {
    Scanner teclado = new Scanner(System.in);
    AtlasArr atlasArr = new AtlasArr();
    public void elegirOpcion(int entrada){
        switch (entrada){
            case 1 -> {
                System.out.print("\n\t\tTeclea un País: ");
                String pais = teclado.next();
                System.out.print("\t\tTeclea su capital: ");
                String capital = teclado.next();
                atlasArr.anadirPais(pais, capital);
            }
            case 2 -> atlasArr.ensenarAtlas();
            case 3 -> {
                System.out.print("\n\tTeclea un País: ");
                String pais = teclado.next();
                atlasArr.buscarAtlas(pais);
            }
            case 4 -> {
                System.out.print("\t\tTeclea un País: ");
                String pais = teclado.next();
                if (atlasArr.comprobacion(pais)){
                    System.out.print("\t\tTeclea modificación de capital: ");
                    String nueCap = teclado.next();
                    atlasArr.modValor(pais, nueCap);
                }
            }
            case 5 -> atlasArr.ordNom();
            case 6 -> atlasArr.itAtlas();
            case 7 -> {
                System.out.print("\n\tTeclea un País a eliminar: ");
                String pais = teclado.next();
                atlasArr.elimPais(pais);
            }
            case 8 -> atlasArr.vaciarAtlas();
            case 9 -> System.out.println("\n\tAdios que tenga un buen día");

            default -> System.out.println("\n\tDebes teclear un número entero");
        }
    }
}
