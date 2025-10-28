import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("righe");
        int N = in.nextInt();
        System.out.println("n caratteri");
        int M = in.nextInt();
        while (N>0){
            for (int i=1;i<=M;i++){
                System.out.print("x");
            }
            System.out.println();
            N--;
        }

    }
}