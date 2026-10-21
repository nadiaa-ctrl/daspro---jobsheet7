
import java.util.Scanner;

public class SiakadFor22 {
    public static void main(String[] args) {
        Scanner nad = new Scanner(System.in);
        double nilai;
        double tertinggi = 0;
        double terendah = 100;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = nad.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            }else{
                tidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("LULUS : " + lulus);
        System.out.println("TIDAK LULUS : " + tidakLulus);
    }
}
