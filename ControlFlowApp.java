public class ControlFlowApp {
    public static void main(String [] args) {
        boolean isDamaged = false;
        String color = "purple";
        char energyEfficiencyCategory = 'Z';

        if (isDamaged) {
            System.out.println("Damaged car");
        } else{
            System.out.println("Accident free car");
        }

        if (color.equals("red")) {
            System.out.println("This car is red");
        }else if (color.equals("green")) {
            System.out.println("This car is green");
        }else if (color.equals("blue")) {
            System.out.println("This car is red");
        }else {
            System.out.println("This car is " + color );
        }

        switch(energyEfficiencyCategory) {
            case 'A':
            case 'B':
                System.out.println("Low energy consumption");
            break;
            case 'G':
                System.out.println("Very high energy consumption");
            break;
            default:
                System.out.println("Not defined category");
        }

        { int numberfOwners = 5;
            {
                numberfOwners++;
            }
            System.out.println("Number of owners = " + numberfOwners);
        }





    }
}
