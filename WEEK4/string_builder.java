public class string_builder {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Hello");

        text.append(" World");
        System.out.println("After Append: " + text);

        text.insert(5, " Java");
        System.out.println("After Insert: " + text);

        text.replace(0, 5, "Hi");
        System.out.println("After Replace: " + text);

        text.delete(2, 7);
        System.out.println("After Delete: " + text);

        text.reverse();
        System.out.println("After Reverse: " + text);
    }
}
