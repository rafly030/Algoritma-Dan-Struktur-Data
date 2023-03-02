import java.util.Scanner;

public class pecahan {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nominal uang: ");
            int nominal = scanner.nextInt();

            int[] denominasi = {50000, 20000, 10000, 5000, 2000, 1000};

            System.out.println("Pecahan uang yang dibutuhkan:");
            for (int i = 0; i < denominasi.length; i++) {
                int jumlah = nominal / denominasi[i];
                nominal %= denominasi[i];
                if (jumlah > 0) {
                    System.out.println(jumlah + " lembar " + denominasi[i] + " rupiah");
                }
            }
            if (nominal > 0) {
                System.out.println(nominal + " keping 500 rupiah");
            }
        }
    }
}
