import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AtlasArr {

    ArrayList <Entrada> lista = new ArrayList<>();

    public void anadirPais(String pais, String capital){
        lista.add(new Entrada(pais, capital));
        System.out.println("\n\t\tNueva entrada incorporada");
    }
    public void ensenarAtlas(){
        if(comprobacion(null)){

            for(Entrada entradas: lista){
                System.out.printf("\n\tPaís: "+ entradas.pais);
                System.out.printf("\tCapital: "+ entradas.capital);

            }
            System.out.println("\n\n\t\t Hay " + lista.size() + " elementos en el atlas");
        }
    }

    public void buscarAtlas(String entrada){
        if (comprobacion(entrada)){

            for (Entrada entradas: lista){
                if (entradas.pais.equals(entrada)){
                    System.out.println("\n\t\t Capital: "+ entradas.capital);
                }
            }
        }
    }

    public void modValor(String entrada, String nueVal){
        if (comprobacion(entrada)){

            for (Entrada entradas: lista){
                if (entradas.pais.equals(entrada)){
                    entradas.capital = nueVal;
                    System.out.println("\t\t Capital: "+ entradas.capital);
                }
            }
        }
    }

    public void ordNom(){
        if(comprobacion(null)){

            ArrayList<String> claves = new ArrayList<>(atlas.keySet());
            claves.sort(null);
            StringBuilder string = new StringBuilder();
            for (String clave: claves){
                string.append(clave).append("(").append(atlas.get(clave)).append(")\n");
            }
            System.out.print(string);

        }
    }

    public int compare(String o1, String o2){
        return o2.compareTo(o1);
    }

    public void itAtlas(){
        if (comprobacion(null)){
            Iterator<String> it = atlas.keySet().iterator();
            while (it.hasNext()){
                String varin = it.next();
                System.out.print("\n\t\tPaís: " + varin + " Capital: " + atlas.get(varin));
            }
            System.out.println("\t\t Hay " + atlas.size() + "elementos en el Atlas");
        }
    }

    public void elimPais(String entrada){
        if(comprobacion(entrada)){
            System.out.println("\n\t\t" + entrada + " eliminado del Atlas");
            atlas.remove(entrada);
        }
    }

    public void vaciarAtlas(){
        if(atlas.isEmpty()){
            System.out.println("\\n\\tEl atlas ya está vacío");
        } else {
            atlas.clear();
            System.out.println("\\n\\tEliminado el Atlas por completo");
        }

    }

    public boolean comprobacion(String entrada){
        if (lista.isEmpty()){
            System.out.println("Primero añade alguna entrada");
            return false;
        }else if (lista.stream().allMatch(n -> n.pais.equals(entrada)) && entrada!= null){
            System.out.println("\t De este país no se encuentra capital");
            return false;
        }else {
            return true;
        }
    }
}
