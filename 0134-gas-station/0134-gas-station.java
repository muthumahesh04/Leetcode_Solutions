class Solution 
{
    public int canCompleteCircuit(int[] gas, int[] cost) 
    {
        int gas_exist=0;
        int required_gas=0;
        
        for(int i=0 ; i<gas.length ; i++)
        {
            gas_exist+=gas[i];
            required_gas+=cost[i];
        }
        if(required_gas>gas_exist)
          return -1;
        
        int starting_index=0;
        int gas_remaining_in_tank=0;

        for(int i=0 ; i<gas.length ; i++)
        {
            if(gas_remaining_in_tank+gas[i] >= cost[i])
            {
                gas_remaining_in_tank+=(gas[i]-cost[i]);
            }
            else
            {
                starting_index=i+1;
                gas_remaining_in_tank=0;
            }
        }
        return starting_index;
    }
}