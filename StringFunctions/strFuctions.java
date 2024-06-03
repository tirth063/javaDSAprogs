package StringFunctions;
import java.util.HashMap;
import java.util.Map;
public class strFuctions {
    //Print a string in reverse order
    public static void printReverse(String s) {
        int n = s.length();
        for (int i = n-1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }

    //Reverse a String
    public static String reverse(String s) {
        int n = s.length();
        StringBuilder rev = new StringBuilder();
        for (int i = n-1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }
        return rev.toString();
    }

    //check if a String is Palindrome?
    public static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }

    //count number of words in a String ( without split function)
    public static int countWords(String s) {
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count+1;
    }

    //Program to check if two strings are same or not (without using inbuilt function .equals())
    public static boolean isSame(String s1, String s2) {
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    //Update a character in a string (without using .replace() function)
    public static String updateChar(String s, char oldChar, char newChar) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == oldChar) {
                ans.append(newChar);
            } else {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }

    //Sort string of characters without using .sort()
    public static String sortString(String s) {
        char[] a = s.toCharArray();
        int n = s.length();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if( a[j] > a[j+1]){
                    char temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return String.valueOf(a);
    }

    //Print frequency of all the characters in string
    public static void printFrequency(String s) {
        int[] ascval = new int[128];
        for (int i = 0; i < s.length(); i++) {
            int asc = s.charAt(i);
            ascval[asc]++;
        }
        for (int i = 0; i < ascval.length; i++) {
            if (ascval[i] > 0){
                System.out.println((char) i +" "+ ascval[i]);
            }
        }
    }

    //Remove Vowels from a String
    public static String removeVowels(String s){
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                str += c;
            }
        }
        return str;
    }

    //Reverse Words internally in a String // eg. good evening -> doog gnineve
    public static String reverseWordsInString(String s){
        s = s.trim();
        String s1 = "";
        String[] strs = s.split(" ");

        for (int i = 0; i < strs.length; i++) {
            s1 = s1 + reverse(strs[i]) + " ";
        }

        return s1;
    }

    //find duplicate chars from string
    public static void printDuplicateChars(String s){
        int[] ascval = new int[128];
        for (int i = 0; i < s.length(); i++) {
            int asc = s.charAt(i);
            ascval[asc]++;
        }
        for (int i = 0; i < ascval.length; i++) {
            if (ascval[i] > 1){
                System.out.println((char) i +" "+ ascval[i]);
            }
        }
    }

    //remove All Digits
    public static String removeDigits(String s){
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(c > 47 && c < 58)){
                str += c;
            }
        }
        return str;
    }

    //Merge two Strings of same length Alternatively
    public static String mergeAlternatively(String s1, String s2) {
        StringBuilder merged = new StringBuilder();
        int length = Math.min(s1.length(), s2.length());

        for (int i = 0; i < length; i++) {
            merged.append(s1.charAt(i)).append(s2.charAt(i));
        }

        if (s1.length() > length) {
            merged.append(s1.substring(length));
        } else if (s2.length() > length) {
            merged.append(s2.substring(length));
        }

        return merged.toString();
    }


    //Check if all words are palindrome // madam oko niotin
    public static boolean allWordsInStringIsPalindrome(String s){
        s = s.trim();
        String s1 = "";
        String[] strs = s.split(" ");

        for (int i = 0; i < strs.length; i++) {
            if (!isPalindrome(strs[i]))
                return false;
        }

        return true;
    }

    //Check if string have equal digits and chars
    public static boolean isEqual(String s ,boolean isIgnoreSpace ){
        if (isIgnoreSpace){
            s = s.trim();
        }
        int digits=0,chars=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > 47 && c < 58){
                digits++;
            }else {
                chars++;
            }
        }
        return digits == chars;
    }

    //Remove duplicate chars from string
    public static String removeDuplicates(String s) {
        String result = "";
        boolean[] visited = new boolean[128]; // Assuming ASCII characters
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (!visited[currentChar]) {
                result += currentChar;
                visited[currentChar] = true;
            }
        }

        return result.toString();
    }

    //prefixCount
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for (String word : words) {
            if (word.startsWith(pref))
                count++;
        }
        return count;
    }

    //MAX words count
    public static int mostWordsFound(String[] sentences) {
        int count=0;
        for (String word : sentences) {
           int a = word.split(" ").length;
            count = (a < count) ? count : a;
        }
        return count;
    }

    //Swap two string without using 3rd string
    public static String swap(String s) {
        char[] ch = s.toCharArray();
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            if (s.charAt(r) == ' ') {
                while (l < r) {
                    char temp = ch[r - 1];
                    ch[r - 1] = ch[l];
                    ch[l] = temp;
                    l++;
                    r--;
                }
                l = r + 1;
            }
        }
        // For the last word
        int r = s.length() - 1;
        while (l < r) {
            char temp = ch[r];
            ch[r] = ch[l];
            ch[l] = temp;
            l++;
            r--;
        }
        return new String(ch);
    }
    //2nd Advanced version
    public static void swapStrings(StringBuilder s1, StringBuilder s2) {
        int length = s1.length();
        for (int i = 0; i < length; i++) {
            s1.setCharAt(i, (char) (s1.charAt(i) ^ s2.charAt(i)));
            s2.setCharAt(i, (char) (s1.charAt(i) ^ s2.charAt(i)));
            s1.setCharAt(i, (char) (s1.charAt(i) ^ s2.charAt(i)));
        }
    }

    //2. Convert a string into an integer without using Integer.parseInt() function
    public static int convertStrToInt(String s) {
        int result = 0;
        boolean isNegative = false;
        int i = 0;

        // Check for negative sign
        if (s.charAt(0) == '-') {
            isNegative = true;
            i = 1; // Start from index 1 if negative sign is present
        }

        while (i < s.length()) {
            int digit = s.charAt(i) - '0'; // Convert char to integer value

            // Ensure the character is a digit
            if (digit >= 0 && digit <= 9) {
                result = result * 10 + digit; // Update the result
            } else {
                // If non-digit character encountered, break or handle as needed
                break;
            }

            i++;
        }

        // If the number is negative, make the result negative
        if (isNegative) {
            result = -result;
        }

        return result;
    }

    //3. Check if two strings are permutation of each other or not?
    //TC O(n), ASC O(1)
    public static boolean arePermutations(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] charCount = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i)]++;
            charCount[s2.charAt(i)]--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    //4. Pattern: PROMGRAM
    public static void printPattern() {
        String pattern = "PROGRAM";
        for (int i = 1; i <= pattern.length(); i++) {
            System.out.println(pattern.substring(0, i));
        }
    }



    // Main methods execution start from here Enjoy
    public static void main(String[] args) {
        String s = "Hello good morning";
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
        String str1 = "ABCD";
        String str2 = "abcd";
        // Merge two strings alternatively
        System.out.println("Merged String: " + mergeAlternatively(str1, str2));

        // Remove duplicates from a string
        System.out.println("String after removing duplicates: " + removeDuplicates("HHhhEEeeLLllOOoo"));

        // Check if all words in a string are palindromes
        System.out.println("Are all words in the string palindromes? " + allWordsInStringIsPalindrome(" nitin "));

        // Remove digits from a string
        System.out.println("String after removing digits: " + removeDigits(" Hello123"));

        // Check if two strings are equal ignoring case
        System.out.println("Are the strings equal ignoring case? " + isEqual("Hello12345", false));

        // Check if a string is a palindrome
        System.out.println("Is the string a palindrome? " + isPalindrome(s));

        // Print the reverse of a string
        System.out.print("Reverse of the string: ");
        printReverse(s);
        System.out.println();

        // Reverse a string
        System.out.println("Reversed string: " + reverse(s));

        // Count the number of words in a string
        System.out.println("Number of words in the string: " + countWords(s));

        // Check if two strings are the same
        System.out.println("Are the strings the same? " + isSame(s, s));

        // Update characters in a string
        System.out.println("String after updating characters: " + updateChar(s, 'a', 'b'));

        // Sort characters in a string
        System.out.println("Sorted string: " + sortString(s).trim());

        // Print frequency of characters in a string
        System.out.println("Frequency of characters in the string:");
        printFrequency(s);

        // Remove vowels from a string
        System.out.println("String after removing vowels: " + removeVowels(s));

        // Reverse words in a string
        System.out.println("String with reversed words: " + reverseWordsInString(s));

        // Print duplicate characters in a string
        System.out.print("Duplicate characters in the string: ");
        printDuplicateChars(s);

    }
}



