import java.util.Scanner;

public class Bioskop06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int HARGA_TIKET = 50000, totalTiketTerjual = 0, jumlahTiket;
        double totalPenjualan = 0;

        System.out.println("(Masukkan angka 0 untuk mengakhiri transaksi)\n");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();

            
            if (jumlahTiket == 0) {
                break;
            }

            
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan masukkan angka yang benar.\n");
                continue;
            }

            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15; 
            } else if (jumlahTiket > 4) {
                diskon = 0.10; 
            }

            double totalHargaSebelumDiskon = jumlahTiket * HARGA_TIKET;
            double nominalDiskon = totalHargaSebelumDiskon * diskon;
            double totalHargaBayar = totalHargaSebelumDiskon - nominalDiskon;

           
            totalTiketTerjual += jumlahTiket;
            totalPenjualan += totalHargaBayar;

            System.out.println("Diskon didapat: " + (int)(diskon * 100) + "%");
            System.out.println("Total bayar transaksi ini: Rp " + (long) totalHargaBayar + "\n");
        }

        System.out.println("Total tiket terjual  : " + totalTiketTerjual + " tiket");
        System.out.println("Total pendapatan hari ini : Rp " + (long) totalPenjualan);

        sc.close();
    }
}