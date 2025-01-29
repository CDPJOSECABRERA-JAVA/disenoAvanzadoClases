package listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import modelo.Bicicleta;
import modelo.Persona;

public class Listas {
    public Listas(){
        System.out.println("Estudio de listas.");
        Persona p1 = new Persona("Wuan", "wen", "67892489S");
        Persona p2 = new Persona("Weon", "wan", "67343431X");
        Bicicleta b1 = new Bicicleta(12, 1, 30);


        Collection collection = new ArrayList();
        collection.add(p1);
        collection.add(b1);
        collection.add(p2);

       for (Object obj : collection) {
            if (obj instanceof Persona) System.out.println("PERSONA: " + obj.toString());
            else System.out.println("BICICLETA: " + obj.toString());         
       }

       System.out.println("----------------------------------------");

       List<Persona> lista = null;
       lista = new ArrayList<Persona>();
       lista.add(p1);
       lista.add(p2);
       lista.add(p1);
       lista.set(0, p2);
       lista.set(1, p1);

       //System.out.println(lista.get(1));
       Collections.sort(lista);

       for (Persona per : lista) {
            System.out.println(per);
       }

     
       
       System.out.println("Tamaño de la lista: " + lista.size());
       lista.remove(1);
       System.out.println("Tamaño de la lista: " + lista.size());
       System.out.println(lista.get(1));
       
       System.out.println(lista.contains(p2));
       lista.remove(0);
       System.out.println(lista.contains(p2));

       lista.add(p2);
       lista.add(p1);

       System.out.println("--------ITERATOR--------");
       java.util.Iterator<Persona> iter = lista.iterator();
       while (iter.hasNext()) {
        System.out.println(iter.next().toString());
       }

       int pos = lista.indexOf(b1);
       boolean existe = lista.contains(p1);
       System.out.println(existe);
       System.out.println(pos);
    }


}
