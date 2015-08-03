/*
1) Initialize count as 0
2) Sort all numbers in increasing order.
3) Remove duplicates from array.
4) Do following for each element arr[i]
   a) Binary Search for arr[i] + k in subarray from i+1 to n-1.
   b) If arr[i] + k found, increment count. 
5) Return count. 
*/

int countPairsWithDiffK(int arr[]){
	int count = 0;
	int i,j=0,tmp;
	int k=arr[0];
	int n=arr[1];
	int array[n-2];
	//separating elements
    	for (i = 2; i < (n+2); i++){
		array[j]=arr[i];
		j++;
    	}
	//sorting
	for(i=0;i<n;i++){
		for(j=0;j<n-i;j++){
	      		if(array[j]>array[j+1]){
	           		tmp=array[j];
	            		array[j]=array[j+1];
	            		array[j+1]=tmp;
	       		}
	 	}
     	}
	//deleting duplicate entries
	for (i = 0; i < n; i++){
    		for(j=i+1; j < n; ){
         		if(aray[j] == array[i]){
            			for(k=j; k < n;k++){
               				array[k] = array[k+1];
            			}
            			n--;
         		}else {
            			j++;
         		}
      		} 
	}
    
    // Pick all elements one by one
    for ( i = 0; i < n; i++)
    {       
        // See if there is a pair of this picked element
        for (j = i+1; j < n; j++)
            if (array[i] - array[j] == k || array[j] - array[i] == k )
                  count++;
    }
    return count;
}
