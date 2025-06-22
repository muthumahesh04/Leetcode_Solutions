class Solution {
    public void reverse(char array[],int start,int end)
    {
        while(start<end)
        {
            char temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }
    public String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        
        for(int i=0 ; i<s.length() ; i+=(k*2))
        {
            reverse(arr,i,Math.min(i+k-1,s.length()-1));
        }
        return new String(arr);
    }
}