package Java101odevler;
import java.util.Scanner;
public class Odev5DaireAlanı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double pi=3.14,r,merkezaciolcusu,alan;
        System.out.println("Yarıçapı giriniz:");
        r=input.nextDouble();
        System.out.println("Merkez açı ölçüsü giriniz:");
        merkezaciolcusu=input.nextDouble();
        alan=(pi*(r*r)*merkezaciolcusu)/360;
        System.out.println(alan);
    }
}
