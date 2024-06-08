package Lesson5;
public class Main {
    public static final String TEXT = "aaababaabaaaabaabaabaabaaababaabaaababaabaaaabaabaabaabbabaabaaababaababaabaabaabaaabbaab";
    public static final String PATTERN = "aab";

    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < TEXT.length() - 2; i++) {
            StringBuilder letters = new StringBuilder();

            letters.append(TEXT.charAt(i));
            letters.append(TEXT.charAt(i + 1));
            letters.append(TEXT.charAt(i + 2));

            if (letters.toString().equals(PATTERN)) {
                count++;
            }
        }
        System.out.println("Строка " + PATTERN + " встретилась в тексте " + count + " раз");
    }
}