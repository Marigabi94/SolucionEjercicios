/*En este ejercicio practicarás las estructuras de control, para ello deberás crear:

      + Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0
         y su condición será que la variable sea igual o menor que 3,
         se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

       + Por último, para el Switch, deberás crear la variable estacion, y distintos case para las
         cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar
         un mensaje por consola informando de la estación en la que está. También habrá que poner
         un default para cuando el valor de la variable no sea una estación.
*/

public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;
        int numeroWhile = 1;
        int numeroDoWhile = 3;
        String estacion = "invierno";

        if(numeroIf == 0){
            System.out.println("La variable es igual a 0");
        } else if ( numeroIf >0) {
            System.out.println("La variable es un numero positivo");
        }else{
            System.out.println("La variable es un numero negativo");
        }

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("La variable del While ahora vale: " + numeroWhile);
        }

        do{
            numeroDoWhile++;
            System.out.println("La variable del DoWhile ahora vale: " + numeroDoWhile);
        }while(numeroDoWhile < 3);

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("La variable For ahora vale: " + numeroFor);
        }

        switch(estacion) {
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("No es una estación");
        }

    }
}