package mx.com.animales;

public class Gato extends Animal{
    public Gato (String nombre, Integer edad ){
        super (nombre, edad);
    }

    @Overrride
    public void hacerSonido(){
        System.out.println("Miau miau");
    }
}
