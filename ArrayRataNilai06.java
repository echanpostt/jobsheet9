// import java.util.Scanner;

// /**
//  * ArrayRataNilai06
//  */
// public class ArrayRataNilai06 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] nilaiMhs = new int[10];
//         double total = 0;
//         double rata2;
//         int jmlhLulus = 0;
//         for (int i = 0; i < nilaiMhs.length; i++) {
//             System.out.print("masukkan nilai mahasiswa ke-" + (i + 1) + " :");
//             nilaiMhs[i] = sc.nextInt();
//         }
//         for (int i = 0; i < nilaiMhs.length; i++) {
//             total += nilaiMhs[i];
//             if (nilaiMhs[i] > 70) {
//                 jmlhLulus++;
//             }
//         }
//         for (int i = 0; i < nilaiMhs.length; i++) {
//             total = total + nilaiMhs[i];
//         }
//         rata2 = total / nilaiMhs.length;
//         System.out.println("Rata-rata nilai = " + rata2);
//         System.out.println("Jumlah mahasiswa lulus = " + jmlhLulus);
//     }
// }
import java.util.Scanner;

/**
 * ArrayRataNilai06
 */
public class ArrayRataNilai06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[5];
        double total = 0, totalLulus = 0, totalTidakLulus = 0;
        int Lulus = 0, TidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                Lulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                TidakLulus++;
            }
        }
        System.out.println("Rata-rata nilai lulus = " + (Lulus > 0 ? totalLulus / Lulus : 0));
        System.out.println(
                "Rata-rata nilai tidak lulus = " + (TidakLulus > 0 ? totalTidakLulus / TidakLulus : 0));
    }
}
