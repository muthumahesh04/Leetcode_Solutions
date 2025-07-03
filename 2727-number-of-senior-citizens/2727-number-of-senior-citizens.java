class Solution {
    public int countSeniors(String[] details) {
        int senior_citizens=0;
        for(int i=0 ; i<details.length ; i++)
        {
            if(Integer.parseInt(details[i].substring(11,13))>60)
               senior_citizens++;
        }
        return senior_citizens;
    }
}