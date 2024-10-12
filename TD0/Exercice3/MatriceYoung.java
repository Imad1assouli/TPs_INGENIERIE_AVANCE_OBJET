package Liskov;

import java.util.Arrays;
/*Un tableau de Young (ou tableau de Young-Ferrers) est une disposition d'entiers dans un tableau de cases,
 où les lignes et les colonnes sont ordonnées de manière croissante.
Plus formellement, un tableau de Young remplit ces deux conditions :
 */
/*Les nombres dans chaque ligne sont disposés dans un ordre croissant, c'est-à-dire que
 chaque élément dans une ligne est inférieur ou égal à celui qui le suit.
 */
/*Les nombres dans chaque colonne sont également disposés dans un ordre croissant, c'est-à-dire
que chaque élément dans une colonne est inférieur ou égal à celui qui se trouve en dessous.
 */
/*Le tableau de Young doit implementer deux opérations : Extraire Min et inserer, il faut garder les deux
conditions valables aprs chaque opération.
 */
 /*Exemple :
        1  2  3
        2  4  5
        6  7  8

  */

public class MatriceYoung {
    private static final int INF = Integer.MAX_VALUE;
    private int[][] matrix;
    private int n, m;

    public MatriceYoung(int n, int m) {
        this.n = n;
        this.m = m;
        matrix = new int[n][m];
        for (int[] row : matrix) {
            Arrays.fill(row, INF);
        }
    }

    public int extraireMin() {
        if (matrix[0][0] == INF) {
            System.out.println("Le tableau de Young est vide.");
            return INF;
        }

        int min = matrix[0][0];
        matrix[0][0] = INF;
        equilibrerTableau(0, 0);
        return min;
    }

    public boolean inserer(int key) {
        if (matrix[n - 1][m - 1] != INF) {
            System.out.println("Le tableau de Young est plein.");
            return false;
        }

        matrix[n - 1][m - 1] = key;
        int i = n - 1;
        int j = m - 1;

        while (true) {
            int top = (i > 0) ? matrix[i - 1][j] : INF;
            int left = (j > 0) ? matrix[i][j - 1] : INF;

            if ((i == 0 && j == 0) || (key >= top && key >= left)) {
                break;
            } else if (top < left && i > 0) {
                matrix[i][j] = top;
                i--;
            } else if (j > 0) {
                matrix[i][j] = left;
                j--;
            }
        }

        matrix[i][j] = key;
        return true;
    }


    private void equilibrerTableau(int i, int j) {
        int down = (i + 1 < n) ? matrix[i + 1][j] : INF;
        int right = (j + 1 < m) ? matrix[i][j + 1] : INF;

        if (down == INF && right == INF) {
            return;
        }

        if (down < right) {
            matrix[i][j] = down;
            equilibrerTableau(i + 1, j);
        } else {
            matrix[i][j] = right;
            equilibrerTableau(i, j + 1);
        }
    }

    public void printTableau() {
        System.out.println("État actuel du tableau :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
