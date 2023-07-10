import java.util.Arrays;

public class Assignment6_1 {
    public static int[] reconstructPermutation(String s) {
        int n = s.length();
        int[] perm = new int[n + 1];
        int start = 0;
        int end = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = start;
                start++;
            } else if (s.charAt(i) == 'D') {
                perm[i] = end;
                end--;
            }
        }

        perm[n] = start;  // Assign the last value

        return perm;
    }

    public static void main(String[] args) {
        String s = "DIII";
        int[] perm = reconstructPermutation(s);

        System.out.println(Arrays.toString(perm));
    }
}
