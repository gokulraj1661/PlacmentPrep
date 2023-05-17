class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h =new HashMap<>();
        int a[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(target-nums[i])){
                a[0]=i;
                a[1]=h.get(target-nums[i]);
            }else{
                h.put(nums[i],i);
            }
        }
        return a;
    }
}