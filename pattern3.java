public class pattern3 {
    
        public static void main(String[] args) {
            int rows = 5; 
    
            for (int i = 0; i < rows; i++) {
                // Print leading spaces
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                // Print stars
                for (int k = i; k < rows; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        
    
    
       
    
            for (int i = 1; i <= rows; i++) {
                // Print leading spaces
                for (int j = i; j < rows; j++) {
                    System.out.print("  ");
                }
                // Print stars
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                // Move to the next line
                System.out.println();
        }
    }
    }
    
    
    

