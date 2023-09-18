import java.util.Scanner;
public class Animalslengs {
    public static void main(String[] args){

    
    Scanner sc = new Scanner(System.in);
        System.out.println("Hánycsirke van? ");
        int csirke = sc.nextInt();
        
        System.out.print("Hány diszno van?: ");
        int diszno = sc.nextInt();
        int lab=(2*csirke)+(4*diszno);
        System.out.println(lab);
    }
    
}