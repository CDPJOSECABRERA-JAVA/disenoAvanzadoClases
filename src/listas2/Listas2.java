package listas2;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

import modelo.Persona;

public class Listas2{
    public Listas2(){
        /*
         * La interfaz set es la encargada del tratamiento de conjuntos en el api de java.
         * Un conjunto es una coleccion de elementos que no permiten duplicados.
         */
        Set<Persona> listaHasSet = new HashSet<Persona>();

        Persona p1 = new Persona("Wuan", "wen", "67892489S");
        Persona p2 = new Persona("Weon", "wan", "67343431X");
        Persona p3 = new Persona("Ruperto", "wen", "6723459S");
        Persona p4 = new Persona("Qliao", "weon", "7632132B");
        Persona p5 = new Persona("Qliao", "weon", "7632132B");

        System.out.println(listaHasSet.add(p1));
        System.out.println(listaHasSet.add(p1));
        System.out.println(listaHasSet.add(p2));
        System.out.println(listaHasSet.add(p4));
        System.out.println(listaHasSet.add(p3));
        System.out.println(listaHasSet.add(p5));

        System.out.println(listaHasSet.size());
        for (Persona persona : listaHasSet) {
                System.out.println(persona);
        }

        /* SORTEDSET
        * Esta interfaz es muy similar a la interface SET. Tan solo se diferencia en que
        * SORTEDSET permite que los elementos dentro del conjunto de la coleccion esten ordenados
        * totalmente, facilitando por tanto su acceso en busquedas y haciendo mas rapido su consulta.
        */

        System.out.println("-------Lista Sorted----------");
        Persona p6 = new Persona("Wuan", "Aac", "67892489S");
        SortedSet<Persona> listaSorted = new TreeSet<Persona>();
        listaSorted.add(p1); listaSorted.add(p2); listaSorted.add(p3);
        listaSorted.add(p1); listaSorted.add(p6);

        for (Persona persona : listaSorted) {
            System.out.println(persona);
        }

        
        /*----------TreeMap-----------*/
        // listas con clave-valor
        //p1.getAgendatel().put("trabajo", "5345634654");
        //p1.getAgendatel().put("oficina", "5345634654");
        //p1.getAgendatel().put("movil", "5345634654");


        /*La clase Stack es clase LIFO (Last in - first out) */

        Stack<String> binario =  new Stack<String>();
        binario.push("1");binario.push("1");binario.push("0");binario.push("1");
        String bin = "";
        java.util.Iterator<String> iter = binario.iterator();
        while (iter.hasNext()) {
            bin+= binario.pop();

            System.out.println(bin);
        }
    }
}
