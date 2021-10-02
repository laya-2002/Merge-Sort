#include<stdio.h> 
  // Declaring the functions 
void merge(int* arr,int l,int r,int m); 
void mergeSort(int* arr,int l,int r); 

  // Defining the function which merges the divided subarrays. 
void merge(int* arr,int l,int r,int m){
    int L[m-l+1],R[r-m]; 
    int i,j,k;
    for(i=0;i<(m-l+1);i++){
        L[i]=arr[l+i];
    }
    for(j=0;j<(r-m);j++){
        R[j]=arr[m+1+j]; 
    }
    i=0;
    j=0; 
    k=l; 
    while(i<(m-l+1) && j<(r-m)){
        if(L[i]<=R[j]){
            *(arr+k)=L[i]; 
            ++i;
        }
        else{
            *(arr+k)=R[j];
            ++j; 
        }
        ++k; 
    }
    while(i<(m-l+1)){
        *(arr+k)=L[i]; 
        ++i; 
        ++k; 
    }
    while(j<(r-m)){
        *(arr+k)=R[j]; 
        ++j; 
        ++k; 
    }
}

  /* Defining the function which divides 
     the array into two parts until all the 
     subarrays contain only one element.    */
void mergeSort(int* arr,int l,int r){
    if(l<r){
        int m=(l+r)/2; 
        mergeSort(arr,l,m); 
        mergeSort(arr,m+1,r); 
        merge(arr,l,r,m);
    }
}

int main(){
	int n,i; 
          // Taking array size as input. 
	scanf("%d",&n); 
	int arr[n]; 
          // Taking array elements as input. 
	for(i=0;i<n;i++){
	    scanf("%d",&arr[i]); 
	}
          // Calling the function to sort the array.
	mergeSort(arr,0,n-1); 
          // Displaying the array elements after sorting.
	for(i=0;i<n;i++){
	    printf("%d ",arr[i]); 
	}
	return 0;
}
