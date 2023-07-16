import java.util.ArrayList;
import java.util.Collections;

class ArrayLists {
    ArrayLists() {
    }

    public static void main(String[] var0) {
        ArrayList var1 = new ArrayList();
        var1.add(0);
        var1.add(1);
        var1.add(4);
        var1.add(8);
        System.out.println(var1);
        int var2 = (Integer)var1.get(0);
        System.out.println(var2);
        var1.add(1, 1);
        System.out.println(var1);
        var1.set(0, 7);
        System.out.println("Set element " + var1);
        var1.remove(1);
        System.out.println("Element remove is : " + var1);
        int var3 = var1.size();
        System.out.println("Size of list is : " + var3);

        for(int var4 = 0; var4 < var1.size(); ++var4) {
            System.out.println(var1.get(var4));
        }

        System.out.println();
        Collections.sort(var1);
        System.out.println("Sorted list is " + var1);
    }
}