public boolean sameFirstLast(int[] nums) {
  for(int i=0;i<=nums.length-1;i++)
  {
  return (nums[0] == nums[nums.length-1] );
  
  }
  return false;
}
