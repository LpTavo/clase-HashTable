import java.util.Hashtable;
import java.util.Enumeration;

public class EjemploHashtable {
    public static void main(String[] args) {
       
        Hashtable<String, Integer> inventario = new Hashtable<>();
        
        
        inventario.put("Manzanas", 50);
        inventario.put("Naranjas", 30);
        inventario.put("Peras", 20);
        inventario.put("Plátanos", 10);
        
     
        System.out.println("Tamaño del inventario: " + inventario.size());
        
        
        int cantidadManzanas = inventario.get("Manzanas");
        System.out.println("Cantidad de manzanas: " + cantidadManzanas);
        
       
        Enumeration<String> claves = inventario.keys();
        while (claves.hasMoreElements()) {
            String clave = claves.nextElement();
            int valor = inventario.get(clave);
            System.out.println("Producto: " + clave + ", Cantidad: " + valor);
        }
        
      
        inventario.remove("Peras");
        System.out.println("Tamaño del inventario después de eliminar 'Peras': " + inventario.size());
        
   
        System.out.println("¿El inventario está vacío? " + inventario.isEmpty());
    }
}

