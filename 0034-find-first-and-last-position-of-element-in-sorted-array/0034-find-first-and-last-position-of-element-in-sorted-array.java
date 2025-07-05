class Solution {
    public int[] searchRange(int[] arr, int target) {
        if(arr.length==0)
           return new int[]{-1,-1};
        if(arr.length==1 && arr[0]!=target)
           return new int[]{-1,-1};
        int result[] = new int[2];

        int low=0;
        int high=arr.length-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(arr[mid]<target)
                low=mid+1;
            else
               high=mid-1;
        }
        result[0]= (low < arr.length && arr[low] == target) ? low : -1;

        low=0;
        high=arr.length-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(arr[mid]<=target)
                low=mid+1;   
            else
                high=mid-1;
        }
        result[1]= (high >= 0 && arr[high] == target) ? high : -1;

        return result;
    }
}