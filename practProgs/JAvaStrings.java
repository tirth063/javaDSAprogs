package practProgs;

public class JAvaStrings {

    public static void main(String[] args) {
        String a = "How are you?" ,b = "We are fine!";
        System.out.println(a.compareTo(b));
        System.out.println(a.startsWith("How"));
        System.out.println(a.endsWith("fine"));
        System.out.println(a.indexOf('o'));
        System.out.println(a.lastIndexOf('o'));
        System.out.println(b.replace("We are","I am"));
         System.out.println(b.substring(1,5));
        
    }
}
