import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("inserisci una stringa(stop per terminare): ");
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("stop")) {
                break;
            }
            System.out.println("inserire in coda(c) o in posizione (p)");
            char c = sc.nextLine().charAt(0);
            if (c == 'p') {
                System.out.print("Posizione: ");
                int pos = sc.nextInt();
                sc.nextLine();
                if (pos >= 0 && pos <= l.size()) {
                    l.add(pos, s);
                }else
                    l.add(s);
            } else {
                l.add(s);
            }
            System.out.println(l);
        }
    }
}