package mx.com.animales;

public class Gato extends Animal implements Movible{
    public Gato (String nombre, Integer edad ){
        super (nombre, edad);
    }

    @Overrride
    public void hacerSonido(){
        System.out.println("Miau miau");
    }

    @Override
    public void moverse() {
        System.out.println("El gato cae de píe");
    }
}
