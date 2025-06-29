class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        int length=nums.length;
        k=k%length;
        
        reverse(nums,0,length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,length-1);
        
    }
    void reverse(int arr[],int start,int end)
    {
        while(start<end)
        {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        }
        
    }
}