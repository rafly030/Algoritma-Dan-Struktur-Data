public class number4 {
    public static void main(String[] args) {
        for (int i = 3; i <= 5; i++) {
            for (int j = 2; j <= 6; j++) {
                if (j == 2 && i == 3) { 
                    continue;
                }
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}