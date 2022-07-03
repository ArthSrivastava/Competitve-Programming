package Starters45;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P5 {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt();
            long[] arr = new long[2 * n];
            int countOdd = 0, countEven = 0;
            for (int i = 0; i < 2 * n; i++) {
                arr[i] = fr.nextLong();
                if(arr[i] % 2 == 0){ countEven++;}
                else{ countOdd++;}
            }
//            System.out.println(countEven + " " + countOdd);
            int equal = (countEven + countOdd) / 2;
            if (countOdd == countEven) {
                System.out.println(0);
            } else if (countOdd > countEven) {
                System.out.println(countOdd - equal);
            } else {
                int diff = countEven - equal;
                int cntDiv2 = 0;
                HashSet<Integer> set = new HashSet<>();
                Arrays.sort(arr);
                for (int i = (2 * n) - 1; i >= 0; i--) {
                    if ((arr[i] / 2) % 2 != 0) {
                        cntDiv2++;
                        set.add(i);
                    }
                }
                if (cntDiv2 == diff) {
                    System.out.println(cntDiv2);
                } else if (cntDiv2 > diff) {
                    System.out.println(diff);
                } else {
                    int cnt = 0;
                    int tmp = diff - cntDiv2;
//                    System.out.println(cntDiv2);
//                    System.out.println(tmp);
                    boolean flag = false;
                    int found = cntDiv2;
//                    System.out.println(set);
                    while (tmp-- > 0) {
                        for (int i = 0; i < 2 * n; i++) {
                            if (!set.contains(i)) {
                                while (arr[i] != 1) {
                                    arr[i] /= 2;
                                    cnt++;
                                }
                                found++;
//                                tmp--;
                            }
                            if (found == equal) {
                                flag = true;
                                break;
                            }
                        }
                        if (flag) {
                            break;
                        }
                    }
                    System.out.println(cntDiv2 + cnt);
                }
            }
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
