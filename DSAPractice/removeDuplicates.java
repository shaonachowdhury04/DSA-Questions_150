class removeDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Edge case

        int uniqueIndex = 0; // Points to the last unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) { // If a new unique element is found
                uniqueIndex++; 
                nums[uniqueIndex] = nums[i]; // Move it forward
            }
        }
        return uniqueIndex + 1; // Length of unique elements
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(nums);

        // Print the array with unique elements
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
