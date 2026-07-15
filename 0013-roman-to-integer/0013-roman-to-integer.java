class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> m1 = new HashMap<>();
        m1.put('I', 1);
        m1.put('V', 5);
        m1.put('X', 10);
        m1.put('L', 50);
        m1.put('C', 100);
        m1.put('D', 500);
        m1.put('M', 1000);

        int res=0;
        for(int i=0; i<s.length(); i++){
            if(i+1 < s.length() && m1.get(s.charAt(i)) < m1.get(s.charAt(i + 1))){
                res -= m1.get(s.charAt(i));
            }
            else{
                res += m1.get(s.charAt(i));
            }
        }
        return res;
    }
}