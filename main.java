
public class main{

    public static int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        long num = 0;

        // remove leading spaces
        s = s.trim();
        if (s.length() == 0) return 0;

        // handle sign
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // convert digits with overflow prevention
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // overflow check BEFORE updating num
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }

        return (int)(sign * num);
    }

    // 🔹 main method (for VS Code)
    public static void main(String[] args) {
        String[] tests = {
            "42",
            "   -42",
            "4193 with words",
            "words and 987",
            "-91283472332",
            "9223372036854775808",
            "+1",
            "   "
        };

        for (String test : tests) {
            System.out.println("Input: \"" + test + "\" -> Output: " + myAtoi(test));
        }
    }
}
