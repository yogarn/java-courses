/*
Buatlah tangga menurun ke kanan yang di setiap baris 
dan kolom berisi angka dari 0-9 menaik dan setelah 
angka 9 kembali lagi ke 0 dan terus berulang sampai 
membentuk tangga dengan ukuran yang ditentukan oleh 
user yaitu n. Angka tersebut berjalan secara horizontal 
dulu yang dipisahkan 1 spasi baru kemudian vertikal.
*/

import java.util.Scanner;

public class AngkaTangga {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris = input.nextInt();
        int angka = 0;
        for (int i = 1; i <= baris; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%d ", angka);
                angka++;
                if (angka > 9) {
                    angka = 0;
                }
            }
            System.out.println();
        }
    }
}