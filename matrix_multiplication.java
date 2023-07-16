import java.util.Scanner;

class matrixmultiplication {
    public static void main(String[] args) {
        int m, n, i, j;
        Scanner in = null;
        try {
            in = new Scanner(System.in);
            System.out.println("Enter the number of rows of the matrix : ");
            m = in.nextInt();
            System.out.println("Enter the number of columns of the matrix : ");
            n = in.nextInt();

            // Declare the matrix
            int first[][] = new int[m][n];

            // Read the matrix values
            System.out.println("Enter the elements of the first matrix : ");
            for (i = 0; i < m; i++)
                for (j = 0; j < n; j++)
                    first[i][j] = in.nextInt();

            // Display the elements of the matrix
            System.out.println("Elements of the first matrix is : ");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                    System.out.print(first[i][j] + "  ");
                System.out.println();
            }
            int second[][] = new int[m][n];
            // taking input from the user
            System.out.println("Enter the element of the second  matrix : ");
            for (i = 0; i < m; i++)
                for (j = 0; j < n; j++)
                    second[i][j] = in.nextInt();

            // Display the second matrix
            System.out.println("Element of the second matrix is :  ");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                    System.out.print(second[i][j] + "  ");

                System.out.println();
            }
            int c[][] = new int[m][n];

            // Multiply the two matrices
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    for (int k = 0; k < m; k++)
                        c[i][j] += first[i][k] * second[k][j];

//                    System.out.println(c[i][j]);
//                    System.out.println();
                }
            }
            // printing the multiplication of the matrix
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                {
                    System.out.println(c[i][j]);
                }
            }
        } finally {
            in.close();
        }
    }
}

