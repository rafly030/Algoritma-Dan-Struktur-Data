import java.util.Scanner;

public class HitungGajiLembur {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Input gaji pokok
            System.out.print("Masukkan gaji pokok: ");
            double gajiPokok = input.nextDouble();
            
            // Input jam lembur
            System.out.print("Masukkan jam lembur: ");
            int jamLembur = input.nextInt();
            
            // Input upah lembur
            System.out.print("Masukkan upah lembur per jam: ");
            double upahLembur = input.nextDouble();
            
            // Hitung gaji dan lembur
            double gaji = gajiPokok + (jamLembur * upahLembur);
            
            // Output hasil perhitungan
            System.out.println("Gaji: " + gaji);
        }
    }
}

