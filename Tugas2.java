import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner kedaiKopi = new Scanner(System.in);

        System.out.println("------------------------------------------");
        System.out.println("------------ kedai kopi GOGOK ------------");
        System.out.println("------------------------------------------");
        System.out.print("masukkan jumlah pesanan: ");
        int jumlahPesanan = kedaiKopi.nextInt();
        kedaiKopi.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = kedaiKopi.nextLine();

            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            hargaPesanan[i] = kedaiKopi.nextInt();
            kedaiKopi.nextLine();
        }

        int totalBiaya = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            totalBiaya += hargaPesanan[i];
        }

        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp." + hargaPesanan[i]);
        }

        System.out.println("\nTotal Biaya: Rp." + totalBiaya);

    }
}