public class ReverseLetter  {
    public static void main(String[] args) {

 String s = "J@va the be$t!123";

        char[] chars = "J@va the be$t!123".toCharArray();пше
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            while (left < right && !Character.isLetter(chars[left])) {
                left++;
            }

            while (left < right && !Character.isLetter(chars[right])) {
                right--;
                }
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;

            left++;
            right--;
        }

        System.out.println(new String(chars));
    }
}
