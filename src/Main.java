import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int distance, age, typeOfTrip;
        double amount;

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan mesafeyi km cinsinden iste
        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = scanner.nextInt();

        // Kullanıcıdan yaşını iste
        System.out.print("Yaşınızı giriniz : ");
        age = scanner.nextInt();

        // Kullanıcıdan yolculuk tipini iste
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        typeOfTrip = scanner.nextInt();

        // Girilen verilerin geçerlilik kontrolünü yap
        if(distance <= 0 || age <= 0 || !(typeOfTrip == 1 || typeOfTrip == 2))
            System.out.println("Hatalı Veri Girdiniz !");
        else{
            // Tutarı hesapla
            amount = (double) distance * 0.1;
            if (age <= 11)
                amount *= 0.5;
            else if (age <= 24)
                amount *= 0.9;
            else if (age > 65)
                amount *= 0.7;

            // Gidiş dönüş seçeneği için tutarı güncelle
            if (typeOfTrip == 2)
                amount = (amount * 0.8) * 2;

            // Toplam tutarı ekrana yazdır
            System.out.println("Toplam Tutar = " + amount + " TL");
        }
    }
}