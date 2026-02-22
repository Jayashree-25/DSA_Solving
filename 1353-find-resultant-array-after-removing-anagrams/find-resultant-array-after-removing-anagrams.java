class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        result.add(words[0]);

        for(int i=1; i<words.length; i++){
                char[] w1 = result.get(result.size() - 1).toCharArray();
                char[] w2 = words[i].toCharArray();

                Arrays.sort(w1);
                Arrays.sort(w2);

                if(!Arrays.equals(w1, w2)){
                    result.add(words[i]);
                }
        }
        return result;
    }
}