class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            countMap.put(nums[i],countMap.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            countMap.put(nums[i],countMap.get(nums[i])-1);
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length;j++){
                countMap.put(nums[j],countMap.get(nums[j])-1);
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int target = -(nums[i]+nums[j]);
                if(countMap.getOrDefault(target,0)>0){
                    res.add(Arrays.asList(nums[i],nums[j],target));
                }
            }

            for(int j=i+1;j<nums.length;j++){
                countMap.put(nums[j],countMap.get(nums[j])+1);
            }
        }

        return res;
    }
}
