public class MyFirstJavaApp {

    public static void main(String [] args) {
        byte numberOfSeats = 5;
        byte numberOfDoors = 3;
        byte numberOfVehicleOwners = 1;
        byte emissionSticker = 4;

        short powerInKW = 362;
        short horsePower = 492;
        short co2Emission = 333;
        short cubicCapacity = 6417;

        int price = 29999;
        int mileage = 14999;

        long registrationNumber = 162_653_621_531_653_999L;

        float fuelConsumptionCombined = 15.5F;
        float fuelConsumptionUrban = 21.4F;
        float fuelConsumptionExtraUrban = 13.6F;

        double fuelConsumptionPreciseAverage = 15.132423542352345E-1;

        boolean isDamaged = true;

        char energyEfficiencyCategory = 'G' ;

        System.out.println("2018 Dodge Challenger SRT 392");
        System.out.println("Price: " + price + " euros");
        System.out.println("Mileage: " + mileage + " km");
        System.out.println("The car is damaged: " + isDamaged);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Cubic capacity: " + cubicCapacity);
        System.out.println("Power: " + powerInKW + " kW");
        System.out.println("Horse power: " + horsePower + " hp");
        System.out.println("CO2 Emission: " + co2Emission + " g/km");
        System.out.println("Emission Sticker: " + emissionSticker + " (Energy efficiency:" + energyEfficiencyCategory + ")");
        System.out.println("Combined Fuel Consumption: " + fuelConsumptionCombined + " l/100km");
        System.out.println("Urban Fuel Consumption: " + fuelConsumptionUrban + " l/100km");
        System.out.println("Extra Urban Fuel Consumption: " + fuelConsumptionExtraUrban + " l/100km");
        System.out.println("Precise Combined Fuel Consumption: " + fuelConsumptionPreciseAverage + " l/100km");
        System.out.println("Number of previous owners: " + numberOfVehicleOwners);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Number of seats: " + numberOfSeats);

        System.out.println("Conversion");
        short newNumberOfSeats = numberOfSeats;
        System.out.println("New value of number of seats: " + newNumberOfSeats);
        int newMileage = mileage;
        System.out.println("New value of mileage: " + newMileage);
        byte newPower = (byte) powerInKW;
        System.out.println("New value of power: " + newPower);


    }
}
