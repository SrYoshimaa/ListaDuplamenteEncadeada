public class Main {

    public static void main(String[] args) {
        DLinkedList<String> listD = new DLinkedList<String>();
        listD.addFirst("e");
        listD.addFirst("h");
        listD.add(1, "bcd");
        listD.addLast("a");
        listD.addLast("b");
        System.out.println(listD.getFirst());
        listD.removeFirst();
        System.out.println(listD.getFirst());
        System.out.println(listD.getLast());
        listD.removeLast();
        System.out.println(listD.getLast());
        System.out.println(listD.contains("e"));
        System.out.println(listD.get(1));
        System.out.println(listD.remove(0));
        System.out.println(listD.size());
        System.out.println(listD.isEmpty());
    }
}
