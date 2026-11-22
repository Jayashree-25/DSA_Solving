class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map1 = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(!map1.containsKey(complement)){
                map1.put(nums[i], i);
            }
            else{
                return new int[]{map1.get(complement), i};
            }
        }
        return new int[]{-1, -1};
    }
}