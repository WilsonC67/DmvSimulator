import java.util.concurrent.*;

public class DmvSimulator {
    public static void main(String[] args) {
        
       int number = (int) (Math.random() * 200)+ 1;
       int trollNumber = number + 1;

       int miracle = (int) (Math.random() * 100) + 1;
       int hell = 1;

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
      
        if (miracle == hell) {
            System.out.println("Wait what? You have all of the required paperwork, but that's impossible! You won't be as lucky next time. Get out.");
        } else {
            System.out.println("You don't have the required paperwork. You're supposed to have today's WORDLE, a google-generated password, and a completed 100x100 Sudoku. You are clearly a failure of a human and do not deserve any license whatsoever. Get out.");
        } 
    }
}


