/*
Buatlah program untuk mengecek suatu bilangan dan 
mengetahui nilai tempat suatu bilangan tersebut 
apakah Nol, Satuan, atau Puluhan.
*/

import java.util.Scanner;

public class NolSatuanPuluhan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        String nilai = "";
        if (angka >= 0) {
            if (angka > 9) {
                nilai = "Puluhan";
            } else if (angka > 0) {
                nilai = "Satuan";
            } else if (angka == 0) {
                nilai = "Nol";
            }
        } else {
            if (angka < -9) {
                nilai = "Puluhan";
            } else if (angka < 0) {
                nilai = "Satuan";
            } else if (angka == 0) {
                nilai = "Nol";
            }
        }
        System.out.println(nilai);
    }
}