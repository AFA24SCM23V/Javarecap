public class Patterns {

// xxxxx
// x   x
// x   x
// x   x
// xxxxx
    public static void squarehallow(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            if(i==0||i==n-1||j==0||j==n-1){
                System.out.print("x");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }

// 1
// 12
// 123
// 1234
// 12345
    public static void triangle(int n){
        for(int i=1;i<=n+1;i++){
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 

    public static void triangle2(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print the numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            // Move to the next line
            System.out.println();
        }
    }


// 12345
// 1234
// 123
// 12
// 1
public static void reversetriangle(int n) {
    int i=0;
    while(i<n){
        for(int j=1;j<=n-i;j++){
            System.out.print(j);

        }
        System.out.println();
        i++;
    }
}
public static void numchangingpyramid(int n){
    int num = 1; // Initialize the number to be printed
    int i = 1;
    while (i <= n) { // Loop from 1 to n
        for (int j = 1; j <= i; j++) { // Print numbers incrementally
            System.out.print(num + " "); // Print the current number followed by a space
            num++; // Increment the number
        }
        System.out.println(); // Move to the next line after each row
        i++;
    }
}
public static void zeroonepattern(int n){
int i, j;
        //outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            //inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                // if the sum of (i+j) is even then print 1
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                // otherwise print 0
                else {
                    System.out.print(0 + " ");
                }
            }

            //printing new line for each row
            System.out.println();
        }
    }


    public static void main(String[] args) {
      //  squarehallow(5);
     // triangle(5);
    // triangle2(5);
    //reversetriangle(5);
    //numchangingpyramid(5);
    zeroonepattern(5);
    }
}

