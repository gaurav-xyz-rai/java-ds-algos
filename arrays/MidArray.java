package arrays;

import java.util.Arrays;

public class MidArray
{
    public static void main(String[] args)
    {
        int[] array = {1, 2};
        System.out.println(Arrays.toString(MidArray.middle(array)));
    }
    public static int[] middle(int[] array) {
        int[] midArray = new int[array.length - 2];
        for (int i = 1; i < array.length - 1; i++)
        {
            midArray[i-1] = array[i];
        }
        return midArray;
    }
}
