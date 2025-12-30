public class Py {
    public static void main (String[] args){
        int n = 5;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
             System.out.println();
        }

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(num+"");
        //         num++;
        //     }
        //     System.out.println();
        // }
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // Outer loop for each row (i)
        // for(int i=1; i<=n; i++){
            
        //     // 1. Inner loop for printing spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" "); // Note: print, not println
        //     }
            
        //     // 2. Inner loop for printing stars
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*"); // CHANGED: print, not println
        //     }

        //     // 3. Move to the next line after the row is done
        //     System.out.println(); // ADDED
        // }
    }
}