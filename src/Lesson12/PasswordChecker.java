package Lesson12;

public class PasswordChecker {
    private int minLength;
    private int maxRepeats;

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }

    public void setMaxRepeats(int maxRepeats) {
        this.maxRepeats = maxRepeats;
    }

    public boolean verify(String password) {
        int repeat = 0;
        for (int i = 1; i < password.length(); i++) {
            if (password.charAt(i) == password.charAt(i - 1)) {
                repeat++;
            } else {
                if (repeat > 0) {
                    repeat = Math.max(repeat, 2);
                }
                repeat = 0;
            }
        }
        if (minLength > password.length() || repeat > maxRepeats) {
            System.out.println("Не подходит!" + repeat);
            return false;
        }
        System.out.println("Подходит!" + repeat);
        return true;
    }
}
