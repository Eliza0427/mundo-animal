package mx.com.animales;

public class Perro extends Animal{
    public Perro (String nombre, Integer edad ){
        super (nombre, edad);
    }

    @Overrride
    public void hacerSonido(){
        System.out.println("gua gua");
    }
}
