import java.util.*;
public class pattern1{
    public static void main(String args[])
    {   // normal pattern ****
        //                ****
        //                ****
        //                ****
        //                ****
        int n=5;
        int m= 4;
        
        //row loop
        for(int i=1; i<n;i++){
        //coloum .loop
        for(int j=1; j<m;j++){
            System.out.print("*");
        }
        System.out.println("");

        }

        //rectangle or holo pattern
        //                ****
        //                *  *
        //                *  *
        //                *  *
        //                ****
       
        for(int i=0; i<n;i++){
         for(int j=0; j<m;j++){
            if(i==n-1||j==m-1 || i== 0|| j==0){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }

         }
         System.out.println("");

        
       }
    }
}