public class Main {
    public static void main(String[] args) {

        int numeroIf = 0;

        if (numeroIf > 0) {
            System.out.println("El numero es mayor que cero");
        } else if (numeroIf < 0) {
            System.out.println("El numero es menor que cero");
        } else {
            System.out.println(" El numero es cero");
        }

        System.out.println("Bucle While");
        int numeroWhile = -5;

        while (numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }

        System.out.println("Bucle Do While");

        do {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        System.out.println("Ciclo For");

        for (int numeroFor = 0;numeroFor <= 3; numeroFor = numeroFor+1){
            System.out.println(numeroFor);
        }

        System.out.println("Switch");

        var estacion = "PRIMAVER";

        switch(estacion){
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "OTOÑO":
                System.out.println(" Es Otoño");
                break;
            case "INVIERNO":
                System.out.println(" Es Invierno");
                break;
            default:
                System.out.println(" No introdujo ninguna estacion");



        }

    }
}