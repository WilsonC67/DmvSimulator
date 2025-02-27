import java.util.concurrent.*;

public class DmvSimulator {
    public static void main(String[] args) {
        
       int number =(int) (Math.random() * 200)+ 1;
       int trollNumber = number + 1;


       System.out.println(String.format("Welcome to hell! Your number is %d. Please wait until your number is called.", number));
       
       System.out.println(number);
        try {
            while (number != trollNumber) {
                System.out.println(trollNumber);
    
                trollNumber++;
    
                Thread.sleep(10);
    
                if (trollNumber > 200) {
                    trollNumber = 1;
                }
           }
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
      
    
       System.out.println("You don't have the required paperwork. You're supposed to have today's WORDLE, a google-generated password, and a completed 100x100 Sudoku. Get out.");

    }
}


