class Solution {
    public int timeRequiredToBuy(int[] t, int k) {
        Queue<Integer> q = new LinkedList<>();
        int time = 0;
        for(int i = 0; i<t.length;i++){
            q.offer(i);

        }

        while(t[k] != 0){
            int p = q.poll();
            t[p]--;
            time++;
            if(t[p]>0){
                q.offer(p);
            }
        }
        return time;
    }
}