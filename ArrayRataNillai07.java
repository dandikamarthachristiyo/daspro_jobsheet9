import java.util.Scanner;

public class ArrayRataNillai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        double nilaiLulus = 0, nilaiTidakLulus = 0;
        int lulus = 0, tidakLulus = 0;
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
        nilaiLulus = nilaiLulus / lulus;
        nilaiTidakLulus = nilaiTidakLulus / tidakLulus;
        System.out.println("Rata-rata nilai lulus = "+nilaiLulus);
        System.out.println("Rata-rata nilai tidak lulus = "+nilaiTidakLulus);
    }
}