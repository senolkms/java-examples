import Matematik.Dortislem; //import Matematik.*;
import Matematik.Logaritma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Adınız: ");
        String isim=scanner.nextLine();
        System.out.println("Merhaba "+isim);

        Dortislem dortislem=new Dortislem();
        System.out.println(dortislem.topla(5,12));
        Logaritma logaritmas=new Logaritma();
        System.out.println(logaritmas.logaritma());
    }
}