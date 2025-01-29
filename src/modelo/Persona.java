package modelo;

import java.util.SortedMap;
import java.util.TreeMap;

public class Persona implements Comparable<Persona>{

    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private int altura;
    private float peso;
    private SortedMap<String,String> agendaTel = null;

    public Persona(){

    }

    public Persona(String nombre, String apellido, String dni){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDni(dni);
        this.agendaTel = new TreeMap<String,String>();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    

    
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", altura="
                + altura + ", peso=" + peso + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        result = prime * result + edad;
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
        result = prime * result + altura;
        result = prime * result + Float.floatToIntBits(peso);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        if (edad != other.edad)
            return false;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        if (altura != other.altura)
            return false;
        if (Float.floatToIntBits(peso) != Float.floatToIntBits(other.peso))
            return false;
        return true;
    }

    @Override
    public int compareTo(Persona o) {
        return this.apellido.compareTo(o.apellido);
    }
}

