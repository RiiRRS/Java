import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("inserisci un intero");
        int n=in.nextInt();
        System.out.println("inserisci un carattere");
        char c= (char) in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(c);
            if (i==5){
                System.out.println();
            }
        }
    }
}