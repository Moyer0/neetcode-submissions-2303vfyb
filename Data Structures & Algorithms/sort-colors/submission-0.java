class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            // optimización (opcional)
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) break; // si ya está ordenado
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}