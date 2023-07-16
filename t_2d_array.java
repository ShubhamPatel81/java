import java.util.Scanner;

class arr_2D {
    arr_2D() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter the row : ");
        int var2 = var1.nextInt();
        System.out.println("Enter the column : ");
        int var3 = var1.nextInt();
        int[][] var4 = new int[var2][var3];
        System.out.println("Enter matrix : ");

        int m;
        int n;
        for(m = 0; m < var2; m++) {
            for(n = 0; n< var3; n++) {
                var4[m][n] = var1.nextInt();
            }
        }

        for(m = 0; m< var2; m++) {
            for(n = 0; n < var3; n++) {
                System.out.print(var4[m][n] + " ");
            }

            System.out.println();
        }

        System.out.println("Enter the element to be search : ");
        m = var1.nextInt();

        for(n = 1; n < var2; n++) {
            for(int k= 1; k < var3; k++) {
                if (m == var4[n][k]) {
                    System.out.println("Element is present at location " + n+ ", " + k);
                }
            }
        }

    }
}
