
public class bitmanupulation {

    public static int bitclearrange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static void main(String args[]) {
        int result = bitclearrange(25, 2, 3);
        System.out.println(result);
    }
}
