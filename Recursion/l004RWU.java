import java.util.*;

// Recursion Way up

public class l004RWU {
    public static int subsequence(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return 1;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        int count = 0;

        count += subsequence(roq, ans);
        count += subsequence(roq, ans + ch);

        return count;
    }

    public static int subsequence(String ques, String ans, ArrayList<String> res) {
        if (ques.length() == 0) {
            res.add(ans);
            return 1;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        int count = 0;

        count += subsequence(roq, ans, res);
        count += subsequence(roq, ans + ch, res);

        return count;
    }

    public static String[] nokiaKeys = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static int nokiaKeyPad(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return 1;
        }

        char ch = str.charAt(0);
        int idx = ch - '0';
        String word = nokiaKeys[idx];
        int count = 0;

        for (int i = 0; i < word.length(); i++)
            count += nokiaKeyPad(str.substring(1), ans + word.charAt(i));

        return count;
    }

    public static int stairPath(int n, String ans) {
        if (n == 0) {
            // System.out.println(ans);
            return 1;
        }

        int count = 0;
        for (int jump = 1; jump <= 3 && n - jump >= 0; jump++) {
            count += stairPath(n - jump, ans + jump);
        }

        return count;
    }

    public static int boardPath(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for (int dice = 1; dice <= 6 && n - dice >= 0; dice++) {
            count += boardPath(n - dice, ans + dice);
        }

        return count;
    }

    public static int boardPath(int sp, int ep, String ans) {
        if (sp == ep) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for (int dice = 1; dice <= 6 && sp + dice <= ep; dice++) {
            count += boardPath(sp + dice, ep, ans + dice);
        }

        return count;
    }

    public static int boardPath(int[] arr, int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for (int jump : arr) {
            if (n - jump >= 0)
                count += boardPath(n - jump, n, ans + jump);
        }

        return count;
    }

    public static int mazePath_HVD(int sr, int sc, int er, int ec, String ans) {
        if (sr == er && sc == ec) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        if (sc + 1 <= ec)
            count += mazePath_HVD(sr, sc + 1, er, ec, ans + "H");
        if (sc + 1 <= ec && sr + 1 <= er)
            count += mazePath_HVD(sr + 1, sc + 1, er, ec, ans + "D");
        if (sr + 1 <= er)
            count += mazePath_HVD(sr + 1, sc, er, ec, ans + "V");

        return count;
    }

    public static int mazePath_MultiHVD(int sr, int sc, int er, int ec, String ans) {
        if (sr == er && sc == ec) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for (int jump = 1; sc + jump <= ec; jump++)
            count += mazePath_MultiHVD(sr, sc + jump, er, ec, ans + "H" + jump);
        for (int jump = 1; sc + jump <= ec && sr + jump <= er; jump++)
            count += mazePath_MultiHVD(sr + jump, sc + jump, er, ec, ans + "D" + jump);
        for (int jump = 1; sr + jump <= er; jump++)
            count += mazePath_MultiHVD(sr + jump, sc, er, ec, ans + "V" + jump);

        return count;
    }import java.util.*;

    // Recursion Way up
    public class l004RWU {
        public static int subsequence(String ques, String ans) {
            if (ques.length() == 0) {
                System.out.println(ans);
                return 1;
            }
    
            char ch = ques.charAt(0);
            String roq = ques.substring(1);
            int count = 0;
    
            count += subsequence(roq, ans);
            count += subsequence(roq, ans + ch);
    
            return count;
        }
    
        public static int subsequence(String ques, String ans, ArrayList<String> res) {
            if (ques.length() == 0) {
                res.add(ans);
                return 1;
            }
    
            char ch = ques.charAt(0);
            String roq = ques.substring(1);
            int count = 0;
    
            count += subsequence(roq, ans, res);
            count += subsequence(roq, ans + ch, res);
    
            return count;
        }
    
        public static String[] nokiaKeys = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
    
        public static int nokiaKeyPad(String str, String ans) {
            if (str.length() == 0) {
                System.out.println(ans);
                return 1;
            }
    
            char ch = str.charAt(0);
            int idx = ch - '0';
            String word = nokiaKeys[idx];
            int count = 0;
    
            for (int i = 0; i < word.length(); i++)
                count += nokiaKeyPad(str.substring(1), ans + word.charAt(i));
    
            return count;
        }
    
        public static int stairPath(int n, String ans) {
            if (n == 0) {
                // System.out.println(ans);
                return 1;
            }
    
            int count = 0;
            for (int jump = 1; jump <= 3 && n - jump >= 0; jump++) {
                count += stairPath(n - jump, ans + jump);
            }
    
            return count;
        }
    
