/*
Dalam suatu permainan Claw Machine terdapat 4 hadiah. Pemain diharuskan 
membayar tiket masuk sesuai dengan harga yang telah ditentukan sistem 
untuk bisa bermain dan mendapatkan salah satu dari 4 hadiah di atas. 
Pemain akan bermain berkali-kali selama saldonya cukup. Permainan 
berakhir ketika ketika saldo kurang atau pemain mengetik selesai. 
Kalian ditugaskan untuk membuat program yang akan digunakan pada Claw 
Machine ini untuk memasukkan nama, saldo, harga tiket, dan 4 
hadiah-hadiah yang dapat diambil pada mesin. Untuk ketentuan input dan 
output dapat dilihat bagian Input Format dan Output Format. Untuk fungsi 
yang dapat diinput ketika bermain :

ambil <x> di mana x adalah bilangan untuk mengambil (mencapit) hadiah 
sesuai urutan saat diinputkan.

selesai adalah fungsi untuk mengakhiri permainan.
*/

import java.util.Scanner;

public class ClawMachineV3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        int saldo = input.nextInt();
        int hargaTiket = input.nextInt();
        input.nextLine();
        String barang1 = input.nextLine();
        String barang2 = input.nextLine();
        String barang3 = input.nextLine();
        String barang4 = input.nextLine();
        
        System.out.printf("Halo %s%n", nama);
        System.out.printf("Saldo awal = Rp. %d%n", saldo);
        System.out.printf("Harga tiket = Rp. %d%n", hargaTiket);
        System.out.println("-".repeat(30));
        
        while (true) {
            String perintah = input.next();
            if (perintah.equalsIgnoreCase("selesai")) {
                break;
            } else {
                int inputBarang = input.nextInt();
                if (saldo >= hargaTiket) {
                    if (inputBarang == 1) {
                        System.out.printf("Anda mendapatkan %s%n", barang1);
                        saldo -= hargaTiket;
                        System.out.printf("Sisa saldo = Rp. %d%n", saldo);
                        System.out.println("-".repeat(30));
                    } else if (inputBarang == 2) {
                        System.out.printf("Anda mendapatkan %s%n", barang2);
                        saldo -= hargaTiket;
                        System.out.printf("Sisa saldo = Rp. %d%n", saldo);
                        System.out.println("-".repeat(30));
                    } else if (inputBarang == 3) {
                        System.out.printf("Anda mendapatkan %s%n", barang3);
                        saldo -= hargaTiket;
                        System.out.printf("Sisa saldo = Rp. %d%n", saldo);
                        System.out.println("-".repeat(30));
                    } else if (inputBarang == 4) {
                        System.out.printf("Anda mendapatkan %s%n", barang4);
                        saldo -= hargaTiket;
                        System.out.printf("Sisa saldo = Rp. %d%n", saldo);
                        System.out.println("-".repeat(30));
                    } else {
                        System.out.println("Anda belum beruntung");
                        saldo -= hargaTiket;
                        System.out.printf("Sisa saldo = Rp. %d%n", saldo);
                        System.out.println("-".repeat(30));
                    }
                } else {
                    System.out.println("Maaf saldo tidak cukup");
                    break;
                }
            }
        }
        System.out.println("Permainan selesai");
    }
}