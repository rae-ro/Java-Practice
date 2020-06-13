public class ArraysApp {
    public static void main(String[] args){
        int[] lotteryNumbers = new int[5];
        lotteryNumbers[0] = 17;
        lotteryNumbers[1] = 25;
        lotteryNumbers[2] = 54;
        lotteryNumbers[3] = 81;
        lotteryNumbers[4] = 76;
        for(int lotteryNumber:lotteryNumbers){
            System.out.println(lotteryNumber);
        }

        int[][] monthlyLotteryNumbers = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}

        };

        for(int i = 0; i<monthlyLotteryNumbers.length; i++){
            for (int j = 0; j<monthlyLotteryNumbers[i].length; j++){
                System.out.print(monthlyLotteryNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
