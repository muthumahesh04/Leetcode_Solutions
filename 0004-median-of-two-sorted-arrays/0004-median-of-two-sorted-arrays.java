class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int m=nums1.length;
        int n=nums2.length;
        if(n<m)
          return findMedianSortedArrays(nums2,nums1);
        
        int total_numbers_must_left_half=(m+n+1)/2;
        int low=0;
        int high=m;
        int l1=Integer.MIN_VALUE;
        int l2=Integer.MIN_VALUE;
        int r1=Integer.MAX_VALUE;
        int r2=Integer.MAX_VALUE;

        while(low<=high)
        {
            int total_numbers_from_nums1=low+(high-low)/2;
            int total_numbers_from_nums2=total_numbers_must_left_half-total_numbers_from_nums1;

            l1=(total_numbers_from_nums1-1==-1) ? Integer.MIN_VALUE : nums1[total_numbers_from_nums1-1];
            l2=(total_numbers_from_nums2-1==-1) ? Integer.MIN_VALUE : nums2[total_numbers_from_nums2-1];
            r1=(total_numbers_from_nums1==m) ? Integer.MAX_VALUE : nums1[total_numbers_from_nums1];
            r2=(total_numbers_from_nums2==n) ? Integer.MAX_VALUE : nums2[total_numbers_from_nums2];

            if(l1<=r2 && l2<=r1)
            {
                if((m+n)%2==1)
                   return (double)(Math.max(l1,l2));
                return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
            }
            else if(l1>r2)
                high=total_numbers_from_nums1-1;
            else
                low=total_numbers_from_nums1+1;
        }
        return 0.0;
    }
}