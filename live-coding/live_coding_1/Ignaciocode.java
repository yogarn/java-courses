/*
Dalam suatu permaianan "Ignaciocode", terdapat kartu yang berisikan kode unik. 
Kalian ditugaskan untuk menggabungkan kode unik dari beberapa bagian terpisah. 
Perhatikan aturan yang tersedia untuk dapat menggunakan kode unik tersebut 
dalam permainan.
*/

import java.util.Scanner;

public class Ignaciocode {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kata1 = input.nextLine();
        int angka = input.nextInt();
        input.nextLine();
        String kata2 = input.nextLine();
        int angkaAkhir = (angka + 1234);
        System.out.printf("XX%s--%d--%sXX", kata1, angkaAkhir, kata2);
    }
}
