import java.util.Scanner;

public class ArrayRataNillai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        double ratalulus, rataTidakLulus;
        int nilaiLulus = 0, lulus = 0;
        int nilaiTidakLulus = 0, tidakLulus = 0;
        int n;
        
        System.out.print("Masukkan jumlah Mahasiswa = ");
        n = sc.nextInt();

        int [] nilaiMhs = new int[n];
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                lulus++;
                nilaiLulus += nilaiMhs[i];
            } else if (nilaiMhs[i] <= 70) {
                tidakLulus++;
                nilaiTidakLulus += nilaiMhs[i];
            }
        }
        ratalulus = nilaiLulus / lulus;
        rataTidakLulus = nilaiTidakLulus / tidakLulus;
        System.out.println("Rata-rata nilai lulus = "+ratalulus);
        System.out.println("Banyak Mahasiswa tidak lulus = "+rataTidakLulus);
    }
}