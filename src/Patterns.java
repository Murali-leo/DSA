public class Patterns {

     public static void pattern1(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }

     public static void pattern2(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }

     public static void pattern3(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
     }

     public static void pattern4(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
     }

     public static void pattern5(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
     }

     public static void pattern6(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }

     public static void pattern7(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }

     public static void pattern8(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
     }

     public static void pattern9(int n){
        int star = 1;
        for(int i = 0; i < n; i++){
            //space
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 0; j < star; j++){
                System.out.print("*");
            }
            //space
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
            star += 2;
        }
     }

     public static void pattern10(int n){
        int star = 2*n-1;
        for(int i = 0; i < n; i++){
            //space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 0; j < star; j++){
                System.out.print("*");
            }
            //space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
            star -= 2;
        }
     }

     public static void pattern11(int n){
        for(int i = 0; i < n; i++){
            //space
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 0; j < 2*i +1; j++){
                System.out.print("*");
            }
            //space
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++){
            //space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 0; j < 2*(n-i)-1 ; j++){
                System.out.print("*");
            }
            //space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
     }

     public static void pattern12(int n){
        int star =0;
        for(int i = 1; i <= 2*n-1; i++){
            star = (i <= n) ? i : (2*n-i);
            for(int j = 1; j <= star; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }

     public static void pattern13(int n){
        int val = 1;
        for(int i = 1; i <= n; i++){
            val = (i%2 != 0) ? 1 : 0;
            for(int j = 1; j <= i; j++){
                System.out.print(val);
                val = 1 - val;
            }
            System.out.println();
        }
     }

     public static void pattern14(int n){
        int space = 2*n-2;
        for(int i = 1; i <= n; i++){
            //number
            for(int j=1; j <= i; j++){
                System.out.print(j);
            }
            //space
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            //number
            for(int j=i; j >= 1; j--){
                System.out.print(j);
            }
            space -= 2;
            System.out.println();
        }
     }

     public static void pattern15(int n){
        int num = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
     }

     public static void pattern16(int n){
        for(int i = 1; i <= n; i++){
            for(char ch = 'A'; ch < 'A' + i; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
     }

     public static void pattern17(int n){
        for(int i = 1; i <= n; i++){
            for(char ch = 'A'; ch < 'A' + n-i+1; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
     }

     public static void pattern18(int n){
        char ch = 'A';
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
     }

     public static void pattern19(int n){
        for(int i = 1; i <= n; i++){
            char ch = 'A';
            //space
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //alphabet
            for(int j = 1; j <= 2*i-1; j++){
                if(j < i){
                    System.out.print(ch);
                    ch++;
                }else{
                    System.out.print(ch);
                    ch--;
                }
            }
            //space
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
     }

     public static void pattern20(int n){
        for(int i = 1; i <= n; i++){
            for(char j = (char)(int)('A'+n-i); j <= 'A' + n-1; j++){
                System.out.print(j);
            }

            System.out.println();
        }
     }

     public static void pattern21(int n){

        for(int i = 0; i < n; i++){
            //star
            for(int j = 0; j < n-i; j++){
                System.out.print("*");
            }
            //space
            for(int j = 0; j < 2*i; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 0; j < n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++){
            //star
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            //space
            for(int j = 0; j < 2*n-2*i-2; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

     }

     public static void pattern22(int n){
        int space = 2*n-2;
        for(int i = 1; i <= 2*n -1; i++){
            int star = (i <= n) ? i : (2*n - i);
            //star
            for(int j = 1; j <= star; j++){
                System.out.print("*");
            }
            //space
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 1; j <= star; j++){
                System.out.print("*");
            }
            if(i < n){
                space -= 2;
            }else{
                space += 2;
            }
            System.out.println();
        }
     }

     public static void pattern23(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n ; j++){
                if(i==0 || i == n-1 || j == 0 || j == n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
     }

     public static void pattern24(int n){
        for(int i=0;i<2*n-1;i++){
         
            // inner loop for no. of columns.
            for(int j=0;j<2*n-1;j++){
                
                // Initialising the top, down, left and right indices of a cell.
                int top = i;
                int bottom = j;
                int right = (2*n - 2) - j;
                int left = (2*n - 2) - i;
                
                // Min of 4 directions and then we subtract from n
                // because previously we would get a pattern whose border
                // has 0's, but we want with border N's and then decrease inside.
                System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
            }
            
            // As soon as the numbers for each iteration are printed, we move to the
            // next row and give a line break otherwise all numbers
            // would get printed in 1 line.
            System.out.println();
        }
     }
     public static void main(String[] args) {
        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        // pattern4(5);
        // pattern5(5);
        // pattern6(4);
        // pattern7(4);
        // pattern8(7);
        // pattern9(4);
        // pattern10(4);
        // pattern11(5);
        // pattern12(5);
        // pattern13(4);
        // pattern14(3);
        // pattern15(5);
        // pattern16(4);
        // pattern17(5);
        // pattern18(5);
        // pattern19(5);
        // pattern20(4);
        // pattern21(6);
        // pattern22(4);
        // pattern23(4);
        pattern24(4);
        
    }
}
