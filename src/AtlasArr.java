import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
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
            lista.sort(this::compare);
            for (Entrada entrada: lista){
                System.out.printf("%s(%s)", entrada.pais, entrada.capital);
            }

        }
    }

    public int compare(Entrada o1, Entrada o2){
        return o1.pais.compareTo(o2.pais);
    }

    public void itAtlas(){
        if (comprobacion(null)){
            Iterator<Entrada> it = lista.iterator();
            while (it.hasNext()){
                Entrada varin = it.next();
                System.out.printf("\n\t\tPaís: %s  Capital:  %s", varin.pais, varin.capital);
            }
            System.out.printf("\t\t Hay %s elementos en el Atlas", lista.size());
        }
    }

    public void elimPais(String entrada){
        if(comprobacion(entrada)){
            System.out.println("\n\t\t" + entrada + " eliminado del Atlas");
            lista.removeIf(eliminar -> eliminar.pais.equals(entrada));
        }
    }

    public void vaciarAtlas(){
        if(lista.isEmpty()){
            System.out.println("\n\t\tEl atlas ya está vacío");
        } else {
            lista.clear();
            System.out.println("\n\t\tEliminado el Atlas por completo");
        }

    }

    public boolean comprobacion(String entrada){
        if (lista.isEmpty()){
            System.out.println("Primero añade alguna entrada");
            return false;
        }else if (lista.stream().allMatch(n -> n.pais.equals(entrada))){
            System.out.println("\t De este país no se encuentra capital");
            return false;
        }else {
            return true;
        }
    }
}
