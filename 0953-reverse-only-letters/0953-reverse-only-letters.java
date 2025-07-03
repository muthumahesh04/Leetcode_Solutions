class Solution 
{
    public boolean isalpha(char ch)
    {
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
           return true;
        return false;
    }
    public String reverseOnlyLetters(String s) 
    {
        char[] arr=s.toCharArray();

        int low=0;
        int high=s.length()-1;

        while(low<high)
        {
            if(!isalpha(arr[low]))
               low++;
            else if(!isalpha(arr[high]))
               high--;
            else
            {
                char temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        return new String(arr);
    }
}