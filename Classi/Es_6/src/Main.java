import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Semaforo s = new Semaforo();
        int scelta;

        do {
            System.out.println("\n--- MENU SEMAFORO ---");
            System.out.println("1. Accendi");
            System.out.println("2. Spegni");
            System.out.println("3. Toggle");
            System.out.println("4. Avanza");
            System.out.println("5. Stato attuale");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            scelta = input.nextInt();

            switch (scelta) {
                case 1:
                    s.Accendi();
                    break;
                case 2:
                    s.Spegni();
                    break;
                case 3:
                    s.toggle();
                    break;
                case 4:
                    s.avanza();
                    break;
                case 5:
                    System.out.println(s);
                    break;
                case 0:
                    System.out.println("Uscita...");
                    break;
                default:
                    System.out.println("Scelta non valida!");
            }

        } while (scelta != 0);

        input.close();
    }
}
