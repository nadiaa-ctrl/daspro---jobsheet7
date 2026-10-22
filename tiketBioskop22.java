
import java.util.Scanner;

public class tiketBioskop22 {
    public static void main(String[] args) {
        Scanner nad = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        int totalPenjualan = 0;

        System.out.println("--- TIKET BIOSKOP ---");
        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai) : ");
            jumlahTiket = nad.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Masukkan lagi jumlah tiket!!!");
                continue;
            }
            if (jumlahTiket == 0) {
                break;
            }
            int harga = jumlahTiket * hargaTiket;
            int diskon = 0;
            if (jumlahTiket > 10) {
                System.out.println("Kamu dapet diskon 15%");
                diskon = harga * 15 / 100;
            } else if (jumlahTiket > 4) {
                System.out.println("Kamu dapet diskon 10%");
                diskon = harga * 10 / 100;
            }
            harga = harga - diskon;
            System.out.println("Potongan diskon : Rp" + diskon);
            System.out.println("Total bayar : Rp" + harga);
            totalTiket = totalTiket + jumlahTiket;
            totalPenjualan = totalPenjualan + harga;
        }
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan : " + totalPenjualan);
        System.out.println("--- TERIMAKASI SUDA BERKUNJUNG ---");
    }
}
