class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m1 = new HashMap<>();
        for(int n : nums){
            if(!m1.containsKey(n)){
                m1.put(n, 1);
            }else{
                m1.put(n, m1.get(n) + 1);
            }
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));

        for(Map.Entry<Integer, Integer> entry : m1.entrySet()){
            pq.add(entry);
        }

        int[] res = new int[k];
        for(int i=0; i<k; i++){
            Map.Entry<Integer, Integer> top = pq.poll();
            res[i] = top.getKey();
        }
        return res;
    }
}