
/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

class RandomizedSet {

    HashMap<Integer, Integer> hm; // HashMap to store the value and its index in the list
    List<Integer> list; // List to store the values

    /**
     * Constructor to initialize the data structure.
     * HashMap for fast lookups, and ArrayList for efficient random access.
     */
    public RandomizedSet() {
        hm = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        // If the value already exists, return false
        if (hm.containsKey(val)) {
            return false;
        }

        // Add the value to the list and update the HashMap with its index
        list.add(val);
        hm.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        // If the value does not exist, return false
        if (hm.containsKey(val) == false) {
            return false;
        }

        // Get the index of the value to be removed
        int ind = hm.get(val);

        // Swap the value with the last element in the list
        Collections.swap(list, ind, list.size() - 1);

        // Update the index of the swapped value in the HashMap
        int swappedWith = list.get(ind);
        hm.put(swappedWith, ind);

        // Remove the last element from the list and its entry from the HashMap
        list.remove(list.size() - 1);
        hm.remove(val);
        return true;
    }

    public int getRandom() {
        // Generate a random index between 0 and list.size() - 1
        Random random = new Random();
        int n = random.nextInt(list.size());

        // Return the element at the random index
        return list.get(n);
    }
}
