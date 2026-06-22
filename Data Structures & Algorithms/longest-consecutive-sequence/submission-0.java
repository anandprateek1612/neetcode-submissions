class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

       for(int num:nums){
           int streak=0, curr=num;
           while(set.contains(curr)) {
              streak++;
              curr++;  
           }

           count=Math.max(count,streak);
       }

        return count;
    }
}
