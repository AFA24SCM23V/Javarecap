public class Arraysfuncs {

    // Method to insert an element at the end
    public static int insertatend(int n, int[] arr, int ele, int capacity) {
        if (n >= capacity) {
            System.out.println("Array is full, can't insert more elements");
        } else {
            arr[n] = ele;
            n = n + 1; // Increment the number of elements after insertion
        }
        return n; // Return the updated size
    }
//    public static int insertatbegin(int n, int[] arr, int ele, int capacity){
//     if(n==capacity){
//         System.out.println("Array is full");
//     }
//     for(int i=n;i>0;i--){
//         arr[i]= arr[i-1];
//     }
//     arr[0]=ele;
//     n=n+1;
//     return n;
//     }
public static int insertatpos(int pos, int n, int ele, int[] arr, int capacity) {
    if (n == capacity) {
        System.out.println("Oops! The array is full");
        return n; // Return early if the array is full
    }

    if (pos > n || pos < 0) {
        System.out.println("Invalid position");
        return n; // Return if position is invalid
    }

    // Shift elements to the right to make space at the desired position
    for (int i = n; i > pos; i--) {
        arr[i] = arr[i - 1];
    }

    // Insert the element at the desired position
    arr[pos] = ele;

    // Increment the number of elements after the insertion
    n = n + 1;

    return n;
}

    public static void main(String[] args) {
        int eletoinsert = 12; // Element to insert
        int n = 4; // Current number of elements in the array
        int capacity = 20; // Capacity of the array
        int arr[] = new int[capacity]; // Initialize array with larger capacity
        
        // Initialize first 4 elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        System.out.println("The array elements before insertion are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Insert the new element and update n
        // n = insertatend(n, arr, eletoinsert, capacity);

        // System.out.println("The array elements after insertion are:");
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }
int pos = 3;
        //insert at beginning
        // n = insertatbegin(n, arr, eletoinsert, capacity);
        // for (int i = 0; i < n; i++) {
        //         System.out.print(arr[i] + " ");
        //      }
        n= insertatpos(pos, n, eletoinsert, arr, capacity);
        for (int i = 0; i < n; i++) {
                     System.out.print(arr[i] + " ");
              }
             
    }

}
