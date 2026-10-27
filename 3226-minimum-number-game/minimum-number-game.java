class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int n : nums){
            pq.offer(n);
        }

        int[] res = new int[nums.length];
        int i = 0;
        while(!pq.isEmpty()){
            int alice = pq.poll();
            int bob = pq.poll();

            res[i++] = bob;
            res[i++] = alice;

        }

        return res;
    }
}