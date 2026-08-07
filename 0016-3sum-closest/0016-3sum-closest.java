class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestDiff = Integer.MAX_VALUE;
        int closestSum = 0;

        int sum = 0, diff = 0;

        for(int i=0; i<nums.length; i++){
            int left = i+1;
            int right = nums.length - 1;

            while(left < right){
                sum = nums[i] + nums[left] + nums[right];
                diff = Math.abs(target - sum);

                if(diff < closestDiff){
                    closestDiff = diff;
                    closestSum = sum;
                }
                if(sum > target){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return closestSum;
    }
}