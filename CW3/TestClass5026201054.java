public class TestClass5026201054{

    public static void main(String args[]) {

        ComputeMethods5026201054 p =  new ComputeMethods5026201054();
        System.out.printf("Temperature :%.2f\n ",p.fToC(97));
        System.out.printf("Hypotenuse : %.2f\n",p.hypotenuse(3, 5));
        int r1=p.roll();
        int r2=p.roll();
        System.out.println("Sum of rolls : "+(r1+r2));       

       

    }

}