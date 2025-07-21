class Solution 
{
    public void sort_intervals(int[][] arr)
    {
        int length=arr.length;
        for(int i=0 ; i<length ; i++)
        {
            for(int j=0 ; j<length-i-1 ; j++)
            {
                if(arr[j][0]>arr[j+1][0])
                {
                    int[] temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public int[][] merge(int[][] intervals) 
    {
        sort_intervals(intervals);
        
        List<int[]> result=new ArrayList<>();

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
                result.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        result.add(new int[]{start,end});

        int answer[][]=new int[result.size()][];
        for(int i=0 ; i<result.size() ; i++)
        {
            answer[i]=result.get(i);
        }
        return answer;
    }
    
}