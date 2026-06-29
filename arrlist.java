import java.util.*;
class arrlist {
    public static void main(String[] args) {
        ArrayList <Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.get(1));
        list.set(1,200);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println(list.isEmpty());
        list.clear();
        System.out.print(list);
    }
}
    