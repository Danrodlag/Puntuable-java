public class Opciones extends Main{
    Atlas atlas = new Atlas();
    protected void elegirOpcion(int entrada){

        switch (entrada) {
            case 1 -> {
                System.out.print("\n\tTeclea un País: ");
                String pais = teclado.next();
                System.out.print("\tTeclea una capital: ");
                String capital = teclado.next();
                atlas.anadirPais(pais, capital);
            }
            case 2 -> atlas.ensenarAtlas();
            case 3 -> {
                System.out.print("\tTeclea un País: ");
                String pais = teclado.next();
                atlas.buscarAtlas(pais);
            }
            case 4 -> {
                System.out.print("Teclea un País: ");
                String pais = teclado.next();
                System.out.print("Teclea modificación de capital: ");
                String nueCap = teclado.next();
                atlas.modValor(pais, nueCap);
            }
            case 5 -> atlas.ordNom();
            case 6 -> System.out.println("he");
            case 7 -> System.out.println("he");
            case 8 -> System.out.println("he");
            case 9 -> System.out.println("Talue");
            default -> System.out.println("Introduzca numero valido");
        }
    }
}
