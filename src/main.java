
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.println("2 Sayı İçin İşlem Yapabilen Hesap Makinesi : ");
        System.out.println("----------------------------------------------------");
        String İşlemler = "1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme";
        System.out.println(İşlemler);
        System.out.println("----------------------------------------------------");
        System.out.print("1. Sayının Değerini Giriniz :");
        double sayı1 = scanner.nextDouble();
        System.out.print("2. Sayının Değerini Giriniz :");
        double sayı2 = scanner.nextDouble();
        System.out.print("Yapmak İstediğiniz İşlemi Seçiniz : ");
        byte işlem = scanner.nextByte();
        System.out.println("----------------------------------------------------");
        switch (işlem) {
            case 1:
                System.out.println("Toplama İşlemi Yapılıyor...");
                double sonuc1 = sayı1+sayı2;
                System.out.println(sonuc1);
                break;
            case 2:
                System.out.println("Çıkarma İşlemi Yapılıyor...");
                double sonuc2 = sayı1-sayı2;
                System.out.println(sonuc2);
                break;
            case 3:
                System.out.println("Çarpma İşlemi Yapılıyor...");
                double sonuc3 = sayı1*sayı2;
                System.out.println(sonuc3);
                break;
            case 4:
                System.out.println("Bölme İşlemi Yapılıyor...");
                double sonuc4 = sayı1/sayı2;
                System.out.println(sonuc4);
                break;
            default:
                System.out.println("Geçersiz İşlem girildi...");
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Çıkış Yapılıyor...");
        System.out.println("****************************************************");
    }
}
