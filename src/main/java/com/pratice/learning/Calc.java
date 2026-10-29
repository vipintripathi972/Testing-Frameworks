package com.pratice.learning;

public class Calc {
    
    public int div(int n1, int n2)
    {
        return n1/n2;
    }

    public int[] sort(int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i; j < nums.length; j++)
            {
                if (nums[j] < nums[i])
                {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }
}
