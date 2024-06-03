package DSAs.Hashes;

import java.util.*;

class MapUsingHash {

    private Entity[] entities;

    public MapUsingHash() {
        entities = new Entity[100];
    }

    public void put(String key, String value) {
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value); // overriding
    }

    public String get(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)) {
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key) {
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)) {
            entities[hash] = null;
        }
    }

    private class Entity {
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}



class Main {
    public static void main(String[] args) {
        // hashDemo();
        HashMapFinal<String, String> map = new HashMapFinal<>();

        map.put("Mango", "King of fruits");
        map.put("Apple", "A sweet red fruit");
        map.put("Litchi", "Kunal's fav fruit");

        System.out.println(map);


    }

    public static void hashDemo() {
        // String name = "Rahul";

        // Integer a = 4235678;

        // int code = a.hashCode();

        // System.out.println(code);

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Kunal", 89);
        map.put("Karan", 99);
        map.put("Rahul", 94);

        // System.out.println(map.get("Karan"));
        // System.out.println(map.getOrDefault("Apoorv", 78));
        System.out.println(map.containsKey("Karan"));

        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(9);
        set.add(12);
        set.add(43);
        set.add(56);
        set.add(2);

        System.out.println(set);
    }

}



class ArithmeticTriplets {
    public static int findArithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        int res = 0;

        // Add all elements to the set
        for (int num : nums) {
            set.add(num);
        }

        // Iterate through each element in nums
        for (int num : nums) {
            int a = num + diff;
            int b = num + 2 * diff;
            // Check if the set contains num + diff and num + 2 * diff
                if (set.contains(a) && set.contains(b)) {
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
      String  allowed = "ab";
      String[] words = {"ad","bd","aaab","baa","badab"};

      System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }
        int count = 0;
        for (String word : words) {
            boolean consistent = true;
            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    consistent = false;
                    break;
                }
            }
            if (consistent) {
                count++;
            }
        }
        return count;
    }


        public String decodeMessage(String key, String message) {
            HashMap<Character, Character> map = new HashMap<>();
            char ch = 'a';
            for (char k : key.toCharArray()) {
                if (k >= 'a' && k <= 'z' && !map.containsKey(k)) {
                    map.putIfAbsent(k, ch++);
                }
                if (map.size() == 26){
                    break;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (char c : message.toCharArray()) {
                if (map.containsKey(c)){
                    sb.append(map.get(c));
                }
            }
            return sb.toString();


        }

}
