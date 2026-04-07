package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesKeepRightmost {

    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 6, 0, 0, 1));
        System.out.println("Original List: " + originalList);
        
        List<Integer> resultList = removeDuplicatesKeepRightmost(originalList);
        System.out.println("List without duplicates (keeping rightmost): " + resultList);
        // Expected output: [2, 3, 5, 6, 0, 1]
    }

    /**
     * Removes duplicate integers from a list, keeping only the rightmost (last) occurrence.
     *
     * @param originalList The list with potential duplicates.
     * @return A new list with duplicates removed, preserving the order of the last occurrences.
     */
    public static List<Integer> removeDuplicatesKeepRightmost(List<Integer> originalList) {
        Set<Integer> seenElements = new LinkedHashSet<>();
        List<Integer> reversedList = new ArrayList<>();

        // Iterate through the original list in reverse
        for (int i = originalList.size() - 1; i >= 0; i--) {
            Integer element = originalList.get(i);
            // If the element hasn't been seen, add it to the set and a temporary reversed list
            if (seenElements.add(element)) {
                reversedList.add(element);
            }
        }

        // The temporary list has elements in reverse order of their last appearance.
        // Reverse it again to get the correct final order.
        Collections.reverse(reversedList);
        
        return reversedList;
    }
}

