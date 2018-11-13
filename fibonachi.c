public class MyClass {
    public static void main(String[] args) {
        int m=43;
        System.out.println(fibonachi(m));
    }
    static long fibonachi(int m){
       if(m==0){
           return 1;
       }
       if(m==1){
           return 1;
       }
       else{
           return fibonachi(m-1)+fibonachi(m-2);
       }
    }
}
