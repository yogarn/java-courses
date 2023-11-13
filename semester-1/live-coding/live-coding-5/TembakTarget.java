/*
Buatlah program untuk membuat papan berukuran a x b dengan bagian yang kosong diisi dengan (titik),
namun terdapat satu titik koordinat yang merupakan target untuk ditembak yang ditandai dengan "O". Anda
diberikan kesempatan untuk menembak sebanyak n kali. Saat menembak, papan akan ditandai dengan "X".
Jika tembakan tepat sasaran simbol target akan berubah menjadi "W". Koordinat dimulai dari (O, O) dan
bergerak ke kanan bawah.
*/

import java.util.Scanner;
import java.util.Arrays;

public class TembakTarget {

    public static void main(String[] args) {
        // Tuliskan kode kalian di sini
        Scanner input = new Scanner(System.in);
        int barisPapan = input.nextInt();
        int kolomPapan = input.nextInt();
        char[][] papan = new char[barisPapan][kolomPapan];
        for (int i = 0; i < barisPapan; i++) {
            for (int j = 0; j < kolomPapan; j++) {
                papan[i][j] = '.';
            }
        }

        int barisTarget = input.nextInt();
        int kolomTarget = input.nextInt();
        papan[barisTarget][kolomTarget] = 'O';

        int maksShot = input.nextInt();

        for (int i = 0; i < maksShot; i++) {
            int barisShot = input.nextInt();
            int kolomShot = input.nextInt();
            papan[barisShot][kolomShot] = 'X';

            if (barisShot == barisTarget && kolomShot == kolomTarget) {
                System.out.println("Bullseye");
                papan[barisShot][kolomShot] = 'W';
            } else if (papan[barisShot - 1][kolomShot] == 'O' || papan[barisShot + 1][kolomShot] == 'O'
                    || papan[barisShot][kolomShot - 1] == 'O' || papan[barisShot][kolomShot + 1] == 'O') {
                System.out.println("Near Miss");
            } else {
                System.out.println("Miss");
            }

            // print papan
            for (int j = 0; j < barisPapan; j++) {
                for (int k = 0; k < kolomPapan; k++) {
                    System.out.print(papan[j][k]);
                }
                System.out.println();
            }
        }

        input.close();
    }
}