class Solution {
    public int numJewelsInStones(String J, String S) {
        char jArray[] = J.toCharArray();
        char sArray[] = S.toCharArray();
        int count = 0;
        
        for (int i = 0; i < jArray.length; i++){
            for(int j = 0; j< sArray.length;j++ ){
                if(jArray[i] == sArray[j]){
                    count++;
                }
            }
            
        }
        return count;
    }
}