class strFuctionsUsingDSA {

    //Print a string in reverse order
    public static void printReverse(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }

    //Reverse a String
    public static String reverse(String s) {
        StringBuilder rev = new StringBuilder(s);
        return rev.reverse().toString();
    }

    //check if a String is Palindrome?
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }

        return true;
    }

    //count number of words in a String ( without split function)
    public static int countWords(String s) {
        int count = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
            // Only increment count when there is a space and the next character is not a space
            if (i < length - 1 && s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }

        return count + 1;
    }

    //Program to check if two strings are same or not (without using inbuilt function .equals())
    public static boolean isSame(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    //Update a character in a string (without using .replace() function)
    public static String updateChar(String s, char oldChar, char newChar) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == oldChar) {
                ans.append(newChar);
            } else {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }

    //Sort string of characters without using .sort()
    public static String sortString(String s) {
        char[] a = s.toCharArray();
        quickSort(a, 0, a.length - 1);
        return new String(a);
    }

    private static void quickSort(char[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(char[] arr, int low, int high) {
        char pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Print frequency of all the characters in string
    public static void printFrequency(String s) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    //Remove Vowels from a String
    public static String removeVowels(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!isVowel(c)) {
                str.append(c);
            }
        }
        return str.toString();
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    //Reverse Words internally in a String // eg. good evening -> doog gnineve
    public static String reverseWordsInString(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = reverse(words[i]);
        }
        return String.join(" ", words);
    }

    //find duplicate chars from string
    public static void printDuplicateChars(String s) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

    //Remove All Digits
    public static String removeDigits(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                str.append(c);
            }
        }
        return str.toString();
    }

    //Merge two Strings of same length Alternatively
    public static String mergeAlternatively(String s1, String s2) {
        StringBuilder merged = new StringBuilder();
        int length = Math.min(s1.length(), s2.length());

        for (int i = 0; i < length; i++) {
            merged.append(s1.charAt(i)).append(s2.charAt(i));
        }

        if (s1.length() > length) {
            merged.append(s1.substring(length));
        } else if (s2.length() > length) {
            merged.append(s2.substring(length));
        }

        return merged.toString();
    }

    //Check if all words are palindrome // madam oko niotin
    public static boolean allWordsInStringIsPalindrome(String s) {
        s = s.trim();
        String[] words = s.split(" ");

        for (String word : words) {
            if (!isPalindrome(word)) {
                return false;
            }
        }

        return true;
    }

    //Check if string have equal digits and chars
    public static boolean isEqual(String s, boolean isIgnoreSpace) {
        if (isIgnoreSpace) {
            s = s.trim();
        }
        int digits = 0;
        int chars = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                digits++;
            } else if (Character.isLetter(c)) {
                chars++;
            }
        }

        return digits == chars;
    }

    //Remove duplicate chars from string
    public static String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();
        boolean[] visited = new boolean[128]; // Assuming ASCII characters

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (!visited[currentChar]) {
                result.append(currentChar);
                visited[currentChar] = true;
            }
        }

        return result.toString();
    }
}