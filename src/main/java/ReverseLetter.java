public class ReverseLetter {
    public static String reverseLetters(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;                  // слева не буква - пропускаем
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println (reverseLetters("J@va the be$t!123")); // t@eb eht av$J!123
        System.out.println (reverseLetters(""));                  // пустая строка
        System.out.println (reverseLetters("123 !@#"));           // нет букв
        System.out.println (reverseLetters("a"));                 // одна буква
    }

}
