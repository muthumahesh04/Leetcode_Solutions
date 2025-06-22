class Solution 
{
    public String reverseWords(String s) 
    {
        char[] ch=s.toCharArray();
        int n=s.length();
        reverse(ch,0,n-1);
        reverseWord(ch,n);
        return cleanSpace(ch,n);
    }
    private void reverse(char[] ch,int i,int j)
    {
        while(i<j)
        {
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
    }
    private void reverseWord(char[] ch,int n)
    {
        int wordstart=0;
        int traversing_pointer=0;

        while(traversing_pointer<n)
        {
            while(traversing_pointer<n && ch[traversing_pointer]==' ') traversing_pointer++;   // Skip spaces
            wordstart=traversing_pointer;                            // Set i to the start of the word
            while(traversing_pointer<n && ch[traversing_pointer]!=' ') traversing_pointer++;   //j points to space next to end of a word
            reverse(ch,wordstart,traversing_pointer-1);
        }
    }
    // Shift characters forward and ensure only one space between words
    private String cleanSpace(char[] ch,int n)
    {
        int writing_pointer=0,traversing_pointer=0;
        while(traversing_pointer<n)
        {
            //"word word word"
            while(traversing_pointer<n && ch[traversing_pointer]==' ') traversing_pointer++; //it skips all leading spaces for each word
            while(traversing_pointer<n && ch[traversing_pointer]!=' ') ch[writing_pointer++]=ch[traversing_pointer++];//word
            while(traversing_pointer<n && ch[traversing_pointer]==' ') traversing_pointer++;  // Skip all extra spaces after the word (to handle multiple spaces between words).
            if(traversing_pointer<n) 
                ch[writing_pointer++] = ' '; // Add one space between words only if more words are coming.
        }
        return new String(ch).substring(0,writing_pointer);    //after all forward swaps i will be pointing to the last character
    }
}