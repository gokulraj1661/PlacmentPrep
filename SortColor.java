class Solution {
    public void sortColors(int[] nums) {
        int zer = 0;
        int one =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zer++;
            }else if(nums[i]==1){
                one++;
            }
        }

        System.out.println(zer + " " + one);

        for(int i=0;i<zer;i++){
            nums[i] = 0;
        }
        for(int i=zer;i<one+zer;i++){
            nums[i] = 1;
        }
        for(int i=zer+one;i<nums.length;i++){
            nums[i] = 2;
        }
    }
}