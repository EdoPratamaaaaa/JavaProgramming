import java.util.Scanner;

public class MainClass {

    // Menampilkan menu utama
    static void menu() {
        System.out.println("============================");
        System.out.println("Menu Ganjil Genap");
        System.out.println("1. Cek Ganjil Genap");
        System.out.println("2. Print Genap/Ganjil (dgn limit)");
        System.out.println("3. Exit");
        System.out.println("============================");
        System.out.print("Pilihan : ");
    }
P
    // Mencetak angka ganjil atau genap hingga limit tertentu
    static void printGanjilGenap(int limit, String pilihan) {
        if (limit < 1) {
            System.out.println("Input limit tidak valid!!!");
            return;
        }

        if (pilihan.equalsIgnoreCase("Ganjil")) {
            System.out.println("Print bilangan Ganjil antara 1 - " + limit + "!!");
            for (int i = 1; i <= limit; i += 2) {
                System.out.print(i + ", ");
            }
        } else if (pilihan.equalsIgnoreCase("Genap")) {
            System.out.println("Print bilangan Genap antara 1 - " + limit + "!!");
            for (int i = 2; i <= limit; i += 2) {
                System.out.print(i + ", ");
            }
        } else {
            System.out.println("Input pilihan tidak valid!!!");
        }
        System.out.println("\n============================");
    }

    // Mengecek apakah sebuah bilangan ganjil atau genap
    static String cekGanjilGenap(int input) {
        if (input < 1) {
            return "Invalid Input!!";
        }
        return (input % 2 == 0) ? "Genap" : "Ganjil";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        while (pilihan != 3) {
            menu();
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1: // Cek Ganjil Genap
                    System.out.print("Masukan Bilangan yang ingin di cek : ");
                    int bilangan = scanner.nextInt();
                    System.out.println(cekGanjilGenap(bilangan));
                    System.out.println("============================");
                    break;
                case 2: // Print Ganjil Genap dengan limit
                    System.out.print("Pilih (Ganjil/Genap) : ");
                    String jenis = scanner.next();
                    System.out.print("Masukan limit : ");
                    int limit = scanner.nextInt();
                    printGanjilGenap(limit, jenis);
                    break;
                case 3: // Keluar
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!!");
                    System.out.println("============================");
                    break;
            }
        }
        scanner.close();
    }
}
