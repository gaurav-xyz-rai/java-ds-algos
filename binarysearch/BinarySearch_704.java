package binarysearch;

public class BinarySearch_704
{
    public static void main(String[] args)
    {
        BinarySearch_704 binarySearch704 = new BinarySearch_704();
        System.out.println(binarySearch704.binarySearch());
    }

    public int binarySearch()
    {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        int low = 0;
        int high = nums.length -1;

        while (low <= high)
        {
            int mid = (low + high)/2;
            int guess = nums[mid];
            if (guess == target)
            {
                return mid;
            } else if (guess > target)
            {
                high = mid -1;
            } else {
                low = mid +1 ;
            }
        }
        return -1;
    }
}
