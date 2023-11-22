import java.util.Scanner;

public class Art {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] primaryScores = new int[m];
        int total = 0;

        for (int i = 0; i < m; i++) {
            primaryScores[i] = scanner.nextInt();
        }

        int nonZeroIndex = 0;
        for (int i = 0; i < primaryScores.length; i++) {
            if (primaryScores[i] != 0) {
                int temp = primaryScores[i];
                primaryScores[i] = primaryScores[nonZeroIndex];
                primaryScores[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }

        for (int i = 0; i < m; i++) {
            int count = 0;
            int ai = primaryScores[i] * primaryScores[i];
            if (i + ai >= m) {
                for (int j = i + 1; j < m; j++) {
                    count += primaryScores[j];
                }
            } else {
                for (int j = i + 1; j <= i + ai; j++) {
                    count += primaryScores[j];
                }
            }
            total += ai + count;
        }

        System.out.println(total);
    }
}
