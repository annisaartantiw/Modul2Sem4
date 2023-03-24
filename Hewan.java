package Modul2;
import java.util.LinkedList;
import java.util.List;

public class Hewan {
        public static void main(String[] args) {
            // Membuat objek LinkedList hewan
            List<String> hewan = new LinkedList<>();
            hewan.add("Sapi");
            hewan.add("Kelinci");
            hewan.add("Kambing");
            hewan.add("Unta");
            hewan.add("Domba");

            // Membuat objek LinkedList deleteHewan
            List<String> deleteHewan = new LinkedList<>();
            deleteHewan.add("Kambing");
            deleteHewan.add("Kelinci");
            deleteHewan.add("Unta");

            // Menghapus hewan yang sama dengan warna pada deleteHewan
            for (String ragam : deleteHewan) {
                if (hewan.contains(ragam)) {
                    hewan.remove(ragam);
                }
            }

            // Menampilkan hasil setelah penghapusan
            System.out.println("Hasil setelah penghapusan: ");
            for (String h : hewan) {
                System.out.println(h);
            }
        }
    }

