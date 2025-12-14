import java.util.ArrayList;
import java.util.Arrays;
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
        ArrayList<Integer> originale =new ArrayList<>(list);
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i)==list.get(i-1)+list.get(i+1)) {
                list.set(i,2*list.get(i-1));
            }
        }
        for(int i=0;i<list.size();i++) {
            System.out.println(originale.get(i)+"="+list.get(i));
        }
    }
}