import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> lista = new LinkedList<>();

        System.out.println("N: ");
        int n = sc.nextInt();
        System.out.println("K: ");
        int k = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            lista.add(i);
        }
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next() % k==0) {
                it.remove();
            }
        }
        System.out.println(lista);
    }
}