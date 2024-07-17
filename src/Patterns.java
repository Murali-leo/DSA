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
        pattern10(4);
        
    }
}
