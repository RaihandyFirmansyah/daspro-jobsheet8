import java.util.Scanner;

public class Tugas121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("n minimal 1.");
        } else {
            int total = 0;                       // penampung total angka tercetak

            for (int i = 1; i <= n; i++) {       // outer loop: baris
                for (int j = 1; j <= i; j++) {   // inner loop: angka 1 sampai i
                    if (j > 1) {
                        System.out.print(" ");   // spasi pemisah antar angka
                    }
                    System.out.print(j);
                    total++;                     // hitung setiap angka yang dicetak
                }
                System.out.println();            // pindah baris
            }
            System.out.println("Total angka tercetak: " + total);
        }
        sc.close();
    }
}