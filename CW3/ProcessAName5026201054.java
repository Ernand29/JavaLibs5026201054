import java.util.Scanner;

public class ProcessAName5026201054{

       

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name=console.nextLine();
        String temp[]=name.split(" ");
        System.out.println("Your name is: "+temp[1]+","+temp[0].charAt(0));
}
}