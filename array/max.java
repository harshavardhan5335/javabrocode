package array;

public class max {
    public static void main(String[] args) {
        int[] arr = { 10, 50, 20, 90, 60 };
        int max = arr[0];
        int iteration = 0;
        for (int num : arr) {
            iteration++;
            if (num > max)
                max = num;
            System.out.println("iteration no " + iteration + " Max value in every iteration " + max);

        }
        System.out.println("Max: " + max);
    }
}
