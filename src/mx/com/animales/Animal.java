package mx.com.animales;

public abstract class Animal {
    private String nombre;
    private Integer edad;

    public Animal (String nombre, Integer edad ){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformación(){
        System.out.println("nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
     public abstract void hacerSonido();



}
