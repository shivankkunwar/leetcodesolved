class Solution {

    public boolean increasingTriplet(int[] nums) {
        
      int len = nums.length;
        if(len<3)
        {
            return false;
        }
        int first_num = Integer.MAX_VALUE;
        int second_num = Integer.MAX_VALUE;
        for(int num:nums)
        {
            if(num<=first_num)
            {
                first_num = num;
            }
            else if(num>first_num&&num<=second_num)
            {
                second_num = num;
            }else
            {
                return true;
            }
        }
        return false;
    }
}