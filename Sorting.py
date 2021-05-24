def merge(arr,l,m,r): 
  # Function used to sort and merge the two parts. 
    
      # Initializing the first array with all values as "None".   
    L=[None]*(m-l+1) 
    
      # Initializing the second array with all values as "None". 
    R=[None]*(r-m)  
   
      # Assigning left half array values to the first array. 
    for i in range(m-l+1): 
        L[i]=arr[l+i] 
  
      # Assigning right half array values to the second array. 
    for j in range(r-m): 
        R[j]=arr[m+1+j]   
   
      # Initializing the variables to iterate over first array and second array. 
    i=0
    j=0 
    
      # Initializing the variable to iterate over the main array. 
    k=l 
    
      # Iterating the two half arrays to sort the values and merge to the main array. 
    while(i<(m-l+1) and j<(r-m)): 
        if(L[i]<=R[j]): 
            arr[k]=L[i] 
            i+=1 
        else: 
            arr[k]=R[j] 
            j+=1 
        k+=1  
        
      # Iterating over the remaining parts of anyone of the half array. 
    while(i<(m-l+1)): 
        arr[k]=L[i] 
        i+=1 
        k+=1 
    while(j<(r-m)): 
        arr[k]=R[j] 
        j+=1 
        k+=1 

def mergeSort(arr,l,r):  
  # Function used to divide the array into two parts at every level. 
  
    n=r-l+1 
    m=(l+r)//2 
    
      # Calling the functions until every part is of length greater than 1.
    if(n>1): 
        mergeSort(arr,l,m) 
        mergeSort(arr,m+1,r) 
        merge(arr,l,m,r) 

  # Taking the length of array as input. 
size=int(input())

  # Taking all the array elements as input. 
arr=list(map(int,input().split())) 
  
  # Calling the function to sort the input array. 
mergeSort(arr,0,size-1)

  # Displaying the sorted form of input array. 
print(*arr)
