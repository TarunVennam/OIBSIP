
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int num;
    public int inputNumber;
    public int noofGuesses = 0;

    public int getNoofGuesses() {

        return noofGuesses;
    }

    public void setNoofGuesses(int noofGuesses) {

        this.noofGuesses = noofGuesses;
    }

     Game(){
        Random rand = new Random();
        this.number= rand.nextInt(100);
    }
    int takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        //gggg
         return inputNumber;

    }
    boolean isCorrectNumber(){
        noofGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right.it was %d\n You guessed in %d attempt", number ,noofGuesses);
            return true;
        }
        else if (inputNumber<number) {
            System.out.println("Too low...");
        }
        else if (inputNumber>number) {
            System.out.println("Too High...");
        }


        return false;}
}



public class Number_Gussing_game {
    public static void main(String[] args) {
        /*
        Create a class Game , which allows a user to play "Guess the Number"
        game once .
        1. Constructor to generate the random number
        2. takeUserInput() to take a user input of number
        3. isCorrectNumber() to detect whether the number entered by the user is true
        4. getter and setter for noOfGuesses
         */
    Game g =new Game();
    boolean b = false;
    while (!b){
        g.takeUserInput();
        b = g.isCorrectNumber();
    }

    }
}
