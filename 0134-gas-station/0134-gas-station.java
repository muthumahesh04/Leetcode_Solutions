class Solution 
{
    public int canCompleteCircuit(int[] gas, int[] cost) 
    {
        int total_Available=0;
        int total_Need=0;
        for(int i=0 ; i<gas.length ; i++)
        {
            total_Available+=gas[i];
            total_Need+=cost[i];
        }
        if(total_Need>total_Available)
            return -1;
        
        int gas_in_tank=0;
        int starting_index=0;
        for(int i=0 ; i<gas.length ; i++)
        {
            gas_in_tank+=(gas[i]-cost[i]);

            if(gas_in_tank<0)
            {
                starting_index=i+1;
                gas_in_tank=0;
                continue;
            }
        }
        return starting_index;
    }
}