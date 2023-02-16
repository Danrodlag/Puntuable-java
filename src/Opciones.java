public class Opciones extends Main{
    AtlasH atlas = new AtlasH();
    AtlasArr atlasArr = new AtlasArr();
    boolean modo = false;
    protected void elegirOpcion(int entrada){
        if (modo){ entrada += 10;}
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
            case 9, 19 -> System.out.println("\n\tAdios que tenga un buen día");
            case 10, 20 -> modo = !modo;
            case 11 -> {
                System.out.print("\n\t\tTeclea un País: ");
                String pais = teclado.next();
                System.out.print("\t\tTeclea su capital: ");
                String capital = teclado.next();
                atlasArr.anadirPais(pais, capital);
            }
            case 12 -> atlasArr.ensenarAtlas();
            case 13 -> {
                System.out.print("\n\tTeclea un País: ");
                String pais = teclado.next();
                atlasArr.buscarAtlas(pais);
            }
            case 14 -> {
                System.out.print("\t\tTeclea un País: ");
                String pais = teclado.next();
                if (atlasArr.comprobacion(pais)){
                    System.out.print("\t\tTeclea modificación de capital: ");
                    String nueCap = teclado.next();
                    atlasArr.modValor(pais, nueCap);
                }
            }
            case 15 -> atlasArr.ordNom();
            case 16 -> atlasArr.itAtlas();
            case 17 -> {
                System.out.print("\n\tTeclea un País a eliminar: ");
                String pais = teclado.next();
                atlasArr.elimPais(pais);
            }
            case 18 -> atlasArr.vaciarAtlas();
            default -> System.out.println("\n\tDebes teclear un número entero");
        }
    }
}
