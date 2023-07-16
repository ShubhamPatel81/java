
// Printing star concept
class printingstar {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// 2nd star printing
class starprinting_2 {
    public static void main(String[] args) {
        int n = 5;
        int m = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

// 3rd example of printing star
class printingstar_3 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// 4th example of printing star
class printstar_4 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}

// 5th example of printing star
class starprint_5 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++)
        // inner loop for space printing
        {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // inner loop printing star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}