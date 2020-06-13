public class LoopsApp {
    public static void main(String [] args) {
       int i = 1;
       while (i<=0) {
           System.out.println(i + ". BEING RIGHT SUCKS");
           i++;
       }
    //while isn't executing the first line.
       int j = 1;
       do {
           System.out.println(j + ". BEING RIGHT SUCKS");
           j++;
       } while (j<=0);
     //do-while is executing the code at least once, even if the condition is false.

        for (int k = 1; k<=5; k++) {
            if (k == 3){
                break;
            }
            System.out.println(k + ". BEING RIGHT SUCKS");
        }
     //k is a variable only accessible in the loop!
        for (int k = 1; k<=5; k++) {
            for (int l = 1; l<=2; l++) {
                System.out.println("k = " + k + "l = " + l + ". BEING RIGHT SUCKS");
            }

        }









    }
}
