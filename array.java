public class array {
    public static void main(String[] args) {
        // Deklarasi Array
        int[] anArray;
        // Alokasi memory array Contoh 10 Integer
        anArray = new int[10];
        // inisiasi mulai array
        anArray[0] = 100;
        // inisiasi array kedua
        anArray[1] = 200;
        // inisiasi array sampai ke 9 (jika array berjumlah 10 maka panjang akan
        // berjumlah 9 karena dimulai dai 0)
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Index 0 : " + anArray[0]);
        System.out.println("Index 1 : " + anArray[1]);
        System.out.println("Index 2 : " + anArray[2]);
        System.out.println("Index 3 : " + anArray[3]);
        System.out.println("Index 4 : " + anArray[4]);
        System.out.println("Index 5 : " + anArray[5]);
        System.out.println("Index 6 : " + anArray[6]);
        System.out.println("Index 7 : " + anArray[7]);
        System.out.println("Index 8 : " + anArray[8]);
        System.out.println("Index 9 : " + anArray[9]);

        // Array 2 Dimensi
        int[] enArray = {
                100, 200, 300, 400, 500, 600, 700, 800, 900, 1000
        };
        System.out.println(enArray[0]);
        System.out.println(enArray[1]);
        System.out.println(enArray[2]);
        System.out.println(enArray[3]);
        System.out.println(enArray[4]);
        System.out.println(enArray[5]);
        System.out.println(enArray[6]);
        System.out.println(enArray[7]);
        System.out.println(enArray[8]);
        System.out.println(enArray[9]);

        String[][] unArray = {
                { "adi", "edi", "udi" },
                { "adu", "edu", "udu" }

        };
        System.out.println(unArray[0][0]); // artinya kolom 0 baris 0 yaitu = "adi"
        System.out.println(unArray[1][2]); // artinya kolom 1 baris 2 yaitu = "udu"
    }
}
