class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] newArray = new int[A.length];
        int count1 = 0;
        int count2 = 0;
   
        for(int i = 0; i< A.length; i++)
        {
            if(A[i] % 2 == 0)
            {
                if(count1 % 2 == 0 )
                {
                    newArray[count1] = A[i];
                    count1 = count1 + 2;
                }
                else
                {
                    newArray[count1 + 1] = A[i];    
                    count1 = count1 + 2;
                }
               
            }
           
        }
        for(int i = 0; i< A.length; i++)
        {
            if(A[i] % 2 == 1)
            {
                if(count2 % 2 == 1)
                {
                    newArray[count2] = A[i];
                    count2 = count2 + 2;
                }
                else
                {
                    newArray[count2 + 1] = A[i];    
                    count2 = count2 + 2;
                }
            }
           
        }
        return newArray;

    }
}