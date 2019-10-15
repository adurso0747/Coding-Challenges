
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    
    *returnSize = 2;
    int *returnArray = (int*) malloc(2 * sizeof(int));
 
    // if memory cannot be allocated
    if(returnArray == NULL)                     
    {
        printf("Error! memory not allocated.");
        exit(0);
    }

    
    for(size_t i = 0; i< numsSize; ++i){
        for(size_t j = i+1; j< numsSize; ++j){
            if(nums[i] + nums[j] == target){
                returnArray[0] = i;
                returnArray[1] = j;
                return returnArray;
            }
                
        }
    }  
    return 0;
}
