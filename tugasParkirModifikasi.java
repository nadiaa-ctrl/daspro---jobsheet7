
import java.util.Scanner;


public class tugasParkirModifikasi {
    public static void main(String[] args) {
        Scanner nad = new Scanner(System.in);
        int jenis, durasi, total = 0, biaya;

        System.out.println("--- SELAMAT DATANG DI PARKIRAN ---");
        do {
            System.out.print("Masukkan jenis kendaraan (1 mobil, 2 motor, 0 keluar) : ");
            jenis = nad.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan Durasi (jam) : ");
                durasi = nad.nextInt();

                if (jenis == 1) {
                    biaya = durasi * 3000;
                    System.out.println("Biaya parkir anda adalah : Rp" +biaya);
                } else {
                    biaya = durasi * 2000;
                    System.out.println("Biaya parkir anda adalah : Rp" +biaya);
                }
                total += biaya;
            }
        } while (jenis != 0);
        System.out.println("Total pembayaran anda sebesar : Rp" +total);
        System.out.println("--- TERIMAKASI ---");
    }
}
