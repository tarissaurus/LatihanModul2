package modul2;

import java.util.LinkedList;

public class Hewan {
    public static void main(String[] args) {
         // Membuat objek Hewan dan menambahkan beberapa elemen
        LinkedList<String> hewan = new LinkedList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        
        System.out.println("Hewan : " + hewan);
        
        // Membuat objek DeleteHewan dan menambahkan beberapa elemen
        LinkedList<String> delHewan = new LinkedList<>();
        delHewan.add("Kelinci");
        delHewan.add("Kambing");
        delHewan.add("Unta");
        
        System.out.println("Hewan yang dihapus : " + delHewan);
        
        // Untuk menghapus data pada LinkedList Hewan yang sama dengan data pada LinkedList DeleteHewan
        for (String data : delHewan) {
            hewan.remove(data);
        }

        // Untuk menampilkan LinkedList Hewan setelah penghapusan
        System.out.println("Output Hewan: "+ hewan);
    }
}