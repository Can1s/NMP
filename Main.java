package processor;

import java.util.Scanner;

public class Main {
    public static  void commands() {
        System.out.println("1. Add matrices");
        System.out.println("2. Multiply matrix to a constant");
        System.out.println("3. Multiply matrices");
        System.out.println("4. Transpose matrix");
        System.out.println("5. Calculate a determinant");
        System.out.println("6. Inverse matrix");
        System.out.println("0. Exit");
    }

    public static void addMatrices() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of first matrix: ");
        int rows1 = scanner.nextInt();
        int columns1 = scanner.nextInt();
        double[][] matrice1 = new double[rows1][columns1];
        System.out.println("Enter first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrice1[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Enter size of second matrix: ");
        int rows2 = scanner.nextInt();
        int columns2 = scanner.nextInt();
        double[][] matrice2 = new double[rows2][columns2];
        System.out.println("Enter second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrice2[i][j] = scanner.nextDouble();
            }
        }

        double[][] finalMATRICE = new double[rows1][columns1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                finalMATRICE[i][j] = (matrice1[i][j] + matrice2[i][j]);
            }
        }

        System.out.println("The addition result is:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                System.out.print(finalMATRICE[i][j] + " ");
                if(j + 1 == columns1) System.out.println();
            }
        }
    }

    public static void multiplyMATRIXTOACONSTANT() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of matrix: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        double[][] matrice = new double[rows][columns];

        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrice[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Multiplied to: ");
        int multiplyNumber = scanner.nextInt();

        double[][] finalMATRICE = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                finalMATRICE[i][j] = matrice[i][j] * multiplyNumber;
            }
        }

        System.out.println("The multiplication result is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(finalMATRICE[i][j] + " ");
                if(j + 1 == columns) System.out.println();
            }
        }
    }

    public static void multiplyMATRICES() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of first matrix: ");
        int rows1 = scanner.nextInt();
        int columns1 = scanner.nextInt();
        double[][] matrice1 = new double[rows1][columns1];
        System.out.println("Enter first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrice1[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Enter size of second matrix: ");
        int rows2 = scanner.nextInt();
        int columns2 = scanner.nextInt();
        double[][] matrice2 = new double[rows2][columns2];
        System.out.println("Enter second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrice2[i][j] = scanner.nextDouble();
            }
        }
        /*
        Количество столбцов 1-й матрицы должно быть равно количеству строк 2-й матрицы.
        И результат будет иметь то же количество строк, что и 1-я матрица,
        и столько же столбцов, что и 2-я матрица.
         */
        double[][] finalMATRICE = new double[rows1][columns2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < rows2; ++k) {
                    finalMATRICE[i][j] += matrice1[i][k] * matrice2[k][j];
                }
            }
        }

        System.out.println("The multiplication result is:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(finalMATRICE[i][j] + " ");
                if(j + 1 == columns2) System.out.println();
            }
        }
    }

    public static void transposeMATRIX() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Main diagonal");
        System.out.println("2. Side diagonal");
        System.out.println("3. Vertical line");
        System.out.println("4. Horizontal line");

        System.out.println("Your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter matrix size: ");
                int rows = scanner.nextInt();
                int columns = scanner.nextInt();
                double[][] matrix = new double[rows][columns];
                System.out.println("Enter matrix:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        matrix[i][j] = scanner.nextDouble();
                    }
                }

                double[][] finalMATRIX = new double[columns][rows];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        finalMATRIX[j][i] = matrix[i][j];
                    }
                }

                System.out.println("The result is:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print(finalMATRIX[i][j] + " ");
                        if(j + 1 == columns) System.out.println();
                    }
                }
                break;

            case 2:
                System.out.println("Enter matrix size: ");
                int rows2 = scanner.nextInt();
                int columns2 = scanner.nextInt();
                double[][] matrix2 = new double[rows2][columns2];
                System.out.println("Enter matrix:");
                for (int i = 0; i < rows2; i++) {
                    for (int j = 0; j < columns2; j++) {
                        matrix2[i][j] = scanner.nextDouble();
                    }
                }

                double[][] finalMATRIX2 = new double[columns2][rows2];
                for (int i = 0; i < rows2; i++) {
                    for (int j = 0; j < columns2; j++) {
                        finalMATRIX2[j][i] = matrix2[rows2 - 1 - i][columns2 - 1 - j];
                    }
                }

                System.out.println("The result is:");
                for (int i = 0; i < rows2; i++) {
                    for (int j = 0; j < columns2; j++) {
                        System.out.print(finalMATRIX2[i][j] + " ");
                        if(j + 1 == columns2) System.out.println();
                    }
                }
                break;

            case 3:
                System.out.println("Enter matrix size: ");
                int rows3 = scanner.nextInt();
                int columns3 = scanner.nextInt();
                double[][] matrix3 = new double[rows3][columns3];
                System.out.println("Enter matrix:");
                for (int i = 0; i < rows3; i++) {
                    for (int j = 0; j < columns3; j++) {
                        matrix3[i][j] = scanner.nextDouble();
                    }
                }

                for (int i = 0; i < rows3; i++) {
                    for (int j = 0; j < columns3 / 2; j++) {
                        double tmp = matrix3[i][columns3 - 1 - j];
                        matrix3[i][columns3 - 1 - j] = matrix3[i][j];
                        matrix3[i][j] = tmp;
                    }
                }

                System.out.println("The result is:");
                for (int i = 0; i < rows3; i++) {
                    for (int j = 0; j < columns3; j++) {
                        System.out.print(matrix3[i][j] + " ");
                        if(j + 1 == columns3) System.out.println();
                    }
                }
                break;

            case 4:
                System.out.println("Enter matrix size: ");
                int rows4 = scanner.nextInt();
                int columns4 = scanner.nextInt();
                double[][] matrix4 = new double[rows4][columns4];
                System.out.println("Enter matrix:");
                for (int i = 0; i < rows4; i++) {
                    for (int j = 0; j < columns4; j++) {
                        matrix4[i][j] = scanner.nextDouble();
                    }
                }

                for (int i = 0; i < rows4 / 2; i++) {
                    for (int j = 0; j < columns4; j++) {
                        double tmp = matrix4[rows4 - 1 - i][j];
                        matrix4[rows4 - 1 - i][j] = matrix4[i][j];
                        matrix4[i][j] = tmp;
                    }
                }

                System.out.println("The result is:");
                for (int i = 0; i < rows4; i++) {
                    for (int j = 0; j < columns4; j++) {
                        System.out.print(matrix4[i][j] + " ");
                        if(j + 1 == columns4) System.out.println();
                    }
                }
                break;
        }
    }

    public static double det(double[][] A){
        int n = A.length;
        if(n == 1) return A[0][0];
        double ans = 0;
        double[][] B = new double[n-1][n-1];
        int l = 1;
        for(int i = 0; i < n; ++i){
            int x = 0, y = 0;
            for(int j = 1; j < n; ++j){
                for(int k = 0; k < n; ++k){
                    if(i == k) continue;
                    B[x][y] = A[j][k];
                    ++y;
                    if(y == n - 1){
                        y = 0;
                        ++x;
                    }
                }
            }
            ans += l * A[0][i] * det(B);
            l *= (-1);
        }
        return ans;
    }

    public static void determinantMATRICE() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix size: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        double[][] matrix = new double[rows][columns];
        System.out.println("Enter matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("The result is:");
        System.out.println(det(matrix));
    }
    public static double[][] inverse(double[][] matr,int length) {
        double[][] backMatr = new double[length] [length];
        for (int i=0; i<length; i++)
            for (int j = 0; j < length; j++)
            {
                if (i == j)
                    backMatr[i][j] = 1;
                else
                    backMatr[i][j] = 0;
            }

        double p, q, s;
        for (int i = 0; i < length; i++)
        {
            p = matr[i] [i];
            for (int j = i + 1; j < length; j++)
            {
                q = matr[j] [i];
                for (int k = 0; k < length; k++)
                {
                    matr[j] [k] = matr[i] [k] * q - matr[j] [k] * p;
                    backMatr[j] [k] = backMatr[i][k] * q - backMatr[j][k] * p;
                }
            }
        }
        for (int i = 0; i < length; i++)
        {
            for (int j = length - 1; j >= 0; j--)
            {
                s = 0;
                for (int k = length - 1; k > j; k--)
                    s += matr[j][ k] * backMatr[k][i];
                backMatr[j][i] = (backMatr[j][i] - s) / matr[j][j];
            }
        }
        return backMatr;
    }
    public static void inverseMATRIX() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix size: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        double[][] matrix = new double[rows][columns];
        System.out.println("Enter matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        double[][] finalMATRIX = inverse(matrix, matrix.length);
        System.out.println("The result is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(finalMATRIX[i][j] + " ");
                if(j + 1 == columns) System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tF = true;
        while(tF) {
            commands();
            System.out.println("Your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    tF = false;
                    break;
                case 1:
                    addMatrices();
                    break;
                case 2:
                    multiplyMATRIXTOACONSTANT();
                    break;
                case 3:
                    multiplyMATRICES();
                    break;
                case 4:
                    transposeMATRIX();
                    break;
                case 5:
                    determinantMATRICE();
                    break;
                case 6:
                    inverseMATRIX();
                    break;
            }
        }
    }
}