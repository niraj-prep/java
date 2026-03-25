package Assignment;

public class TextEditorBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.insert(5, " Beautiful");
        System.out.println("After insert: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
