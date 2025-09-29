class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> Rmap = new HashMap<>();
        Rmap.put('I', 1);
        Rmap.put('V', 5);
        Rmap.put('X', 10);
        Rmap.put('L', 50);
        Rmap.put('C', 100);
        Rmap.put('D', 500);
        Rmap.put('M', 1000);

        int result = 0;
        for(int i=0; i<s.length(); i++){
            int value = Rmap.get(s.charAt(i));
            if(i + 1 < s.length() && Rmap.get(s.charAt(i)) < Rmap.get(s.charAt(i+1))){
                result -= value;
            }
            else{
                result += value;
            }
        }
        return result;
    }
}