class Solution 
{
    public void reverse(int array[],int start,int end)
    {
        while(start<end)
        {
            int temporary=array[start];
            array[start]=array[end];
            array[end]=temporary;
            start++;
            end--;
        }
    }
    public void swap(int array[],int indx1,int indx2)
    {
        int temp=array[indx1];
        array[indx1]=array[indx2];
        array[indx2]=temp;
    }
    public void nextPermutation(int[] nums) 
    {
        int dip_index=-1;
        int dip_number=nums[0];

        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                dip_index=i;
                dip_number=nums[i];
                break;
            }
        }
        if(dip_index==-1)
        {
            reverse(nums,0,nums.length-1);
            return;
        }
           
        int next_greater_number=Integer.MAX_VALUE;
        int next_greater_number_index=-1;
        for(int i=dip_index+1;i<nums.length;i++)
        {
            if(nums[i]>dip_number && nums[i]<=next_greater_number)
            {
                next_greater_number=nums[i];
                next_greater_number_index=i;
            }
        }
        swap(nums,dip_index,next_greater_number_index);
        
        reverse(nums,dip_index+1,nums.length-1);
    }
}