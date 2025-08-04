import java.util.Arrays;

public class nextpermutation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int l = nums.length;
        int pivot = -1;

        // Step 1: Find the pivot
        for (int i = l - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot, reverse the array
        if (pivot == -1) {
            reverse(nums, 0, l - 1);
        } else {
            // Step 3: Find element greater than pivot and swap
            for (int i = l - 1; i > pivot; i--) {
                if (nums[i] > nums[pivot]) {
                    swap(nums, pivot, i);
                    break;
                }
            }

            // Step 4: Reverse the suffix
            reverse(nums, pivot + 1, l - 1);
        }

        // Output result
        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
