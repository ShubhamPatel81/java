//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;
class agereco {
    agereco() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter your name :");
        String var2 = var1.nextLine();
        System.out.println("Enter your age :");
        int var3 = var1.nextInt();
        if (var3 >= 18) {
            System.out.println("You can vote ");
        } else {
            System.out.println("You cannot vote ");
        }

    }
}