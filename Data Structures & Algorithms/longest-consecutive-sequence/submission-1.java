class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<Integer>();
        for(int n: nums){
            set.add(n);
        }

        int res=0;
        for(int n: nums){
            int curr = n;
            int seq = 0;
            while(set.contains(curr)){
                curr++;
                seq++;
            }
            res = Math.max(res,seq);
        }

        return res;
    }
}
