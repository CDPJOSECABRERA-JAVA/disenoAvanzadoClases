package listas2;

import java.util.HashSet;
import java.util.Set;

import modelo.Persona;

public class Listas2 {
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
    }
}
