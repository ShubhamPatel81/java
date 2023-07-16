
// Bit Manupulation

// Get Bit
class Bits {
    public static void main(String[] args) {
        int n = 5;
        int position = 2;
        int bitmass = 1 << position;
        if ((bitmass & n) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("bit was one ");
        }

    }
}

// Set bit
class setbit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitmask = 1 << pos;
        int newnumber = bitmask | n;
        System.out.println(newnumber);
    }
}

// Clear bit

class clearbit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitmask = 1 << pos;
        int notbitmask = ~(pos);
        int newnumber = notbitmask & n;
        System.out.println(newnumber);
    }
}

// Update bit
class updatebit {
    public static void main(String[] args) {
        int n = 5;// 0101
        int pos = 1;
        int operation = 1; // update bit to 1
        int bitmask = 1 << pos;
        int newnumber = bitmask | n;
        System.out.println(newnumber);
    }
}
