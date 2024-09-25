public class operator { // Nama Class
    public static void main(String[] args) { // Main Method
        // Deklarasi + Inisiasi
        int x = 7;
        int y = 3;

        System.out.println(x - y); // Pengurangan
        System.out.println(x + y); // Penjumlahan
        System.out.println(x * y); // Perkalian
        System.out.println(x / y); // Pembagian
        System.out.println(x % y); // modulus

        // Conditional Operator
        // Operator && dan || digunakan untuk mengoperasikan 2 buah boolean && = dan, ||
        // = Atau
        // Mengembalikan nilai boolean ( true or false )
        int value1 = 1;
        int value2 = 2;
        if (value1 == 1) { // Normal Decision
            System.out.println("bener");
        } else {
            System.out.println("salah");
        }

        // Penggunaan Conditional Operator
        int con1 = 2;
        int con2 = 3;

        if ((con1 == 2) && (con2 == 3)) { // Penggunaan && yang artinya dan jadi semua inputan harus benar
            System.out.println("benar karena con1 dan con2 juga benar");

        }
        if ((value1 == 2) || (value2 == 1)) { // Penggunaan || yang artinya atau jadi jika salah satu inputan benar maka
                                              // akan dinyatakan beanar
            System.out.println("Juga benar karena atau jadi nilai yang diambil merupakan nilai value 1");
        }
    }
}
