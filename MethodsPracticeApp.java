public class MethodsPracticeApp {
    public static void main(String[] args){
        printOutEnergyEfficiencyCategory('D');
        System.out.println("");
        carDescription("Citroen C3",2002, "excellent");


    }

    static void printOutEnergyEfficiencyCategory(char energyEfficiencyCategory){
        System.out.println("Energy efficiency category: " + energyEfficiencyCategory);

        switch(energyEfficiencyCategory) {
            case 'A':
                System.out.println("Energy consumption: very low");
                break;
            case 'B':
                System.out.println("Energy consumption: low");
                break;
            case 'C':
                System.out.println("Energy consumption: normal");
                break;
            case 'D':
                System.out.println("Energy consumption: above normal");
                break;
            case 'E':
                System.out.println("Energy consumption: high");
                break;
            case 'F':
                System.out.println("Energy consumption: very high");
                break;
            case 'G':
                System.out.println("Energy consumption: extremely high");
                break;
        }
    }

    static void carDescription(String model, int productionYear, String condition){
        System.out.println("Car model: " + model + "\n" + "Production Year: " + productionYear + "\n" + "Condition: " + condition);
    }
}
