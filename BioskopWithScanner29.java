import java.util.Scanner;

public class BioskopWithScanner29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int baris, kolom, menu;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        do {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();

                        boolean valid;
                        do {
                            System.out.print("Masukkan baris: ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom: ");
                            kolom = sc.nextInt();
                            sc.nextLine();

                            if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[baris - 1].length) {
                                    System.out.println("Kursi tidak tersedia! Pilih baris 1-" + penonton.length + " dan kolom 1-" + penonton[0].length + ".");
                                valid = false;
                            } else if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Peringatan: kursi baris " + baris + " kolom " + kolom + " sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Silakan pilih kursi lain.");
                                valid = false;
                            } else {
                                valid = true;
                            }
                        } while (!valid);

                        penonton[baris - 1][kolom - 1] = nama;

                        System.out.print("Input penonton lainnya? (y/n): ");
                        pilihan = sc.nextLine();

                        if (pilihan.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nDaftar penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        System.out.print("Baris " + (i + 1) + ": ");
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***");
                            } else {
                                System.out.print(penonton[i][j]);
                            }
                            if (j < penonton[i].length - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia!");
            }
        } while (menu != 3);

        sc.close();
    }
}