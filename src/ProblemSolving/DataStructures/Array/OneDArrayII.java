package ProblemSolving.DataStructures.Array;

import java.util.Scanner;

public class OneDArrayII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int numQueries = scanner.nextInt();


        for (int i = 0; i < numQueries; i++) {
            int[] game = new int[scanner.nextInt()];
            int leaps = scanner.nextInt();
            scanner.nextLine();
            String[] numStrArr = scanner.nextLine().split(" ");
            for (int j = 0; j < game.length; j++) {
                game[j] = Integer.parseInt(numStrArr[j]);
            }

            if (canWin(0, leaps, game)) {
                sb.append("YES");
            } else {
                sb.append("NO");
            }
            if (i != numQueries - 1) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }

    private static boolean canWin(int i, int leaps, int[] game) {
        if (i >= game.length) {
            return true;
        } else if (i < 0 || game[i] == 1) {
            return false;
        }
        game[i] = 1;
        return canWin(i - 1, leaps, game) || canWin(i + 1, leaps, game) || canWin(i + leaps, leaps, game);
    }
}
