package mx.com.animales;

public class Perro extends Animal implements Movible{
    public String nombre;
    public Integer edad;

    public Perro (String nombre, Integer edad ){
        super (nombre, edad);
    }


    @Overrride
    public void hacerSonido(){
        System.out.println("gua gua");
    }

    @Override
    public void moverse() {
        System.out.println("El perro gira para dormir");
    }


}
