import java.util.Scanner; import java.time.LocalDate;

public class UserInfo { public static void main(String[] args) { Scanner scanner = new Scanner(System.in);

// Meminta input dari pengguna
    System.out.println("=== Program Input Data Pengguna ===");
    System.out.print("Masukkan Nama: ");
    String nama = scanner.nextLine();
    
    System.out.print("Masukkan Jenis Kelamin (P/L): ");
    char jenisKelamin = scanner.next().charAt(0);
    
    System.out.print("Masukkan Tahun Lahir: ");
    int tahunLahir = scanner.nextInt();
    
    // Menutup scanner
    scanner.close();
    
    // Mendapatkan tahun sekarang
    int tahunSekarang = LocalDate.now().getYear();
    int umur = tahunSekarang - tahunLahir;
    
    // Menentukan jenis kelamin
    String gender;
    if (jenisKelamin == 'L' || jenisKelamin == 'l') {
        gender = "Laki-laki";
    } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
        gender = "Perempuan";
    } else {
        gender = "Tidak diketahui";
    }
    
    // Menampilkan output
    System.out.println("\n=== Data Pengguna ===");
    System.out.println("Nama: " + nama);
    System.out.println("Jenis Kelamin: " + gender);
    System.out.println("Tahun Lahir: " + tahunLahir);
    System.out.println("Umur: " + umur + " tahun");
    System.out.println("Terima kasih telah menggunakan program ini!");
}

}

