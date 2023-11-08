/*
Untuk bermain dalam permainan Claw Machine, pemain diharuskan membayar 
tiket masuk sesuai dengan harga yang telah ditentukan sistem. Kalian 
ditugaskan untuk mengecek apakah saldo pemain cukup untuk dapat memulai 
permainan. Jika saldo cukup, output kalimat "Selamat bermain <nama pemain>" 
dan sisa saldo pemain pada baris selanjutnya "Sisa saldo = <sisa saldo>". 
Sebaliknya jika saldo kurang, output kalimat "Maaf <nama pemain>, saldo 
Anda tidak cukup" (tanpa petik)
*/

import java.util.Scanner;

public class ClawMachine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        int harga = input.nextInt();
        int saldo = input.nextInt();
        if (saldo >= harga) {
            System.out.printf("Selamat bermain %s %n", nama);
            System.out.println("Sisa saldo = " + (saldo - harga));
        } else if (saldo < harga) {
            System.out.printf("Maaf %s, saldo Anda tidak cukup", nama);
        }
    }
}