import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String lastThreeNIM = "010"; // Ganti dengan 3 digit terakhir NIM kalian
        final String validAdminUsername = "Admin" + lastThreeNIM;
        final String validAdminPassword = "password" + lastThreeNIM;
        final String validStudentName = "Ken Aryo Bimantoro"; // Ganti dengan nama kalian
        final String validStudentNIM = "202310370311006"; // Ganti dengan NIM kalian

        System.out.println("Pilih jenis login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        if (choice == 1) {
            // Login sebagai Admin
            System.out.print("Masukkan Username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            String password = scanner.nextLine();

            if (username.equals(validAdminUsername) && password.equals(validAdminPassword)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (choice == 2) {
            // Login sebagai Mahasiswa
            System.out.print("Masukkan Nama: ");
            String name = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            if (name.equals(validStudentName) && nim.equals(validStudentNIM)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + name);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}