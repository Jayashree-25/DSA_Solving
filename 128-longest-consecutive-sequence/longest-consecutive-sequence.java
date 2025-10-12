class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Set<Integer> hSet = new HashSet<>();
        for(int num : nums){
            hSet.add(num);
        }
        int longest=0;
        for(int num : hSet){
            if(!hSet.contains(num-1)){
                int current = num;
                int length = 1;

                while(hSet.contains(current + 1)){
                    current++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}