class Solution 
{
    public int find_next_greater_number_index(int[] nums,int start,int end,int target)
    {
        int next_greater_number=Integer.MAX_VALUE;
        int next_greater_number_index=-1;
        for(int i=start ; i<=end ; i++)
        {
            if(nums[i]>target && nums[i]<next_greater_number)
            {
                next_greater_number=nums[i];
                next_greater_number_index=i;
            }
        }
        return next_greater_number_index;
    }  
    public void swap(int arr[],int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    } 
    public void sort(int arr[],int start_index,int end_index)
    {
        for(int i=start_index; i<=end_index; i++)
        {
           for(int j=i+1 ; j<=end_index ; j++)
           {
              if(arr[i]>arr[j])
              {
                 int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
              }
           }
        }   
    }
    public void nextPermutation(int[] nums) 
    {
        int dip_index=-1;
        int dip_number=Integer.MAX_VALUE;

        for(int i=nums.length-2 ; i>=0 ;i--)
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
            sort(nums,0,nums.length-1);
            return;
        }

        int next_greater_number_index=find_next_greater_number_index(nums,dip_index+1,nums.length-1,dip_number);

        swap(nums,dip_index,next_greater_number_index);
        sort(nums,dip_index+1,nums.length-1);
    }
    
}