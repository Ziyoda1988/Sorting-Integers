class Main {
  public static void main(String[] args) {
    //Tests

     sort3Ints(3,2,1); //->  1,2,3
     sort3Ints(3,3,1); //->  1,3,3
     sort3Ints(-2,-10,-1); //->  -10,-2,-1
     sort3Ints(99,78,22); //->  22,78,99
     sort3Ints(0,-2,1); //->  -2,0,1
     sort3Ints(7,0,0); //->  0,0,7
     sort3Ints(5,5,5); //->  5,5,5

  }
 public static void sort3Ints (int a, int b, int c){
        if (a>=b && b>=c ) {
            System.out.println(c + "," + b + "," + a);
        } else if ( a>=b && b>=c) {
            System.out.println(c + "," + b + "," + c);
        } else if ( a>=b && b<=c) {
            System.out.println(b + "," + a + "," + c);
        } else if ( a>=b && b<=c) {
            System.out.println(b + "," + a + "," + c);
        } else if ( a==b && b==c) {
            System.out.println(a + "," + b + "," + c);
        

        }


    }

    }