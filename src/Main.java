public class Main {
    public static void main(String[] args) {
        String string = "Я - арка края";
        string = string.toLowerCase();
        string = string.replace(",", "");
        string = string.replace(" ", "");
        string = string.replace("-", "");
        string = string.replace("—", "");
        string = string.replace(":", "");
        string = string.replace("!", "");
        char[] chars = string.toCharArray();
        int j = string.length() - 1;
        boolean isPalindrom = true;
        for (int i = 0; i < string.length(); i++) {
            if (chars[i] == chars[j]) {
                j--;
            } else {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }
}