class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        int left = 0;
        int right = words.length - 1;
        String temp = "";
        String result = "";

        while(left < right){
            temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        for(int i=0; i<words.length; i++){
            result += words[i] + " ";
        }
        return result.trim();
    }
}