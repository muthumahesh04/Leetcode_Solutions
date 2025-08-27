class Solution 
{
    public int compareVersion(String version1, String version2) 
    {
        int version1_pointer=0;
        int version2_pointer=0;

        while(version1_pointer < version1.length() || version2_pointer < version2.length())
        {
            int number1=0;
            while(version1_pointer < version1.length() && version1.charAt(version1_pointer) != '.')
            {
                number1=(number1*10)+(version1.charAt(version1_pointer)-'0');
                version1_pointer++;
            }

            int number2=0;
            while(version2_pointer < version2.length() && version2.charAt(version2_pointer) != '.')
            {
                number2=(number2*10)+(version2.charAt(version2_pointer)-'0');
                version2_pointer++;
            }
            
            if(number1 > number2)
               return 1;
            else if(number1 < number2)
               return -1;
            version1_pointer++;
            version2_pointer++;
        }
        return 0;
    }
}