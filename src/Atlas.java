import java.util.Collection;
import java.util.HashMap;

public class Atlas extends Opciones{
    public HashMap<String,String> atlas = new HashMap<>();

    public void anadirPais(String pais, String capital){
        atlas.put(pais,capital);
        System.out.println("\n\tNueva entrada incorporada");
    }
    public void ensenarAtlas(){
        if(comprobacion(null)){
            Collection<String> claves = atlas.keySet();
            for(String clave: claves){
                System.out.printf("\n\tPaís: "+ clave);
                System.out.println("\n\tCapital: "+ atlas.get(clave));
                System.out.println("\n Hay " + atlas.size() + " elementos en el atlas");
            }
        }
    }

    public void buscarAtlas(String entrada){
        if (comprobacion(entrada)){
            Collection<String> claves = atlas.keySet();
            for (String clave: claves){
                if (clave.equals(entrada)){
                    System.out.println("\t Capital: "+ atlas.get(clave));
                }
            }
        }
    }

    public void modValor(String entrada, String nueVal){
        if (comprobacion(entrada)){
            Collection<String> claves = atlas.keySet();
            for (String clave: claves){
                if (clave.equals(entrada)){
                    atlas.put(entrada, nueVal);
                    System.out.println("\t Capital: "+ atlas.get(clave));
                }
            }
        }
    }

    public boolean comprobacion(String entrada){
        if (atlas.isEmpty()){
            System.out.println("Primero añade alguna entrada");
            return false;
        }else if (atlas.containsKey(entrada)){
            System.out.println("\t De este País no se encuentra capital");
            return false;
        }else {
            return true;
        }
    }

}
