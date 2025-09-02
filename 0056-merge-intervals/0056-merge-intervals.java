class Solution {

    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));

        List<int[]> result = new ArrayList<>();

        int start = intervals[0][0]; //Initialize with the starting index's first number
        int end = intervals[0][1];  //Inintialize with the starting index's second number

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                result.add(new int[] { start, end });
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        result.add(new int[] { start, end });

        int answer[][] = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

}