// /**
//  * SearchNilai06
//  */
// public class SearchNilai06 {

//     public static void main(String[] args) {
//         int[] arrNilai = { 80, 85, 78, 96, 90, 82, 86 };
//         int key = 90;
//         int hasil = 0;
//         for (int i = 0; i < arrNilai.length; i++) {
//             if (key == arrNilai[i]) {
//                 hasil = i;
//                 break;
//    i         }
//         }
//         System.out.println();
//         System.out.println("Nilai " + key + " ketemu di index ke-" + hasil);
//         System.out.println();
//     }
// }
import java.util.Scanner;

public class SearchNilai06 {

    public static void main(String[] args) {

        Scanner nilai = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int n = nilai.nextInt();

        int[] nilaiMahasiswa = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = nilai.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int nilaiDicari = nilai.nextInt();

        boolean ketemu = false;
        int hasil = -1;
        for (int i = 0; i < n; i++) {
            if (nilaiMahasiswa[i] == nilaiDicari) {
                ketemu = true;
                hasil = i;
                break;
            }
        }

        if (ketemu) {
            System.out.println("Nilai " + nilaiDicari + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("Nilai " + nilaiDicari + " tidak ditemukan");
        }
    }
}