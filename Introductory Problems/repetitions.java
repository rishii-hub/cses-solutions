import java.util.*;
import java.io.*;

public class repetitions {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int ans = 1;
        int len = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                len++;
            } else {
                len = 1;
            }
            ans = Math.max(ans, len);
        }
        System.out.println(ans);
    }
}