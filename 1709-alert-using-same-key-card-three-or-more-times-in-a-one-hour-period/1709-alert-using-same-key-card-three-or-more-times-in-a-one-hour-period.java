class Solution 
{
    public int ProcessTime(String time)
    {
        int Hours=Integer.parseInt(time.substring(0,2));
        int Minutes=Integer.parseInt(time.substring(3,5));

        return (Hours*60)+Minutes;
    }
    public List<String> alertNames(String[] keyName, String[] keyTime) 
    {
        Map<String,List<Integer>> myMap=new HashMap<>();

        for(int i=0 ; i<keyName.length ; i++)
        {
            myMap.computeIfAbsent(keyName[i], k-> new ArrayList<>()).add(ProcessTime(keyTime[i]));
        }

        List<String> alertNames=new ArrayList<>();

        for(String name: myMap.keySet())
        {
            List<Integer> times=myMap.get(name);
            Collections.sort(times);

            for(int i=2 ; i<times.size() ; i++)
            {
                if(times.get(i)-times.get(i-2)<=60)
                {
                    alertNames.add(name);
                    break;
                }
            }
        }
        Collections.sort(alertNames);
        return alertNames;
    }
}