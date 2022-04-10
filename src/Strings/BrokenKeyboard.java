package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BrokenKeyboard {
    static final int CHAR = 256;
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            String s = fr.nextLine();
            int first = 0, next = 1;
            boolean flag = false;
            StringBuilder sb = new StringBuilder();
            if (s.length() == 1) {
                sb.append(s.charAt(0));
                System.out.println(sb);
            }
            else {
                int i;
                for (i = 0; i < s.length() - 1; ) {
                    if (s.charAt(i) == s.charAt(i + 1)) {
                        i += 2;
                    } else {
                        flag = true;
                        sb.append(s.charAt(i));
                        i++;
                    }
//                    System.out.println(i);
                }
                if (i < s.length()) {
//                    System.out.println(i);
                    flag = true;
                    sb.append(s.substring(i));
                }
                if (!flag) {
                    System.out.println("");
                } else {
                    String res = sb.toString();
                    ArrayList<Character> list = new ArrayList<>();
                    for (int x = 0; x < res.length(); x++) {
                        list.add(res.charAt(x));
                    }
//                    System.out.println(list);
                    Collections.sort(list);
                    ArrayList<Character> ans = removeDuplicates(list);
//                    System.out.println(ans);
                    StringBuilder r = new StringBuilder();
                    for (Character character : ans) {
                        r.append(character);
                    }
                    System.out.println(r);
                }
            }
        }
    }
    private static ArrayList<Character> removeDuplicates(ArrayList<Character> list) {
        ArrayList<Character> ans = new ArrayList<>();
        if (list.size() == 1) {
            ans.add(list.get(0));
        } else {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) != list.get(i + 1)) {
                    ans.add(list.get(i));
                }
            }
        ans.add(list.get(list.size() - 1));
        }
        return ans;
    }
}
