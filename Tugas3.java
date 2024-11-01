import java.util.Scanner;
import java.util.Arrays;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner daftar = new Scanner(System.in);
        System.out.println(
                "---------------------------------------------------------------------------------------------");
        System.out.println(
                "--------------------------- Menu Makanan Yang Tersedia Di Restoran --------------------------");
        System.out.println(
                "---------------------------------------------------------------------------------------------");
        System.out.println(
                "-Nasi Goreng\n-Mie Goreng\n-Roti Bakar\n-Kentang Goreng\n-Teh Tarik\n-Cappucino\n-Chcolate ice");

        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chcolate ice" };

        System.out.print("masukkan nama makanan yang dicari: ");
        String makanan = daftar.nextLine();

        boolean found = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makanan)) {
                found = true;
                break;
            }

        }
        if (found) {
            System.out.println("Makanan " + makanan + " tersedia di menu.");
        } else {
            System.out.println("Makanan " + makanan + " tidak tersedia di menu.");
        }
    }
}