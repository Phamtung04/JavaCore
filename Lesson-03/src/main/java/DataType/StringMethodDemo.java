package DataType;

public class StringMethodDemo {
    public static void main(String[] args) {
        String s = "    java    ";
        System.out.println("s.length() = " + s.length());
        System.out.println("s.charAt(5) = " + s.charAt(5));
        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s.toLowerCase() = " + s.toLowerCase());
        System.out.println("s.trim() = " + s.trim());
        System.out.println("s.contains() = " + s.contains("a"));
        System.out.println("s.startsWith(\"   \") = " + s.startsWith("   "));
        System.out.println("s.endsWith(\"   \") = " + s.endsWith("   "));
        System.out.println("s.indexOf('a') = " + s.indexOf('a'));
        System.out.println("s.lastIndexOf('a') = " + s.lastIndexOf('a'));
        System.out.println("s.replaceAll('a', 't') = " + s.replaceAll("a", "t"));
        String a = "Nguyễn Văn Khoa";
        String[] words = a.split(" ");
        for (String word : words) {
            System.out.println("word = " + word);
        }
        System.out.println("a.isEmpty() = " + a.isEmpty());
        System.out.println("a.substring(0, 6) = " + a.substring(0, 6));
    }
}
