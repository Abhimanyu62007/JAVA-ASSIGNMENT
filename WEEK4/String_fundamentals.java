public class String_fundamentals {
    public static void main(String[] args) {
        String name = "Abhimanyu";

        System.out.println("String: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Character at index 2: " + name.charAt(2));
        System.out.println("Substring: " + name.substring(0, 4));
    }
}