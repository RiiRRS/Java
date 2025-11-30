import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Parola da sostituire: ");
        String vecchia = input.nextLine();

        System.out.print("Nuova parola: ");
        String nuova = input.nextLine();

        String nomeFile;
        File file;


        int sostituzioni = 0;
        String[] righe = new String[500];
        int nRighe = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("Parole.txt"))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String originale = linea;

                if (linea.contains(vecchia)) {
                    int occ = conta(linea, vecchia);
                    sostituzioni += occ;

                    String modificata = linea.replace(vecchia, nuova);

                    System.out.println("-----");
                    System.out.println("Riga originale: " + originale);
                    System.out.println("Riga modificata: " + modificata);

                    linea = modificata;
                }

                righe[nRighe] = linea;
                nRighe++;
            }

        } catch (IOException e) {
            System.out.println("Errore: " + e.getMessage());
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Parole.txt"))) {

            for (int i = 0; i < nRighe; i++) {
                bw.write(righe[i]);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Errore scrittura file: " + e);
            return;
        }

        System.out.println("\nSostituzioni totali: " + sostituzioni);
    }

    public static int conta(String linea, String parola) {
        int count = 0;
        int pos = 0;

        while ((pos = linea.indexOf(parola, pos)) != -1) {
            count++;
            pos += parola.length();
        }

        return count;
    }
}
