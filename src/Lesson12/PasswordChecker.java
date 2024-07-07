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
        for (int i = 0; i < password.length() - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) {
                repeat++;
            }
        }
        if (minLength > password.length() || repeat > maxRepeats) {
            return false;
        }

        return true;
    }
}
