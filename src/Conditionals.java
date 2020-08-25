public class Conditionals {
    public static void main(String[] args) {
        // if else
        boolean isRaining = false;
        boolean isSnowing = true;

        //I want to bring an umbrella. ONLY IF  it is raining.
        //SYNTAX: if ([condition]) {}
        // to compare primitive data types, you use ==

        if (isRaining == true) {
            // if statement block of code

            System.out.println("You should bring an umbrella");

        } else if (isSnowing == true) {
            System.out.println("Bring a jacket");

        } else {
            System.out.println("It is neither raining or snowing");
        }

        //you need 20 points to pass, 30 to get a sticker
        int myScore = 25;

        if (myScore > 20) {
            System.out.println("Congrats, you passed!");

        } else if (myScore < 20) {
            System.out.println("Sorry, you failed!");

        } if (!(myScore > 20 && myScore >= 30)) { //&& means all condition have to be true AND
            System.out.println("You passed with a sticker!");

        } else {
            System.out.println("Your score is invalid!");
        }
        if (myScore == 100) {
            System.out.println("Your score is not 100!");

        } else if ( !(myScore >= 100)){
            System.out.println("Your score is less than or equal 100!");
        }
        String myName = "Lynn";
        if ((myName.equalsIgnoreCase("Lynn"))) {
            System.out.println("Your name contains Lynn");
        }
    }
}
