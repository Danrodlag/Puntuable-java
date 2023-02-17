package PEP2T_4_DRL.HashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Comparator;

public class AtlasH implements Comparator<String>{
    public HashMap<String,String> atlas = new HashMap<>();

    public void anadirPais(String pais, String capital){
        atlas.put(pais,capital);
        System.out.println("\n\t\tNueva entrada incorporada");
    }
    public void ensenarAtlas(){
        if(comprobacion(null)){
            Collection<String> claves = atlas.keySet();
            for(String clave: claves){
                System.out.printf("\n\tPaís: "+ clave);
                System.out.printf("\tCapital: "+ atlas.get(clave));

            }
            System.out.println("\n\n\t\t Hay " + atlas.size() + " elementos en el atlas");
        }
    }

    public void buscarAtlas(String entrada){
        if (comprobacion(entrada)){
            Collection<String> claves = atlas.keySet();
            for (String clave: claves){
                if (clave.equals(entrada)){
                    System.out.println("\n\t\t Capital: "+ atlas.get(clave));
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
                    System.out.println("\t\t Capital: "+ atlas.get(clave));
                }
            }
        }
    }

    public void ordNom(){
        if(comprobacion(null)){

            ArrayList <String> claves = new ArrayList<>(atlas.keySet());
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
        if (atlas.isEmpty()){
            System.out.println("Primero añade alguna entrada");
            return false;
        }else if (!atlas.containsKey(entrada) && entrada!= null){
            System.out.println("\t De este país no se encuentra capital");
            return false;
        }else {
            return true;
        }
    }

}
