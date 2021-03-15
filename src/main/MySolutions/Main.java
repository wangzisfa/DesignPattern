package MySolutions;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
//        System.out.println(Arrays.toString(Solution.parseLong(12312)));
        System.out.println(solution.countAndSay(30));

    }
}


class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String str = countAndSay(n - 1);
        StringBuffer sb = new StringBuffer();
        int len = str.length();

        int start = 0;
        for (int i = 1; i < len + 1; i++) {
            if (i == len) {
                sb.append(i - start).append(str.charAt(start));
            } else if (str.charAt(i) != str.charAt(start)) {
                sb.append(i - start).append(str.charAt(start));
                start = i;
            }
        }
        return sb.toString();
    }
}