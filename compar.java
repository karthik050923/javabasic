public class compar {
 public static void main(String[] args) {
    int a = 10;
    int b = 20;
    System.out.println(a == b);
    System.out.println(a != b);
    System.out.println(a > b);
    System.out.println(a < b);
    System.out.println(a >= b);
    System.out.println(a <= b);

    //logical operator

    boolean c = true;
    boolean d = false;
    System.out.println(c && d); //AND means True-true = true, all are false
    System.out.println(c || d); //OR means false-false = false,All are true
    System.out.println(! d); //Not true means false - if false its true

     // Bitwise operator
     int e = 3;//0011
    int f = 4; //0010
    System.out.println(e & f); // true + true = true,1+1=1,all are false 
    System.out.println(e | f); // false +false = false , 0+0=0,all are true 
    System.out.println(e ^ f); //both are same value it will be false 1+1=0,0+0=0,
    System.out.println(~ f);   //1 became 0,0 became 1 , 13
    System.out.println(e << f); 
    System.out.println(e >> f);
    System.out.println(e >>> f);
 }

}
