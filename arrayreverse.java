package Array;

public class arrayreverse {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int n = arr.length;
        for(int ele:arr)
        {
        System.out.print(ele+" ");
        }
        System.out.println();
 
// Normal method        
        // System.out.println();
        //  for(int i=0;i<n/2;i++)
        //  {
        //    int j =n-1-i;
        //    int temp = arr[i];
        //    arr[i] =arr[j];
        //    arr[j] = temp;

        //  }
        //  for(int ele:arr)
        //  {
        //     System.out.print(ele+" ");
        //  }

// using two pointer concept
// reverse
// int i=1,j=5; // for reversing the a part of array 


int i=0,j=n-1;  // for reversing the full array 
while(i<=j){
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // i++;
    // j--;

   swap(arr,i,j);
   i++;
   j--;
}
        
for(int ele:arr){
    System.out.print(ele+" ");
}
System.out.println();
    }
// Developing a function for swapping concept
    public static void swap(int [] arr,int i,int j)
    {
     int temp = arr[i];
     arr[i] = arr[j];
     arr[j] = temp;  
    }
}

    
