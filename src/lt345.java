import java.util.Stack;
//超时
//public class lt345 {
//    public String reverseVowels(String s) {
//
//        int len = s.length();
//        if (len == 0) return s;
//        int[] book = new int[len];
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.toCharArray().length; i++) {
//            char a = s.charAt(i);
//            if (a == 'a' || a == 'e' || a == 'i' || a == 'o'
//                    ||a == 'A' || a == 'E' || a == 'I' || a == 'O'||a=='U'||a=='u') {
//                book[i] = -1;
//                stack.push(a);
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < book.length; i++) {
//            int val = book[i];
//            if (val != -1) {
//                sb.append(s.charAt(i));
//            } else {
//                sb.append(stack.pop());
//            }
//
//        }
//        return sb.toString();
//
//    }
//}

public class lt345 {
    public static String reverseVowels(String s) {
        int len = s.length();
        int left = 0;
        int right = len - 1;
        char[] res = new char[len];
        while (left < right) {
            while (!isYY(s.charAt(left)) && left < right) {
                res[left] = s.charAt(left);
                left++;
            }
            while (!isYY(s.charAt(right)) && left < right) {
                res[right] = s.charAt(right);
                right--;
            }
            if (left < right) {
                change(s, res, left, right);
                left++;
                right--;
            }
        }
        if(left==right)res[left] = s.charAt(left);
        return new String(res);

    }

    private static void change(String s, char[] a, int left, int right) {
        a[left] = s.charAt(right);
        a[right] = s.charAt(left);
    }

    private static boolean isYY(char a) {
        return (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || a == 'u');

    }

    public static void main(String[] args) {
        String hello = reverseVowels("aA");
        System.out.println(hello);


    }
}
