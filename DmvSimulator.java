public class DmvSimulator {
    public static void main(String[] args) {
        
       int number =(int) (Math.random() * 100)+ 1;
       int trollNumber = number + 1;
       System.out.println(String.format("Welcome to hell! Your number is %d. Please wait until your number is called.", number));
       
       System.out.println(number);

       while (number != trollNumber) {
            System.out.println(trollNumber);

            trollNumber++;

            if (trollNumber > 100) {
                trollNumber = 1;
            }
       }
    
       System.out.println("You don't have the required paperwork. You're supposed to have today's WORDLE, a google-generated password, and a completed 100x100 Sudoku. Get out.");

    }
}


