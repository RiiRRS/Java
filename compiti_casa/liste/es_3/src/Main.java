import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("N: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(rand.nextInt(101));
        }
        System.out.println("numero da cercare: ");
        int x = sc.nextInt();
        if (list.contains(x)) {
            System.out.println("Presente");
        }else System.out.println("Non presente");


    }
}