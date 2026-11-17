import java.util.Scanner;

public class SIAKAD29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

        if (jumlahMahasiswa < 1 || jumlahMataKuliah < 1) {
            System.out.println("Jumlah mahasiswa dan mata kuliah minimal 1!");
        } else {
            int[][] nilai = new int[jumlahMahasiswa][jumlahMataKuliah];

            for (int i = 0; i < nilai.length; i++) {
                System.out.println("Input nilai mahasiswa ke-" + (i + 1));
                double totalPerSiswa = 0;

                for (int j = 0; j < nilai[i].length; j++) {
                    System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                    nilai[i][j] = sc.nextInt();
                    totalPerSiswa += nilai[i][j];
                }

                System.out.println("Nilai rata-rata: " + totalPerSiswa / nilai[i].length);
            }

            System.out.println("\n========================================");
            System.out.println("Rata-rata nilai setiap mata kuliah:");

            for (int j = 0; j < nilai[0].length; j++) {
                double totalPerMatkul = 0;

                for (int i = 0; i < nilai.length; i++) {
                    totalPerMatkul += nilai[i][j];
                }

                System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / nilai.length);
            }	
        }

        sc.close();
    }
}
