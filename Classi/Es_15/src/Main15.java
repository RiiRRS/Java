import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("inserisci un intero");
        int cont=0,g=in.nextInt();
        float media=0;
        for (int i = 0; i <g; i++) {
            System.out.println("inserisci un float");
            float m=in.nextFloat();
            if(m>100){
                media+=m;
                cont++;
            }
        }
        System.out.println("media: "+media/cont);
    }
}