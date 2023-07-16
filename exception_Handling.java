
// EXCEPTIONAL Handiling - using throw and catch keyword

class myCustomExecptoion extends Exception {

}

class testCustomException {
    public static void main(String args[]) {
        try {
            throw new myCustomExecptoion();
        } catch (myCustomExecptoion ex) {
            System.out.println("catch the exception ");
            System.out.println(ex.getMessage());
        }
        System.out.println("Rest of the code .... ");
    }
}


// Class not found packages
class ClassNotfound {
    public static void main(String args[]) {
        try {
            Class.forName("myPackage.example.Sample");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}