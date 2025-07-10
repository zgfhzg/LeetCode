class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer> pq = new PriorityQueue();

        // for (int i : nums) {
        //     pq.offer(i);

        //     if (pq.size() > k) pq.poll();
        // }
        // return pq.poll();
        quickSort(nums, 0, nums.length - 1);
        return nums[nums.length - 1 - (k - 1)];
    }

    public void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = pivot(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    public int pivot(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }
}