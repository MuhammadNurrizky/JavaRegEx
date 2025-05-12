import java.util.Arrays;
import java.util.ArrayList;
//
public class Main {
//    /**
////     * Ini adalah prosedur searching.
////     * @param arr The array to search in.
////     * @param target The value to search for.
////     */
////    public void searching(int[] arr, int target) {
////        boolean isfound = false;
////
////
////        for(int i = 0; i < arr.length; i++) {
////            if(arr[i] == target) {
////                isfound = true;
////                System.out.println("Found " + target);
////            }
////        }
////    }
//
//
//
//
//
//
//
//    /**
//     * Ini adalah Function searching.
//     * @param arr The array to search in.
//     * @param x The value to search for.
//     * @return true if the value is found, false otherwise.
//     */
//    public static boolean Searching(int[] arr, int x) {
//        boolean isFound = false;
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == x) {
//                isFound = true;
//            }
//        }
//
//    return isFound;}
//    /**
//     * Ini adalah Function searching.
//     * @param array The array to search in.
//     * @param target The value to search for.
//     * @return The index of the target in the array, or -999 if not found.
//     */
//    public static int Search(int[] array, int target) {
//        int n = -999;
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] == target) {
//                n = i;
//            }
//        }
//    return n;}
//
///**
//     * Ini adalah prosedur swap.
//     * @param a The first number to swap.
//     * @param b The second number to swap.
//     */
//    public void swap(int a, int b) {
//        int c;
//        c = b;
//        b = a;
//        a = c;
//    }
//    public void sort(int[] arr){
//        int iMin;
//
//        for (int i = 0; i < arr.length; i++){
//            iMin = i;
//            for (int j = i + 1; j < arr.length; j++){
//                if (arr[j] < arr[iMin]){
//                    iMin = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[iMin];
//            arr[iMin] = temp;
//        }
//
//    }
//
//
//
//
//
//
//
//
//    public static void main(String[] args) {
//        int [] number = {226, 14, 186, 18, 214, 111, 255, 265, 140, 55, 197, 160, 249, 133, 82, 226, 21, 213, 294, 276, 216, 162, 86, 204, 10, 165, 263, 69, 223, 198};
//        int target = 5;
//        int x = 13;
//        Main main = new Main();
//        boolean isFound = Searching(number, target);
//        int IndexKe = Search(number, x);
//
//        System.out.println("Angka " + target + " ditemukan ");
//
//        System.out.println("Angka " + x + " Berada di index " + IndexKe);
//
//        main.sort(number);
//        System.out.println("Hasil sorting: " + Arrays.toString(number));
//
//    }
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
    public static void main(String[] args) {
//    String str = "Sample String";
//
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
//        }
//
//////        System.out.print("Halo Dunia");    // output: Halo Dunia (tanpa pindah baris)
//////        System.out.println("Halo Dunia");   // output: Halo Dunia, lalu pindah baris
////
////
//        String teks = "Belajar";
//        String terbalik = "";
//        for (int i = teks.length() - 1; i >= 0; i--) {
//            terbalik += teks.charAt(i);
//        }
//        System.out.println(terbalik);  // Output: rajaleB
////
//        String kalimat = "Mencari dalam string";
//        char cari = 'i';
//        int jumlah = 0;
//        for (int i = 0; i < kalimat.length(); i++) {
//            if (kalimat.charAt(i) == cari) {
//                jumlah++;
//            }
//        }
//        System.out.println("Jumlah huruf '" + cari + "': " + jumlah);
//        String str = "Parsing string ini";
//        ArrayList<String> kata = new ArrayList<>();
//
//        while (!str.isEmpty()) {
//            for (int i = 0; i < str.length(); i++) {
//                if (i == str.length() - 1) {
//                    kata.add(str);
//                    str = "";
//                    break;
//                } else if (str.charAt(i) == ' ') {
//                    kata.add(str.substring(0, i));
//                    str = str.substring(i + 1);
//                    break;
//                }
//            }
//        }
//        for (String s : kata) {
//            System.out.println(s + " ");
//        }
        String kalimat = "Belajar Java itu menyenangkan";
//        String[] kata = kalimat.split(" ");
//        Hasilnya adalah array yang berisi setiap kata

//        String[] token = kalimat.split("[aiueo]");
//
//        System.out.println(Arrays.toString(token));
//        System.out.println(Arrays.toString(kata));
////
////
//        String teks = "Belajir Java itu asik";
//        System.out.println(teks.contains("Java"));// true
//        System.out.println(teks.indexOf("asik"));// mengembalikan indeks di mana "asik" muncul
//        System.out.println(teks.indexOf("a", 4));// mencari 'a' dari indeks ke-5
////

        // Menggunakan StringBuilder
//        StringBuilder sb = new StringBuilder("Test immutability");
//
//        // Menggunakan String
//        String str = "Test immutability";
//
//        System.out.println("HashCode StringBuilder: " + sb.hashCode());
//        System.out.println("HashCode String: " + str.hashCode());
////////
//        // Mengubah nilai
//        sb.replace(0, sb.length(), "HelloWorld");
//        str = "HelloWorld";
//
//        System.out.println("HashCode StringBuilder setelah ubah: " + sb.hashCode());
//        System.out.println("HashCode String setelah ubah: " + str.hashCode());
////
////
////
//        System.out.println("Original string: " + sb);
////
        // Menampilkan metode-metode bersama string
//        System.out.println("Length: " + sb.length());
//        System.out.println("Character at 0: " + sb.charAt(0));
//        System.out.println("Substring (1,4): " + sb.substring(1,4));
//        System.out.println("Index of 'acl': " + sb.indexOf("acl"));
////
        // Membalik string
//        System.out.println("Reverse: " + sb.reverse());
//        System.out.println("Reverse kembali: " + sb.reverse());
////
        // Menambahkan teks di akhir
//        sb.append(" is fun");
//        System.out.println("Appended string: " + sb);
////
//////        // Menghapus beberapa karakter
//        sb.delete(8, 13);
//        System.out.println("Deleted string: " + sb);
////
//////        // Menyisipkan teks di posisi tertentu
//        sb.insert(8, " Java Programming");
//        System.out.println("Inserted string: " + sb);
//////
//        // Mengganti bagian dari string
//        sb.replace(13, 25, " String Processing");
//        System.out.println("Replaced string: " + sb);
////
////
//        StringBuilder sb = new StringBuilder("Learning Java with Oracle");
//        int index1 = sb.indexOf("a");
//        int index2 = sb.indexOf("a", 7);
//        System.out.println("Index pertama huruf 'a': " + index1);
//        System.out.println("Index huruf 'a' setelah indeks 7: " + index2);
////
    }}
//
