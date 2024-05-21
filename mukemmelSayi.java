// Kendisi hariç pozitif bölenleri toplamı kendisine eşit olan sayılara 'Mükemmel Sayılar' denir.
// Örnek : 28 , 496 , 8128

import java.util.*;
public class mukemmelSayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Sayı Giriniz : ");
        int n = input.nextInt();

        for (int i = 1; i < n; i++) {

            if (n%i==0){

                toplam += i;
            }

        }
        System.out.println();

        if (toplam == n) {
            System.out.println("Girilen " + n + " Sayısı Mükemmel Sayıdır.");

        }
        else {
            System.out.println("Girilen " + n + " Sayısı Mükemmel Sayı değildir.");
        }
    }
}