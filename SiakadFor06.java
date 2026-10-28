import java.util.Scanner;

public class SiakadFor06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int JMLlulus = 0 , JMLTDKlulus = 0 ;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " :");
            nilai = sc.nextDouble();
            if  (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }

            if (nilai >= 60) {
                JMLlulus++;
            } else {
                JMLTDKlulus++;
            }
        }

        System.out.println("Nilai tertinggi :" + tertinggi);
        System.out.println("Nilai terendah :" + terendah);
        System.out.println("Jumlah mahasiswa lulus :" + JMLlulus);
        System.out.println("Jumlah mahasiswa tdk lulus :" + JMLTDKlulus);

        sc.close();
    }
}