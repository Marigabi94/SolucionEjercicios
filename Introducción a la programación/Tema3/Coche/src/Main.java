public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println(miCoche.numPuertas);

    }
}


class Coche {
 public  int numPuertas = 0;

 public void AgregarPuerta(){
     this.numPuertas++;
 }

}