import java.util.Scanner;

public class SearchNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        double key = 0;
        
        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        n = sc.nextInt();
        
        int [] arrNilai = new int[n];
        
            for (int i = 0; i < arrNilai.length; i++) {
                System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+" : ");
                arrNilai[i] = sc.nextInt();
                
            }
            System.out.print("Masukkan nilai yang di cari = ");
            key = sc.nextDouble();
            int hasil = 0;
            for (int i = 0; i < arrNilai.length; i++) {
                if (key == arrNilai[i]) {
                    hasil = i;
                    break;
                } 
            }
            if (hasil  != 0) {
                System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
            } else {
                System.out.println("Nilai yang dicari tidak ditemukan.");
            }
    }
}