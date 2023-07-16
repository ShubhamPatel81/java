
// Example with 'finally' block

//The finally statement lets you execute code, after try...catch

class Main8 {
    public static void main(String[] args) {
        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}


// Another Example
class trycatch {
    public static void main(String[] args) {
        try {
            int a = 10;
            System.out.println("multiple is : ");
            for (int i = 0; i <= 10; i++) {
                int mul = a * i;
                System.out.println(mul);
            }
        } catch (Exception m) {
            System.out.println("error in coad");
        } finally {
            System.out.println("Run Successfully");
        }
    }
}