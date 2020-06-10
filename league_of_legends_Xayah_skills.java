public class league_of_legends_Xayah_skills {
    public static void main(String [] args) {
        //champion information
        boolean usesMana = true;
        boolean isRanged = true;
        double champWinRate = 48.43;
        double champPickRate = 4.4;
        double champBanRate = 0.3;
        int champPlayedMatches = 81807;

        //skill information
        char doubleDaggers = 'Q';
        byte doubleDaggersCooldownAtFirstLevel = 10;
        short doubleDaggersRange = 400;
        char deadlyPlumage = 'W';
        byte deadlyPlumageCooldownAtFirstLevel = 20;
        short deadlyPlumageRange = 1000;
        char bladecaller = 'E';
        byte bladecallerCooldownAtFirstLevel = 12;
        short bladecallerRange = 2000;
        char featherstormUltimate = 'R';
        short featherstormCooldownAtFirstLevel = 160;
        short featherstormRange = 450;

        //runes information
        double runesWinRate = 48.92;
        short runesPlayedMatches = 23091;

        //build core items information
        double coreBuildWinRate = 56.48;
        short coreBuildPlayedMatches = 18340;

        System.out.println("\n" + "Xayah: champion stats, skills and build");
        System.out.println("\n\n" + "CHAMPION STATS");
        System.out.println("Does she use mana? " + usesMana);
        System.out.println("Is she a ranged champion? " + isRanged);
        System.out.println("Win Rate: " + champWinRate + "%");
        System.out.println("Pick Rate: " + champPickRate + "%");
        System.out.println("Ban Rate: " + champBanRate + "%");
        System.out.println("Number of matches played: " + champPlayedMatches);
        System.out.println("\n\n" + "SKILLS");
        System.out.println("\n"+ "Name: Clean Cuts (Passive)\n" + "Key: none");
        System.out.println("\n" + "Name: Double Daggers\n" + "Key: " + doubleDaggers);
        System.out.println("Cooldown: " + doubleDaggersCooldownAtFirstLevel + " seconds");
        System.out.println("Range: " + doubleDaggersRange);
        System.out.println("\n" + "Name: Deadly Plumage\n" + "Key: " + deadlyPlumage);
        System.out.println("Cooldown: " + deadlyPlumageCooldownAtFirstLevel + " seconds");
        System.out.println("Range: " + deadlyPlumageRange);
        System.out.println("\n" + "Name: Bladecaller\n" + "Key: " + bladecaller);
        System.out.println("Cooldown: " + bladecallerCooldownAtFirstLevel + " seconds");
        System.out.println("Range: " + bladecallerRange);
        System.out.println("\n" + "Name: Featherstorm (Ultimate)\n" + "Key: " + featherstormUltimate);
        System.out.println("Cooldown: " + featherstormCooldownAtFirstLevel + " seconds");
        System.out.println("Range: " + featherstormRange);
        System.out.println("\n\n" + "RUNES" + "\n" + "Lethal Tempo (Precision) --> Sorcery");
        System.out.println("Win Rate/Matches: " + runesWinRate + "%/" + runesPlayedMatches);
        System.out.println("\n\n" + "CORE BUILD" + "\n" + "Essence Reaver --> Berserker's Greaves --> Infinity Edge");
        System.out.println("Win Rate/Matches: " + coreBuildWinRate + "%/" + coreBuildPlayedMatches);
    }
    }
    //Programmer: Chiara Anna Montecuollo
