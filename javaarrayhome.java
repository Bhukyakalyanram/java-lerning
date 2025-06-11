
public class javaarrayhome {

    public static void subArray(int arr[]) {
        int n = arr.length;
        int currsum;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int start = i;
            for (int j = i; j < n; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum = currsum + arr[k];
                    if (currsum > maxsum) {
                        maxsum = currsum;
                    }
                }

            }
        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        subArray(arr);
    }
}
