import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("intero");
        int a = in.nextInt();
        float media=0;
        int cont=0;
        for (int i = 0; i < a; i++) {
            System.out.println("float");
            float n = in.nextFloat();
            media+=n ;
            cont++;
        }
        System.out.println("media:"+media/cont);
    }
}