/*
Buatlah program untuk mencari tahu apakah suatu kata a; (String) terdapat pada suatu kalimat yang panjang
(String) dan menampilkan kata tersebut terdapat pada urutan (posisi) ke berapa serta hitung berapa
jumlahnya. Urutan posisi tersebut dimulai dari 1.
*/

import java.util.Scanner;
import java.util.Arrays;

public class CariKata {

    public static void main(String[] args) {
        // Tuliskan kode kalian di sini
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine();
        String kataTarget = input.next();
        String[] kata = kalimat.split(" ");
        int counter = 0;
        for (int i = 0; i < kata.length; i++) {
            if (kataTarget.equals(kata[i])) {
                System.out.printf("%s ada di posisi %d\n", kataTarget, i + 1);
                counter++;
            }
        }
        if (counter > 0) {
          System.out.printf("Jumlah kata ditemukan = %d\n", counter);
        } else {
            System.out.printf("%s tidak ditemukan\n", kataTarget);
            System.out.printf("Jumlah kata ditemukan = %d\n", counter);
        }
        input.close();
    }
}