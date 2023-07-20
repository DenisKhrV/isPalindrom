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
        char[] array = string.toCharArray();
        int j = array.length - 1;
        boolean isPalindrome = true;
        for (int i = 0; i < string.length(); i++) {
            if (array[i] == array[j]) {
                j--;
            } else {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }
}