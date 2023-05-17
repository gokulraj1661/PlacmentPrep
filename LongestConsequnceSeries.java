class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int c=1;
        int a=0;
        while(i<j && j<nums.length){
            if(nums[j]==nums[i]+1){
                c++;
                i++;
                j++;
            }else if(nums[i]==nums[j]){
                i++;
                j++;
            }
            else{
                i=j;
                j=i+1;
                a=Math.max(a,c);
                c=1;
            }
        }
        
        return Math.max(a,c);
    }
}