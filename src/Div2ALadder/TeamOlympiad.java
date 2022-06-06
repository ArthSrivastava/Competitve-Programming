package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class TeamOlympiad {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[] input = new int[n];
        Stack<Integer> arr1Index = new Stack<>();
        Stack<Integer> arr2Index = new Stack<>();
        Stack<Integer> arr3Index = new Stack<>();
        int count1 = 0, count2 = 0, count3 = 0;
        for (int i = 0; i < n; i++) {
            input[i] = fr.nextInt();
            if (input[i] == 1) {
                count1++;
                arr1Index.push(i + 1);
            } else if (input[i] == 2) {
                count2++;
                arr2Index.push(i + 1);
            } else {
                count3++;
                arr3Index.push(i + 1);
            }
        }
        int min1 = Math.min(count1, count2);
        int min2 = Math.min(min1, count3);
        if (count1 > 0 && count2 > 0 && count3 > 0) {
            System.out.println(min2);
            while(min2-- > 0) {
                System.out.print(arr1Index.pop() + " ");
                System.out.print(arr2Index.pop() + " ");
                System.out.println(arr3Index.pop());
            }
        } else {
            System.out.println(0);
        }

    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
