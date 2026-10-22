
import java.util.Scanner;

public class tugasParkir22 {
    public static void main(String[] args) {
        Scanner nad = new Scanner(System.in);
        int jenis, durasi, total = 0;

        System.out.println("--- SELAMAT DATANG DI PARKIRAAN ---");

        do { 
            System.out.print("Masukkan jenis kendaraan (1 motor, 2 mobil, 0 keluar) : ");
            jenis = nad.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi (jam) : ");
                durasi = nad.nextInt();
                if (jenis == 1) {
                    total += durasi * 3000;  
                }else{
                    total += durasi * 2000;
                }
            }
        } while (jenis != 0);
        System.out.println("Total pembayaran anda : Rp" +total);
        System.out.println("--- TERIMAKASIH ---");
    }
}
