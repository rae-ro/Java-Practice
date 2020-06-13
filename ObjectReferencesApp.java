public class ObjectReferencesApp {

    public static void main(String [] args) {
        Byte numberOfSeats = 5;
        Short horsePower = 392;
        Integer price = 14999;
        Long registrationNumber = 176176412361L;

        Float fuelConsumptionUrban = 15.5F;
        Double fuelConsumptionPreciseAverage = 15.1212235234;

        Boolean isDamaged = true;
        Character energyEfficiencyCategory = 'G';

        String carType = "DodgeChallenger SRT 392";
        String carTypeWithNewKeyword = new String("DodgeChallenger SRT 392");

System.out.println("Number of seats: " + numberOfSeats);
System.out.println("Horse power: " + horsePower + " hP");
System.out.println("Price: " + price.floatValue() + " euros");
System.out.println("Registration number: " + registrationNumber);
System.out.println("Urban Fuel Consumption: " + fuelConsumptionUrban.intValue() + " l/100km");
System.out.println("Precise Average Fuel Consumption: " + fuelConsumptionPreciseAverage + " l/100km");
System.out.println("The car is damaged: " + isDamaged);
System.out.println("Energy efficiency category: " + energyEfficiencyCategory);
System.out.println("Car model: " + carType);
System.out.println("Car model with upper case: " + carType.toUpperCase());
System.out.println("Car model with lower case: " + carType.toLowerCase());
System.out.println("Car model: " + carTypeWithNewKeyword);
System.out.println("carType variable equals to carTypeWithNewKeyword: " + carTypeWithNewKeyword.equals(carType));


    }
}
