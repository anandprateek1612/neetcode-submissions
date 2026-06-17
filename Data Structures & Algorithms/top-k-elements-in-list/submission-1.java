class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        //count each number's frequency
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        //create freq bucket that store numbers  in a array with that same freq
        List<Integer>[] freq = new List[nums.length+1];
        for(int i=0;i<freq.length;i++){
            freq[i]= new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index=0;
        for(int i=freq.length-1;i>0;i--){
            for(int n:freq[i]){
                if(index==k)
                    return res;
                res[index++]=n;
                
            }
        }
        return res;
    }
}
