import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        int righe = 0;
        int caratteri = 0;
        int parole = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("Testo.txt"))) {

            String linea;

            while ((linea = br.readLine()) != null) {
                righe++;
                caratteri += linea.length();
                parole += contaParole(linea);
            }

            System.out.println("Righe: " + righe);
            System.out.println("Caratteri: " + caratteri);
            System.out.println("Parole: " + parole);

        } catch (IOException e) {
            System.out.println("Errore: " + e);
        }
    }

    public static int contaParole(String s) {
        int count = 0;
        boolean dentroParola = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != ' ' && !dentroParola) {
                dentroParola = true;
                count++;
            }
            else if (c == ' ') {
                dentroParola = false;
            }
        }

        return count;
    }
}
