// Solution class to implement function largestAndSecondLargest
class Solution{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        Arrays.sort(arr);
        int firstMax=arr[sizeOfArray-1];
        int secondMax=-1;
        for(int i=0;i<sizeOfArray;i++)
        {
            if(arr[i]>secondMax)
            {
                if(arr[i]<firstMax)
                {
                    secondMax=arr[i];
                }
            }
        }
        ArrayList<Integer> AL=new ArrayList<>();
        AL.add(firstMax);
        AL.add(secondMax);
        return AL;
        
    }
}