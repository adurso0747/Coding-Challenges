class Solution {
 public int[] sortArrayByParity(int[] A) {
        int[] newArray = new int[A.length];
        int count1 = 0;
   
        for(int i = 0; i< A.length; i++)
        {
            if(A[i] % 2 == 0)
            {
                newArray[count1] = A[i];
                count1++;
            }
           
        }
        for(int i = 0; i< A.length; i++)
        {
            if(A[i] % 2 == 1)
            {
                newArray[count1] = A[i];
                count1++;
            }
           
        }


        return newArray;

    }
}