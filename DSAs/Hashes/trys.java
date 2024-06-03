package DSAs.Hashes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class trys {

    //1. Print all distinct numbers in array
    public static void findAllDistinct(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr) {
            set.add(i);
        }
        System.out.println(set);
    }

    //2. Print all unique numbers in array
    public static void findAllUnique(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for(int i : arr) {
            if(set.contains(i)) {
                duplicate.add(i);
            } else {
                set.add(i);
            }
        }
        for (int i : arr) {
            if (!duplicate.contains(i))
                System.out.println(i);
        }
    }

    //3. Find whether an array is subset of another array
    public static boolean isSubset(int[] arr, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr) {
            set.add(i);
        }
        for(int i : arr2) {
            if(!set.contains(i)) {
                return false;
            }
        }
        return true;
    }


    public int numJewelsInStones(String jewels, String stones) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c : stones.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = 0;
        for (Character c : jewels.toCharArray()) {
            if(map.containsKey(c)) {
                count += map.get(c);
            }
        }
        return count;
    }



    //4. Count frequency of each number in array
    public static HashMap<Integer, Integer> countFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        return map;
    }

    //5. Check if pair with given Sum exists in unsorted Array - O(N)
    public static boolean checkPair(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr) {
            if(set.contains(sum - i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

    //6. Most frequent element in an array
    public static int mostFrequent(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int max = 0;
        int res = 0;
        for(int i : arr) {
            if(map.get(i) > max) {
                max = map.get(i);
                res = i;
            }
        }
        return res;
    }

    //7. Check if two arrays are equal or not
    public static boolean checkEqual(int[] arr, int[] arr2) {
        if(arr.length != arr2.length) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i : arr2) {
            map2.put(i, map2.getOrDefault(i, 0) + 1);
        }
        return map.equals(map2);
    }

    //8. Print all the duplicate numbers in array
    public static void findAllDuplicates(int[] arr) {
        HashMap<Integer, Integer> map = countFrequency(arr);
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
    public static void main(String[] args) {
        // Test Case for findAllDistinct
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        trys.findAllDistinct(arr1);

        // Test Case for findAllUnique
        int[] arr2 = {1, 2, 2, 3, 3, 4, 5, 6, 6, 7, 8, 9, 9, 10};
        trys.findAllUnique(arr2);

        // Test Case for isSubset
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {2, 3, 5};
        System.out.println(trys.isSubset(arr3, arr4));  // Should print "true"
        int[] arr5 = {6, 7, 8};
        System.out.println(trys.isSubset(arr3, arr5));  // Should print "false"

        // Test Case for countFrequency
        int[] arr6 = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        System.out.println(trys.countFrequency(arr6));  // Should print "{1=1, 2=2, 3=3, 4=4}"

        // Test Case for checkPair
        int[] arr7 = {1, 2, 3, 4, 5};
        System.out.println(trys.checkPair(arr7, 9));  // Should print "true"
        System.out.println(trys.checkPair(arr7, 12)); // Should print "false"

        // Test Case for mostFrequent
        int[] arr8 = {1, 2, 2, 2, 3, 3, 4, 4, 4, 4};
        System.out.println(trys.mostFrequent(arr8));  // Should print "4"

        // Test Case for checkEqual
        int[] arr9 = {1, 2, 3, 4, 5};
        int[] arr10 = {1, 2, 3, 4, 5};
        System.out.println(trys.checkEqual(arr9, arr10));  // Should print "true"
        int[] arr11 = {1, 2, 3, 4};
        System.out.println(trys.checkEqual(arr9, arr11));  // Should print "false"

        // Test Case for findAllDuplicates
        int[] arr12 = {1, 2, 2, 3, 3, 4, 4, 5, 5};
        trys.findAllDuplicates(arr12);  // Should print "2", "3", "4", "5"
    }


    public static void main1(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = {1,2,3,4,5};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for(int i : arr) {
            if(set.contains(i)) {
                duplicate.add(i);
            } else {
                set.add(i);
            }
        }
        for (int i : arr) {
            if (!duplicate.contains(i))
                System.out.println(i);
        }
        set.clear();
        for(int i : arr) {
            set.add(i);
        }
        for (int i : arr2) {
            if (!set.contains(i)) {
                System.out.println("Not a subset of arr");
                break;
            }
        }
        System.out.println("Is subset of arr");
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);

        //Check if pair with given Sum exists in unsorted Array - O(N) using HshMap
        int[] arr3 = {1,2,3,4,5,6,7,8,9,10};
        int sum = 9;
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int i : arr3) {
            map2.put(i, map2.getOrDefault(i, 0) + 1);
        }
        for(int i : arr3) {
            int temp = sum - i;
            if(map2.containsKey(temp)) {
                System.out.println("Pair with given sum exists");
                break;
            }
        }
        System.out.println("Pair with given sum does not exist");

        map.put(2,8);
        //Most frequent element in an array
        int mostFreq = 0;
        int currFreq = 1;
        for (HashMap.Entry<Integer, Integer> entry :map.entrySet()) {

            if( currFreq < entry.getValue() ) {
                mostFreq = entry.getKey();
                currFreq = entry.getValue();
            }
        }
        System.out.println("Most frequent element: " + mostFreq);

        //Check if two arrays are equal or not USING HASHMAP
        int[] arr4 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr5 = {1,2,3,4,5,6,7,8,9,10};

        HashMap<Integer, Integer> map3 = new HashMap<>();
        for(int i : arr4) {
            map3.put(i, map3.getOrDefault(i, 0) + 1);
        }
        for(int i : arr5) {
            if(!map3.containsKey(i) || map3.get(i) == 0) {
                System.out.println("Not equal");
                break;
            }
            map3.put(i, map3.get(i) - 1);
        }
        System.out.println("Equal");

    }

}
