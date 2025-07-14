class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        int length=nums.length;

        for(int i=0 ; i<length ; i++)
        {
            if((i-k < 0 || nums[i]>nums[i-k]) && (i+k > length-1 || nums[i]>nums[i+k]))
               sum+=nums[i];
        }
        return sum;
    }
}