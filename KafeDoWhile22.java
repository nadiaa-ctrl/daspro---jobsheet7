
import java.util.Scanner;

public class KafeDoWhile22 {
    public static void main(String[] args) {
        Scanner nad = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, totalHarga;
        int hargaTeh = 7000;
        int hargaRoti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar) : ");
            namaPelanggan = nad.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi : ");
            kopi = nad.nextInt();
            System.out.print("Jumlah teh : ");
            teh = nad.nextInt();
            System.out.print("Jumlah roti : ");
            roti = nad.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar : Rp" + totalHarga);
            nad.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
    }
}
