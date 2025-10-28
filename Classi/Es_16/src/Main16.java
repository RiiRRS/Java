import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("inserisci un int");
        int cont=0, n=in.nextInt();
        System.out.println("inserisci due float");
        float A=in.nextFloat(),B=in.nextFloat();
        for (int i = 0; i <n; i++) {
            System.out.println("inserisci un numero float");
            float num=in.nextFloat();
            if (num>A && num<B) {
                cont++;
            }
        }
        System.out.println(cont);

    }
}