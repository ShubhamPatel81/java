import java.util.LinkedList;

// Linked Listclass using collection framework
class LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("is");
        list.addFirst("this");
        System.out.println(list);
        list.addLast("LInkedlist");
        System.out.println(list);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "->");
            list.removeFirst();
            System.out.println(list);
            list.removeLast();
            System.out.println(list);
        }
    }
}
