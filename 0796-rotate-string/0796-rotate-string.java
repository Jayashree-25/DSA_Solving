class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }

        String doubled = s + s;
        return doubled.contains(goal);

        // for(int i=0; i<s.length(); i++){
        //     if(!s.equals(goal)){
        //         s = s.substring(1) + s.charAt(0); 
        //     }
        // }
        // return s.equals(goal);
    }
}