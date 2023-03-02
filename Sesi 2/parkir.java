import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {
        try (var input = new Scanner(System.in)) {
            System.out.print("Jam Masuk : ");
            int jamMasuk = input.nextInt();

            System.out.print("Jam Keluar : ");
            int jamKeluar = input.nextInt();

            System.out.print("Biaya per Jam: ");
            int biayaPerJam = input.nextInt();

            int lamaParkir = jamKeluar - jamMasuk;
            int biayaParkir = lamaParkir * biayaPerJam;

            System.out.println("Biaya Parkir: " + biayaParkir);
        }
    }
}
