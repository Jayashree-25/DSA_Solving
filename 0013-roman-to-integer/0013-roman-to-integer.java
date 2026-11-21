class Solution {
    public int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> map1 = new HashMap<>();
        map1.put('M', 1000);
        map1.put('D', 500);
        map1.put('C', 100);
        map1.put('L', 50);
        map1.put('X', 10);
        map1.put('V', 5);
        map1.put('I', 1);

        for(int i=0; i<s.length(); i++){
            if(i+1 < s.length() && map1.get(s.charAt(i)) < map1.get(s.charAt(i+1))){
                result -= map1.get(s.charAt(i));
            }
            else{
                result += map1.get(s.charAt(i));
            }
        }
        return result;
    }
}