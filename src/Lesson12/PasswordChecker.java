package Lesson12;

public class PasswordChecker {
    private int minLength;
    private int maxRepeats;

    public void setMinLength(int minLength) {
        this.minLength = minLength;
        if (minLength < 0) {
            throw new IllegalArgumentException("Минимальная длина пароля не может быть меньше нуля.");
        }
    }

    public void setMaxRepeats(int maxRepeats) {
        this.maxRepeats = maxRepeats;
        if (maxRepeats < 0) {
            throw new IllegalArgumentException("Минимальное число повторений не может быть меньше нуля.");
        }
    }

    public boolean verify(String password) {
        if (maxRepeats == 0 || minLength == 0) {
            throw new IllegalStateException("Не задан один из аргументов.");
        }
        int repeat = 0;
        for (int i = 1; i < password.length(); i++) {
            if (password.charAt(i) == password.charAt(i - 1)) {
                repeat++;
            } else {
                if (repeat > 0) {
                    repeat = Math.max(repeat, 2);
                }
            }
        }

        if ((password.length() < minLength) || (repeat > maxRepeats)) {
            System.out.println("Не подходит!");
            return false;
        }


        System.out.println("Подходит!");
        return true;
    }
}
