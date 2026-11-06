package mx.com.animales;

public class Vaca extends Animal implements Movible {
    public Vaca (String nombre, Integer edad ){
        super (nombre, edad);
    }

    @Overrride
    public void hacerSonido(){
        System.out.println("Muuuu");
    }

    @Override
    public void moverser() {
        System.out.println("La vaca se espanta las moscas con su cola");
    }

}
