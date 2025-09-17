class Solution 
{
    public int processTime(String time)
    {
        int Hours=Integer.parseInt(time.substring(0,2));
        int Minutes=Integer.parseInt(time.substring(3,5));

        int totalMinutes=(Hours*60)+Minutes;

        return totalMinutes;
    }
    public List<String> alertNames(String[] keyName, String[] keyTime) 
    {
        Map<String,List<Integer>> myMap=new HashMap<>();

        for(int i=0 ; i<keyName.length ; i++)
        {
            // list.add(...) returns a boolean (true/false),
            // so you were accidentally storing a boolean instead of a list in the map ❌.
            // myMap.put(keyName[i],myMap.getOrDefault(name,new ArrayList<>()).add(processTime(keyTime[i])));
     
            // myMap.computeIfAbsent("daniel", k -> new ArrayList<>())
            // Create daniel → [] (an empty list) if "daniel" not in map,
            // return the existing list myMap.get("daniel") if it’s already there.
            myMap.computeIfAbsent(keyName[i], k -> new ArrayList<>()).add(processTime(keyTime[i]));
        }
        List<String> alerts = new ArrayList<>();

        for (String name : myMap.keySet()) {
            List<Integer> times = myMap.get(name);
            Collections.sort(times);

            for (int j = 2; j < times.size(); j++) {
                if (times.get(j) - times.get(j - 2) <= 60) {
                    alerts.add(name);
                    break; // only add once per worker
                }
            }
        }

        Collections.sort(alerts);
        return alerts;
        
    }
}