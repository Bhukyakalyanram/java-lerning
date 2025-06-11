
public class prefix {

    public static void prefixSum(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int j = 0; j < arr.length; j++) {
            int start = j;
            for (int k = j; k < arr.length; k++) {
                int end = k;
                int currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (currsum > maxsum) {
                    maxsum = currsum;
                }
            }

        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        prefixSum(arr);
    }
}
