import java.io.IOException;
import java.util.Scanner;

class Loop_Abadi {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int counter = 1; // Inisialisasi nilai awal

        System.out.println("Program berjalan tanpa henti. Tekan Enter untuk keluar.");

        while (true) { // Infinite loop
            System.out.println("Iterasi ke: " + counter);
            counter++; // Tambahkan nilai iterasi

            // Cek apakah pengguna menekan Enter
            if (System.in.available() > 0) {
                String input = scanner.nextLine();
                if (input.isEmpty()) { // Jika Enter ditekan
                    System.out.println("Program dihentikan oleh pengguna.");
                    break; // Keluar dari loop
                }
            }
        }

        scanner.close(); // Menutup scanner
    }
}