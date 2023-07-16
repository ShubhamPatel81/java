
// multiple inheritance
// multiplelevel question
class country {
    void india() {
        System.out.println("India is the seventh largest country in the world ");
    }
}

class count extends country {
    void Russia() {
        System.out.println("Russia is the largest country in the world");
    }
}

class coun extends count {
    void nepal() {
        System.out.println("Nepal is our neighbour country");
    }
}

class cou extends coun {
    void pakistan() {
        System.out.println("The economic condition  of pakistan is very bad  ");
    }
}

class printingall {
    public static void main(String[] args) {
        cou c1 = new cou();
        c1.Russia();
        c1.india();
        c1.nepal();
        c1.pakistan();
    }
}
