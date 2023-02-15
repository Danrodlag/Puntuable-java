public class Opciones extends Main{
    Atlas atlas = new Atlas();
    protected void elegirOpcion(int entrada){

        switch (entrada) {
            case 1 -> {
                System.out.print("\n\t\tTeclea un País: ");
                String pais = teclado.next();
                System.out.print("\t\tTeclea su capital: ");
                String capital = teclado.next();
                atlas.anadirPais(pais, capital);
            }
            case 2 -> atlas.ensenarAtlas();
            case 3 -> {
                System.out.print("\n\tTeclea un País: ");
                String pais = teclado.next();
                atlas.buscarAtlas(pais);
            }
            case 4 -> {
                System.out.print("\t\tTeclea un País: ");
                String pais = teclado.next();
                if (atlas.comprobacion(pais)){
                    System.out.print("\t\tTeclea modificación de capital: ");
                    String nueCap = teclado.next();
                    atlas.modValor(pais, nueCap);
                }
            }
            case 5 -> atlas.ordNom();
            case 6 -> atlas.itAtlas();
            case 7 -> {
                System.out.print("\n\tTeclea un País a eliminar: ");
                String pais = teclado.next();
                atlas.elimPais(pais);
            }
            case 8 -> atlas.vaciarAtlas();
            case 9 -> System.out.println("\n\tAdios que tenga un buen día");
            default -> System.out.println("\n\tDebes teclear un número entero");
        }
    }
}
