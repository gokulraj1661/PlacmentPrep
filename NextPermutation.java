class Solution {
    public void nextPermutation(int[] nums) {
        int idx=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        
        if(idx == -1){
            int s=0,n=nums.length-1;
            while(s < n){
                int temp = nums[s];
                nums[s++] = nums[n];
                nums[n--]=temp;
            }
            return;
        }
        
        for(int i=nums.length-1;i>idx;i--){
            if(nums[i]>nums[idx]){
                int temp=nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }
        
        int s=idx+1,n=nums.length-1;
        while(s < n){
            int temp = nums[s];
            nums[s++] = nums[n];
            nums[n--]=temp;
        }
        
        
        
    }
}