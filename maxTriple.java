public int maxTriple(int[] nums) {
  int mid = nums.length / 2; // Find the middle index
    return Math.max(nums[0], Math.max(nums[mid], nums[nums.length - 1])); 

}
