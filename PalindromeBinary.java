public class PalindromeBinary {
    public int findPalindromeBinary(int A) {
        int count = 0;
        int num = 0;

        while (count < A) {
            String binary = Integer.toBinaryString(num);
            if (isPalindrome(binary)) {
                count++;
            }
            num++;
        }

        return num - 1;
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeBinary solution = new PalindromeBinary();
        int A = 20;
        int result = solution.findPalindromeBinary(A);
        System.out.println(result);
    }
}