        public static int boardPath(int n, String ans) {
            if (n == 0) {
                System.out.println(ans);
                return 1;
            }
    
            int count = 0;
            for (int dice = 1; dice <= 6 && n - dice >= 0; dice++) {
                count += boardPath(n - dice, ans + dice);
            }
    
            return count;
        }
    
        public static int boardPath(int sp, int ep, String ans) {
            if (sp == ep) {
                System.out.println(ans);
                return 1;
            }
    
            int count = 0;
            for (int dice = 1; dice <= 6 && sp + dice <= ep; dice++) {
                count += boardPath(sp + dice, ep, ans + dice);
            }
    
            return count;
        }
    
        public static int boardPath(int[] arr, int n, String ans) {
            if (n == 0) {
                System.out.println(ans);
                return 1;
            }
    
            int count = 0;
            for (int jump : arr) {
                if (n - jump >= 0)
                    count += boardPath(n - jump, n, ans + jump);
            }
    
            return count;
        }
    
        public static int mazePath_HVD(int sr, int sc, int er, int ec, String ans) {
            if (sr == er && sc == ec) {
                System.out.println(ans);
                return 1;
            }
    
            int count = 0;
            if (sc + 1 <= ec)
                count += mazePath_HVD(sr, sc + 1, er, ec, ans + "H");
            if (sc + 1 <= ec && sr + 1 <= er)
                count += mazePath_HVD(sr + 1, sc + 1, er, ec, ans + "D");
            if (sr + 1 <= er)
                count += mazePath_HVD(sr + 1, sc, er, ec, ans + "V");
    
            return count;
        }
    
        public static int mazePath_MultiHVD(int sr, int sc, int er, int ec, String ans) {
            if (sr == er && sc == ec) {
                System.out.println(ans);
                return 1;
            }
    
            int count = 0;
            for (int jump = 1; sc + jump <= ec; jump++)
                count += mazePath_MultiHVD(sr, sc + jump, er, ec, ans + "H" + jump);
            for (int jump = 1; sc + jump <= ec && sr + jump <= er; jump++)
                count += mazePath_MultiHVD(sr + jump, sc + jump, er, ec, ans + "D" + jump);
            for (int jump = 1; sr + jump <= er; jump++)
                count += mazePath_MultiHVD(sr + jump, sc, er, ec, ans + "V" + jump);
    
            return count;
        }
    
        public static int permutation(String str, String ans) {
            if (str.length() == 0) {
                System.out.println(ans);
                return 1;
            }
    
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                String ros = str.substring(0, i) + str.substring(i + 1);
                count += permutation(ros, ans + str.charAt(i));
            }
    
            return count;
        }
    
        public static int permutationWithoutDuplicate(String str, String ans) {
            if (str.length() == 0) {
                System.out.println(ans);
                return 1;
            }
    
            int count = 0;
            char prev = '$';
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != prev) {
                    String ros = str.substring(0, i) + str.substring(i + 1);
                    count += permutationWithoutDuplicate(ros, ans + str.charAt(i));
                }
                prev = str.charAt(i);
            }
    
            return count;
    
        }
    
        public static void permutationWithoutDuplicate(String str) {
            StringBuilder sb = new StringBuilder();
            int[] freq = new int[26];
            for (int i = 0; i < str.length(); i++)
                freq[str.charAt(i) - 'a']++;
    
            for (int i = 0; i < 26; i++) {
                for (int j = 0; j < freq[i]; j++) {
                    sb.append((char) (i + 'a'));
                }
            }
    
            // System.out.println(sb);
            System.out.println(permutationWithoutDuplicate(sb.toString(),""));
        }
    
        public static void main(String[] args) {
            // ArrayList<String> ans = new ArrayList<>();
            // System.out.println(subsequence("abc", "", ans));
            // System.out.println(ans);
    
            // int[] arr = { 2, 5, 3, 1 };
            // System.out.println(boardPath(arr, 10, ""));
    
            // System.out.println(mazePath_MultiHVD(0, 0, 2, 2, ""));
    
            // System.out.println(permutation("aba", ""));
            permutationWithoutDuplicate("abab");
    
        }
    
    }



public static int permutation(String str, String ans){
    if(str.length()==0){
        System.out.println(ans);
        return count;
    }
}



    public static void main(String[] args) {
        // ArrayList<String> ans = new ArrayList<>();
        // System.out.println(subsequence("abc", "", ans));
        // System.out.println(ans);

        // int[] arr = { 2, 5, 3, 1 };
        // System.out.println(boardPath(arr, 10, ""));

        System.out.println(mazePath_MultiHVD(0, 0, 2, 2, ""));
    }

}