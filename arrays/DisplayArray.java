package arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisplayArray
{
    public static void main (String[] args)
    {
       Integer[] arr = new Integer[10];
       for (int i = 0; i < arr.length; i++)
        {
            arr[i] = i;
        }
       System.out.println(Arrays.toString(arr));
    }
}
