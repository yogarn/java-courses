/*
Dalam suatu permainan Claw Machine terdapat n hadiah. Pemain akan bermain sebanyak m kali tanpa biaya
apapun (gratis karena akhir tahun) untuk mendapatkan salah satu dari n hadiah di atas (atau zonk). Kalian
ditugaskan untuk membuat program yang akan digunakan pada Claw Machine ini untuk memasukkan nama
dan n hadiah-hadiah yang dapat diambil pada mesin, lalu mengoutputkan hadiah yang diambil Oleh pemain
dengan sintaks ambit di mana adalah bilangan untuk mengambil (mencapit) hadiah. Ketentuan
permainan ini adalah hadiah yang telah diambil tidak bisa diambil lagi (meskipun gratis tetap ada limitnya
dong).
*/

import java.util.Scanner;
import java.util.Arrays;

public class ClawMachineV4 {

    public static void main(String[] args) {
        // Tuliskan kode kalian di sini
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        int maksHadiah = input.nextInt();
        input.nextLine();
        String[] hadiah = new String[maksHadiah];
        boolean[] terambil = new boolean[maksHadiah];
        System.out.printf("Halo %s\n", nama);
        for (int i = 0; i < maksHadiah; i++) {
            hadiah[i] = input.nextLine();
        }
        int maksAmbil = input.nextInt();
        input.nextLine();
        String perintah = "";
        int nomorAmbil = 0; 

        for (int i = 0; i < maksAmbil; i++) {
            input.next();
            nomorAmbil = input.nextInt();
            if ((nomorAmbil > maksHadiah) || (nomorAmbil < 1)) {
                System.out.println("Anda belum beruntung");
            } else if (!(terambil[nomorAmbil - 1])) {
                System.out.printf("Anda mendapatkan %s\n", hadiah[nomorAmbil - 1]);
                terambil[nomorAmbil - 1] = true;
            } else if (terambil[nomorAmbil - 1]) {
                System.out.printf("Maaf, %s sudah diambil\n", hadiah[nomorAmbil - 1]);
            }
        }
    
    }
}