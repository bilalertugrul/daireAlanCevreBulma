import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Dairenin Alanını ve Çevresini Hesaplayan Program
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

        Alan Formülü : π * r * r;
        Çevre Formülü : 2 * π * r;

        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.
        Formül : (𝜋 * (r*r) * 𝛼) / 360
        */

        //Dairenin Alan ve Çevresini Bulma

        double pi=3.14, r, a, alan, cevre, dilimDaire;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz : ");
        r = input.nextDouble();
        System.out.print("Daire Diliminin Merkez Açısını Giriniz : ");
        a = input.nextDouble();

        alan = pi * r * r;
        cevre = 2*(pi * r);
        // merkez açısı a olan daire diliminin alanı
        dilimDaire = ((pi*r*r) * a )/360;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
        System.out.println("Dairenin Diliminin Alanı : " + dilimDaire);

    }
}