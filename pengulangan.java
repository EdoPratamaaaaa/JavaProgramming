public class pengulangan {
    public static void main(String[] args) {
        // while-do, kode akan dieksekusi terus menerus jika kondisi benar
        // int con1 = 6;
        // while (con1 > 1) {
        // System.out.println("con1" + con1);
        // con1++;
        // }

        // do-while, kode akan dieksekusi sampai dengan kondisi salah
        // int con2 = 7;
        // do {
        // System.out.println("con2" + con2);
        // con2++;
        // } while (con2 < 10);

        // For Loop digunakan untuk mengulangkan sesuai dengan iterasi yang telah
        // ditentukan
        // for (int i = 1; i < 10; i++) { // (int i = 1 = Inisiasi ) ; ( i < 10 =kondisi
        // ) ; ( i++ = increment )
        // System.out.println(i);
        // }

        // Enchanced for loop, befungsi untuk melakukan serangkaian statement pada 1 set
        // data
        int[] listAngka = { 1, 2, 3, 4, 5, 6, 7, 8 };
        for (int i : listAngka) {
            System.out.println(i);
        }
    }
}
