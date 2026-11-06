import mx.com.animales.Perro;
import mx.com.animales.Gato;
import mx.com.animales.Vaca;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Perro perrito = new Perro("BLuey", 2);
        perrito.hacerSonido();
        perrito.moverse();


        Vaca vaquita = new Vaca ("Lola", 12);
        vaquita.hacerSonido();
        vaquita.moverse();

        Gato gatito = new Gato("Benito",4);
        gatito.hacerSonido();
        gatito.moverse();


    }
}