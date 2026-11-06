package mx.com.animales;

public abstract class Animal {
    public String nombre;
    public Integer edad;

    public Animal (String nombre, Integer edad ){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformación(){
        System.out.println("nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
     public abstract void hacerSonido();


    public abstract void moverser();
}
