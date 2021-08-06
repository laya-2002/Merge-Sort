import java.util.Scanner; 
public class Sorting{ 
    public static void merge(int[] arr,int l,int m,int r){   
      // Function used to sort and merge the two parts. 

          // Declaring the first array.
        int[] L=new int[m-l+1]; 

          // Declaring the second array. 
        int[] R=new int[r-m]; 

          // Initializing the first array. 
        for(int i=0;i<(m-l+1);i++){
            L[i]=arr[l+i]; 
        }

          // Initializing the second array.
        for(int j=0;j<(r-m);j++){
            R[j]=arr[m+1+j]; 
        } 

          // Initializing the variables to iterate over first array, second array and main array.
        int i=0,j=0,k=l; 
          
          // Iterating the two half arrays to sort the values and merge to the main array.
        while(i<(m-l+1) && j<(r-m)){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                ++i;
            }
            else{
                arr[k]=R[j]; 
                ++j; 
            } 
            ++k; 
        }
      
          // Iterating over the remaining parts of anyone of the half array.
        while(i<(m-l+1)){
            arr[k]=L[i];
            ++i; 
            ++k; 
        } 
        while(j<(r-m)){
            arr[k]=R[j]; 
            ++j; 
            ++k; 
        }
    } 
    
    public static void mergeSort(int[] arr,int l,int r){
          // Function used to divide the array into two parts at every level.
        
        int n=r-l+1; 
        int m=l+((r-l)/2);

          // Calling the functions until every part is of length greater than 1.
        if(n>1){
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r); 
            merge(arr,l,m,r); 
        }
    }
    public static void main(String args[]){       
        Scanner m=new Scanner(System.in); 

          // Taking the length of array as input.
        int size=m.nextInt(); 
       
          // Declaring the array.
        int[] arr=new int[size]; 

          // Taking all the array elements as input.
        for(int i=0;i<size;i++){
            arr[i]=m.nextInt(); 
        } 
        m.close();

          // Calling the function to sort the input array.
        mergeSort(arr,0,size-1); 
   
          // Displaying the sorted form of input array.
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
