public class ArrayJava {
   public static void main(String[] args){
      
      // Declare an array 
      int intArray[];
	  
      // Initialize an array of 8 int
      // set aside memory of 8 int 
      intArray = new int[8];

      System.out.println("Array before adding data.");

      // Display elements of an array.
      display(intArray);     
         
      // Operation : Insertion 
      // Add elements in the array 
      for(int i = 0; i< intArray.length; i++)
      {
         // place value of i at index i. 
         System.out.println("Adding "+i+" at index "+i);
         intArray[i] = i;
      }         
      System.out.println();

      System.out.println("Array after adding data.");
      display(intArray);


///////// Bubble Sort Implementation

      public class BubbleSortExample {
         public static void main(String[] args) {
             int[] numbers = {5, 3, 8, 1, 2};
     
             // Bubble Sort algorithm
             int n = numbers.length;
             for (int i = 0; i < n - 1; i++) {
                 for (int j = 0; j < n - i - 1; j++) {
                     // Swap if the element found is greater than the next element
                     if (numbers[j] > numbers[j + 1]) {
                         // Swap numbers[j] and numbers[j + 1]
                         int temp = numbers[j];
                         numbers[j] = numbers[j + 1];
                         numbers[j + 1] = temp;
                     }
                 }
             }
     
             // Printing the sorted array
             System.out.print("Sorted array: ");
             for (int number : numbers) {
                 System.out.print(number + " ");
             }
         }
     }


      


////////// Removing Duplicates from an Array

public class RemoveDuplicatesExample {
   public static void main(String[] args) {
       int[] numbers = {5, 3, 8, 1, 2, 3, 5, 1};
       
       // Determine the length of the array
       int n = numbers.length;

       // Create a new array to hold unique elements
       int[] temp = new int[n];
       int uniqueCount = 0;

       // Loop through the original array
       for (int i = 0; i < n; i++) {
           boolean isDuplicate = false;

           // Check if the current element is already in the temp array
           for (int j = 0; j < uniqueCount; j++) {
               // Use a conditional statement to check for duplicates
               if (numbers[i] == temp[j]) {
                   isDuplicate = true; // Mark as duplicate
                   break; // Exit the inner loop
               }
           }

           // If it's not a duplicate, add it to the temp array
           if (!isDuplicate) {
               temp[uniqueCount] = numbers[i];
               uniqueCount++;
           }
       }

       // Create a final array of the correct size
       int[] uniqueNumbers = new int[uniqueCount];
       for (int i = 0; i < uniqueCount; i++) {
           uniqueNumbers[i] = temp[i];
       }

       // Printing the array with duplicates removed
       System.out.print("Array after removing duplicates: ");
       for (int number : uniqueNumbers) {
           System.out.print(number + " ");
       }
   }
}

///// Combining Arrays together


class CombineArrays {
   public static int[] combineArrays(int[] a1, int[] a2) {
       // Calculate the total length of the combined array
       int total_length = a1.length + a2.length;
       
       // Create a new array to store the combined elements
       int[] combine = new int[total_length];
       
       // One loop to combine both arrays
       for (int i = 0; i < total_length; i++) {
           if (i < a1.length) {
               combine[i] = a1[i]; // Copy from a1
           } else {
               combine[i] = a2[i - a1.length]; // Copy from a2 (offset by the length of a1)
           }
       }
       
       // Return the combined array
       return combine;
   }
}


/// 
