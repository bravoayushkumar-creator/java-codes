import java.util.Scanner; // Import the Scanner class

public class ArrayOperations {

    public static void main(String[] args) { 
        int[][] arr1 = {{1, 2}, {3, 4}}; 

        
        int[][] arr2 = new int[2][2]; 

        
        Scanner s = new Scanner(System.in); 

        System.out.println("Enter elements for arr2 (2x2 matrix):");

        for (int i = 0; i < 2; i++) { /
            for (int j = 0; j < 2; j++) {
                arr2[i][j] = s.nextInt(); 
            }
        }

        
        s.close(); 

        System.out.println("\nElements of arr1:");

        // Loop to print elements of arr1
        for (int i = 0; i < arr1.length; i++) { // Corrected loop condition
            for (int j = 0; j < arr1[i].length; j++) { // Corrected loop condition
                System.out.print(arr1[i][j] + " "); // Changed to print without new line
            }
            System.out.println(); // Print new line after each row
        }

        System.out.println("\nElements of arr2:");

        // Loop to print elements of arr2
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}



public String tostring (){
		return "Employee [id="id+"]";
		
		public class encapsulation  {
			public static void main (strings [])args {
				Test t1=new Test ();
				system.out.println("add ='+1T1.add()");
				
			}
		}
		}
		class test {
			
		}