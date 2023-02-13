import java.util.Collection;
import java.util.HashMap;

public class Atlas extends Opciones{
    public HashMap<String,String> atlas = new HashMap<>();

    public void anadirPais(String pais, String capital){
        atlas.put(pais,capital);
        System.out.println("\n\tNueva entrada incorporada");
    }
    public void ensenarAtlas(){
        if(comprobacion()){
            Collection<String> claves = atlas.keySet();
            for(String clave: claves){
                System.out.printf("\n\tPaís: "+ clave);
                System.out.println("\n\tCapital: "+ atlas.get(clave));
                System.out.println("\n Hay " + atlas.size() + " elementos en el atlas");
            }
        }
    }

    public void buscarAtlas(String entrada){
        if (comprobacion()){
            Collection<String> claves = atlas.keySet();
            for (String clave: claves){
                if (clave.equals(entrada)){
                    System.out.println("\t Capital: "+ atlas.get(clave));
                } else {
                    System.out.println("\t De este Páis no se encuentra capital");
                }
            }
        }
    }

    public void modValor(String entrada){
        if (comprobacion()){
            Collection<String> claves = atlas.keySet();
            for (String clave: claves){
                if (clave.equals(entrada)){
                    System.out.println("\t Capital: "+ atlas.get(clave));
                } else {
                    System.out.println("\t De este Páis no se encuentra capital");
                }
            }
        }
    }

    public boolean comprobacion(){
        if (atlas.isEmpty()){
            System.out.println("Primero añade alguna entrada");
            return false;
        }else {
            return true;
        }
    }

}
