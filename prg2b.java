import java.util.*;

public class prg2b {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Eve");
        names.add("Charlie");
        names.remove("Bob");
        names.add(1, "David");
        System.out.println("Original List: " + names);

        Collections.sort(names);
        System.out.println("Sorted List: " + names);

        String SearchName = "Charlie";
        int index = Collections.binarySearch(names, SearchName);
        if (index >= 0) {
            System.out.println(SearchName + " found at index: " + index + "\n");
        } else {
            System.out.println(SearchName + " not found in the list.\n");
        }
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(5);
        System.out.println("Original Set (Under No Duplication): " + numbers);

        List<Integer> numberList = new ArrayList<>(numbers);
        Collections.sort(numberList);
        System.out.println("Sorted Set: " + numberList);

        int searchNumber = 9;
        int numberIndex = Collections.binarySearch(numberList, searchNumber);
        if (numberIndex >= 0) {
            System.out.println(searchNumber + " found at index: " + numberIndex + "\n");
        } else {
            System.out.println(searchNumber + " not found in the set.\n");
        }
    }
}
