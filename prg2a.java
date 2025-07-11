import java.util.*;

public class prg2a {
    public static void main(String[] args) {
        System.out.println("===Arraylist===");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.remove("Banana");
        System.out.println("ArrayList contents: " + arrayList);
        System.out.println("Element at index 1: " + arrayList.get(1));

        System.out.println("\n===LinkedList===");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.addFirst("Cat");
        linkedList.removeLast();
        System.out.println("LinkedList contents: " + linkedList);
        System.out.println("First Element: " + linkedList.getFirst());

        System.out.println("\n===HashSet===");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("10");
        hashSet.add("20");
        hashSet.add("10");
        hashSet.remove("20");
        System.out.println("HashSet contents: " + hashSet);
        System.out.println("Contains '10': " + hashSet.contains("10"));

        // System.out.println("\n===TreeMap===");
        // TreeMap<String, Integer> treeMap = new TreeMap<>();
        // treeMap.put("Three", 3);
        // treeMap.put("One", 1);
        // treeMap.put("Two", 2);
        // treeMap.remove("Two");
        // System.out.println("TreeMap contents: " + treeMap);
        // System.out.println("Value for key 1: " + treeMap.get("One"));

        System.out.println("\n===TreeMap===");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.remove(2);
        System.out.println("TreeMap contents: " + treeMap);
        System.out.println("Value for key 1: " + treeMap.get(1));
    }
}
