/*
Andi diberi tugas untuk membuat aplikasi yang dapat melakukan operasi aritmatika 
sederhana. Operasi tersebut adalah penjumlahan, pengurangan, perkalian, pembagian 
(dibulatkan ke bawah), dan modulo. Pada aplikasi tereebut, user diminta memasukkan 
2 angka untuk dilakukan operasi. Bantulah Andi agar dapat membuat program untuk 
melakukan kelima operasi di atas.
*/

import java.util.Scanner;

public class OperasiSimpel {

    public static void main(String[] argz) {
        Scanner input = new Scanner(System.in);
        int angka1 = input.nextInt();
        int angka2 = input.nextInt();
        System.out.printf("%d + %d = %d \n", angka1, angka2, (angka1 + angka2));
        System.out.printf("%d - %d = %d \n", angka1, angka2, (angka1 - angka2));
        System.out.printf("%d * %d = %d \n", angka1, angka2, (angka1 * angka2));
        System.out.printf("%d / %d = %d \n", angka1, angka2, (angka1 / angka2));
        System.out.printf("%d %s %d = %d \n", angka1, "%", angka2, (angka1 % angka2));
    }
}
