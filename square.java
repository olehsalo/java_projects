public class SquareRoot {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5 ;
        double c = -0.5;
        double D = b*b-4*a*c;
        if(D>=0&&a != 0){
            System.out.println("x1="+(-b + Math.sqrt(D))/(2*a));
            System.out.println("x2="+(-b - Math.sqrt(D))/(2*a));      
        }
        else if(a==0&&b!=0){
            System.out.println("x1="+c/b);
            System.out.println("x2="+c/b);
        }
        else if(a==0&&b==0){
            System.out.println("x1=");
            System.out.println("x2=");
        }        
        else{
            System.out.println("x1=");
            System.out.println("x2=");
        }
    }
}
