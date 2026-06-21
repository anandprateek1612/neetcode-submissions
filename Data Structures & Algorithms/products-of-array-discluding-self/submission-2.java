class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int prefix = 1;
        res[0]=prefix;
        for(int i=1;i<nums.length;i++){
            res[i]=prefix*nums[i-1];
            prefix=res[i];
            //System.out.println(res[i]);
        }

        int sufix = 1;
        //nums[1,2,4,6]
        //res=[1,1,2,8]
        for(int i=nums.length-1;i>=0;i--){
            res[i]=sufix*res[i];
            sufix*=nums[i];
            //System.out.println(res[i]);
        }


        // int[] prefixProduct = new int[nums.length];
        // //Arrays.fill(prefixProduct, 1);
        // prefixProduct[0]=1;
        // for(int i=1;i<nums.length;i++){
        //     //System.out.println(prefixProduct[i-1]*nums[i]);
        //     prefixProduct[i]=prefixProduct[i-1]*nums[i-1];
        // }
        // int[] suffixProduct = new int[nums.length];
        // //Arrays.fill(suffixProduct, 1);
        // suffixProduct[nums.length-1]=1;
        // for(int i=nums.length-2;i>=0;i--){
        //     //System.out.println(suffixProduct[i+1]*nums[i]);
        //     suffixProduct[i]=suffixProduct[i+1]*nums[i+1];
        // }
        // System.out.println("prefixProduct");
        // for(int i=0;i<nums.length;i++){
        //     System.out.println(prefixProduct[i]);
        // }
        // System.out.println("SuffixProduct");
        // for(int i=0;i<nums.length;i++){
        //     System.out.println(suffixProduct[i]);
        // }

        // for(int i=0;i<nums.length;i++){
        //     res[i]=prefixProduct[i]*suffixProduct[i];
        // }

        return res;

    }
}  
