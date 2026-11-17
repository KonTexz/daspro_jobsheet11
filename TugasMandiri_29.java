import java.util.Scanner;

public class TugasMandiri_29 {
    public static void main(String[] args) {
        final int JUMLAH_RESPONDEN = 10;
        final int JUMLAH_PERTANYAAN = 6;

        Scanner sc = new Scanner(System.in);
        int[][] survei = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];

        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                int jawaban;
                do {
                    System.out.print("Jawaban pertanyaan " + (j + 1) + " (1-5): ");
                    jawaban = sc.nextInt();
                    if (jawaban < 1 || jawaban > 5) {
                        System.out.println("Jawaban harus 1 sampai 5!");
                    }
                } while (jawaban < 1 || jawaban > 5);
                survei[i][j] = jawaban;
            }
        }

        double totalSemua = 0;

        System.out.println("\n===== Rata-rata setiap responden =====");
        for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
            double total = 0;
            for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
                total += survei[i][j];
            }
            totalSemua += total;
            System.out.printf("Responden ke-%d: %.2f%n", (i + 1), total / JUMLAH_PERTANYAAN);
        }

        System.out.println("\n===== Rata-rata setiap pertanyaan =====");
        for (int j = 0; j < JUMLAH_PERTANYAAN; j++) {
            double total = 0;
            for (int i = 0; i < JUMLAH_RESPONDEN; i++) {
                total += survei[i][j];
            }
            System.out.printf("Pertanyaan ke-%d: %.2f%n", (j + 1), total / JUMLAH_RESPONDEN);
        }

        System.out.println("\n===== Rata-rata keseluruhan =====");
        System.out.printf("Rata-rata keseluruhan: %.2f%n", totalSemua / (JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN));

        sc.close();
    }
}