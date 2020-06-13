import java.sql.SQLOutput;

public class OperatorsApp {
    public static void main(String [] args) {
        String carModel = "Dodge Challenger SRT 392";
        int price = 14999;
        int moneyInTheBank = 1000000;
        boolean isDamaged = true;

        System.out.println("Price: " + price + " euros");
        int priceIncreased = price + 100;
        System.out.println("Increased price: " + priceIncreased + " euros");
        int priceDecreased = price - 100;
        System.out.println("Decreased price: " + priceDecreased + " euros");
        int priceTwoCars = price * 2;
        System.out.println("Price of two cars: " + priceTwoCars + " euros");
        int dodgesYouCanBuy = moneyInTheBank / price;
        System.out.println("Dodges you can buy for your money: " + dodgesYouCanBuy);
        int moneyRemain = moneyInTheBank % price;
        System.out.println("Money you will have after buying " + dodgesYouCanBuy + " Dodge Challengers: " + moneyRemain + " euros");

        int priceNegative = -14999;
        int priceNegativeWithPlusSign = +priceNegative;
        System.out.println("Negative price with plus sign: " + priceNegativeWithPlusSign + " euros");
        int priceNegativeWithMinusSign = -priceNegative;
        System.out.println("Negative price with minus sign: " + priceNegativeWithMinusSign + " euros");
        int priceOneEuroIncrease = ++price;
        System.out.println("Price increased by one euro: " + priceOneEuroIncrease + " euros");
        int priceOneEuroDecrease = --price;
        System.out.println("Price decreased by one euro: " + priceOneEuroDecrease + " euros");
        System.out.println("The car is damaged: " + !isDamaged);
        System.out.println();

        System.out.println("Car's price equals to the money in the bank: " + (price == moneyInTheBank));
        System.out.println("Car's price not equals to the money in the bank: " + (price != moneyInTheBank));
        System.out.println("Car's price is greater than the money in the bank: " + (price > moneyInTheBank));
        System.out.println("Car's price is lesser than the money in the bank: " + (price < moneyInTheBank));
        System.out.println("Car's price is greater than or equals the money in the bank: " + (price >= moneyInTheBank));
        System.out.println("Car's price is lesser than or equals the money in the bank: " + (price <= moneyInTheBank));
        System.out.println("Car's model variable is a string: " + (carModel instanceof String));
        System.out.println();

        String damagedText = !isDamaged ? "The car is damaged":"The car isn't damaged";
        System.out.println(damagedText);
        System.out.println();

        String worthSeeingMessage = !isDamaged || price<20000 ? "It's worth seeing the car":"It isn't worth seeing the car";
        System.out.println(worthSeeingMessage);
        String worthRepairingMessage = isDamaged && price<15000 ? "It's worth repairing the car":"It isn't worth repairing the car";
        System.out.println(worthRepairingMessage);
        System.out.println();

        price+= 1000;
        System.out.println("Increased price = " + price + " euros" );
        price-= 1000;
        System.out.println("Decreased price = " + price + " euros" );
        price*= 2;
        System.out.println("Doubled price = " + price  + " euros");
        price/= 2;
        System.out.println("Half price = " + price + " euros" );
        price%= 10000;
        System.out.println("Remained price = " + price + " euros" );






    }


}
