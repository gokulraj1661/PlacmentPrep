class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                return nums[i];
            }

             else{
                m.put(nums[i],i);
            }
        }
        return -1;
        
        
    }
}