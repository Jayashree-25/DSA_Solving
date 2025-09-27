class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map1 = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);  //Turn the sorted character array back into a string
            map1.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        // Return all groups as a list of lists
        return new ArrayList<>(map1.values());
    }
}