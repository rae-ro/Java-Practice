public class WhoWantsToBeAMillionaireApp<correctAnswer> {
    public static void main(String [] args) {
        char correctAnswer = 'C';
        char possibleAnswer = 'A';

        System.out.println("Who's named as the inventor of the light bulb?\n" +
                "A: Nikola Tesla\n" +
                "B: Marie Curie\n" +
                "C: Thomas Edison\n" +
                "D: Robert Oppenheimer\n");

        switch (possibleAnswer) {
            case 'C':
                System.out.println("You've got it! The right answer is " + correctAnswer);
                break;
            default:
                System.out.println("Sorry, your answer, " + possibleAnswer + ", is wrong. The right answer was " + correctAnswer + ".");
                break;
        }
    }

}
