import java.util.Scanner;

public class NotHesaplama {

	/*
	 Kullanıcıdan Vize1, Vize2 ve Final notunu alarak bir harf hesaplama sistemi yapınız.
	 Kullanıdan okuldaki genel not ortalamasını alarak ,
	 DD alma ve 2.50'nin altında olma koşuluna göre ekrana bir tavsiye mesajı yazdırınız.

	 Vize1 toplam notun %30'una etki edicek.g

	 Vize2 toplam notun %30'una etki edicek.

	 Final toplam notun %40'ına etki edicek.

	 Toplam not >= 90 ---> AA
	 Toplam not >= 85 ---> BA
     Toplam not >= 80 ---> BB
	 Toplam not >= 75 ---> CB
	 Toplam not >= 70 ---> CC
	 Toplam not >= 65 ---> DC
	 Toplam not >= 60 ---> DD
	 Toplam not >= 55 ---> FD
	 Toplam not >= 50 ---> FF

	 */

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.print("Vize1: ");
        int vize1=scan.nextInt();

        System.out.print("Vize2: ");
        int vize2=scan.nextInt();

        System.out.print("Final: ");
        int finalnotu=scan.nextInt();

        System.out.print("Okul ortalamanız: ");
        double ortalama= scan.nextDouble();

        double toplamnot = (vize1 * 3 / 10.0) + ( vize2 * 3 / 10.0) + (finalnotu * 4 / 10.0);

        if (toplamnot >= 90) {
            System.out.println("AA");
        }
        else if(toplamnot >= 85) {
            System.out.println("BA");
        }
        else if(toplamnot >= 80) {
            System.out.println("BB");
        }
        else if(toplamnot >= 75) {
            System.out.println("CB");
        }
        else if(toplamnot >= 70) {
            System.out.println("CC");
        }
        else if(toplamnot >= 65) {
            System.out.println("DC");
        }
        else if(toplamnot >= 60) {
            System.out.println("DD");

            if(ortalama < 2.5) {
                System.out.println("DD aldınız ve not ortalamanız düşük...");
            }
        }
        else if(toplamnot >= 55) {
            System.out.println("FD");
        }
        else {
            System.out.println("FF aldınız ve kaldınız...");
        }


    }

}
