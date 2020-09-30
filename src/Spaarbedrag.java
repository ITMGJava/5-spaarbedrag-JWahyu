import java.util.Scanner;

public class Spaarbedrag {
    public static void main(String[] args) {

        // Invoer bedrag.

        System.out.println("Hoeveel geld heb je?");

        var input = new Scanner(System.in);

        var inputNumber = input.nextDouble();


        System.out.println();


        // Uitvoer bedrag met rente.

        System.out.println("Wees geduldig, wacht 10 jaar dan wordt het bedrag met een rente van 5,5% per jaar:");

        String inJaar = "In jaar ";

        for(var year = 1; year <= 10; year++){
            System.out.format("%s %.2f %n", inJaar + year + ":", inputNumber*=1.055);
        }

        System.out.println();

        // Humor.
        System.out.println("Dan ben je rijk! Kassa!");
    }
}
