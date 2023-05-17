class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!h.containsKey(nums[i])){
                h.put(nums[i],1);
            }else{
                h.put(nums[i],h.get(nums[i])+1);
            }
            
            
            
        }
        
        int n=nums.length/2;
        for(Map.Entry<Integer,Integer> s:h.entrySet()){
            if(s.getValue()>n){
                return s.getKey();
            }
        }
        return 1;
    }
}