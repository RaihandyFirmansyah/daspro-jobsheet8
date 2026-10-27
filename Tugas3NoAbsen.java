import java.util.Scanner;

public class Tugas3NoAbsen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalSemua = 0;
            int maxBarang = -1;   // -1 agar toko pertama pasti tercatat
            int tokoTerbanyak = 0;

            for (int t = 1; t <= jumlahToko; t++) {
                System.out.println("Toko " + t);

                int jumlahPelanggan;
                do {
                    System.out.print("  Jumlah pelanggan: ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarang = 0;
                for (int p = 1; p <= jumlahPelanggan; p++) {
                    int barang;
                    do {
                        System.out.print("  Barang pelanggan " + p + ": ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("  Tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarang += barang;
                }

                System.out.println("Toko " + t + " - pelanggan: " + jumlahPelanggan
                        + ", total barang: " + totalBarang);
                totalSemua += totalBarang;

                if (totalBarang > maxBarang) {   // ">" agar nomor toko terkecil menang
                    maxBarang = totalBarang;
                    tokoTerbanyak = t;
                }
            }

            System.out.println("Total barang seluruh toko: " + totalSemua);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}