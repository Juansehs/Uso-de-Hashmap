import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
//Juan Sebastian Hernandez Silva//

        HashMap<String, Integer> edades = new HashMap<String, Integer>();

//Añadir o crear elementos asocidados "nombre y edad"//
        edades.put("Aylen", 15);
        edades.put("Maye", 20);
        edades.put("Marissa", 19);
        edades.put("Terry", 18);
        edades.put("Jonathan", 19);
        edades.put("Valentina",20);
        edades.put("Jess",19);
        edades.put("Juram",35);
        edades.put("Juanse",17);


// Mostrar en consola el Hash map//
        System.out.println("Hashmap" + edades);

        //Obtener la edad de la clave ""Aylen"//
        int edadAylen = edades.get("Aylen");
        System.out.println("La edad de Aylen es:" + edadAylen);

//Comprobar si dentro del Hashmap esta la clave "Maye"//
        if (edades.containsKey("Maye")) {
            System.out.println("Este Hashmap contiene la clave Maye");
        } else {
            System.out.println("No contiene la clave escrita");
        }
        //recorrer los elementos del Hashmap e imprimir clave-valor//
        for (String nombre : edades.keySet()) {
            System.out.println(nombre + " tiene " + edades.get(nombre) + " años ");
        }
        edades.remove("Terry");
        System.out.println("Despues de eliminar a Terry quedan en lista:" + edades.size());

// Remplazar una edad y mostrar el hashmap con los cambios//
        edades.replace("Marissa", 20);
        edades.replace("Aylen",19);
        edades.replace("Juanse",20);
        System.out.println("Despues de los cambios las edades son: "+edades);

    }

}