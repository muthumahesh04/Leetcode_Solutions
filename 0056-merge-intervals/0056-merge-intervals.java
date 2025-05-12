class Solution 
{
    public void sort_intervals(int intervals[][])
    {
        //Bubble sort to sort the intervals
        for(int i=0 ; i<intervals.length-1 ; i++)
        {
            for(int j=0 ; j<intervals.length-i-1 ; j++)
            {
                if(intervals[j][0]>intervals[j+1][0])
                {
                    int temp[]=intervals[j];
                    intervals[j]=intervals[j+1];
                    intervals[j+1]=temp;
                }
            }
        }
    }
    public int[][] merge(int[][] intervals) 
    {
        sort_intervals(intervals);

        List<int[]> merged_Intervals=new ArrayList<>();

        int start=intervals[0][0];
        int end=intervals[0][1];

        for(int i=0 ; i<intervals.length ; i++)
        {
            if(intervals[i][0]<=end)
            {
                end=Math.max(end,intervals[i][1]);
            }
            else
            {
                merged_Intervals.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        merged_Intervals.add(new int[]{start,end});

        int result[][]=new int[merged_Intervals.size()][2];
        for(int i=0;i<merged_Intervals.size();i++)
        {
            result[i][0]=merged_Intervals.get(i)[0];
            result[i][1]=merged_Intervals.get(i)[1];
        }
        return result;
    }
}