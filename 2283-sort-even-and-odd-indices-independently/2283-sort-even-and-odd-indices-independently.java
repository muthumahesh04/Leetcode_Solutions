class Solution 
{
    public void swap(int[] arr,int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public void sort_even_indices_increasing(int arr[])
    {
        for(int i=0 ; i<arr.length-2 ; i+=2)
        {
            for(int j=0 ; j<arr.length-i-2 ; j+=2)
            {
                if(arr[j]>arr[j+2])
                {
                    swap(arr,j,j+2);
                }
            }
        }
    }
    public void sort_odd_indices_decreasing(int arr[])
    {
        for(int i=0 ; i<arr.length-2 ; i+=2)
        {
            for(int j=1 ; j<arr.length-i-2 ; j+=2)
            {
                if(arr[j]<arr[j+2])
                {
                    swap(arr,j,j+2);
                }
            }
        }
    }
    public int[] sortEvenOdd(int[] nums) 
    {
        sort_even_indices_increasing(nums);
        sort_odd_indices_decreasing(nums);

        return nums;
    }
}