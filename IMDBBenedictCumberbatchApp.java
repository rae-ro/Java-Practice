public class IMDBBenedictCumberbatchApp {
    public static void main(String[] args) {

        //Actor information
        String actorName = "Benedict Cumberbatch";
        int yearOfBirth = 1976;
        int age = 2020 - yearOfBirth;

        //Movie titles array
        String[] movieOrTVSeriesTitles = new String[]{"The Imitation Game",
                "Star Trek - Into Darkness", "Doctor Strange", "Sherlock",
                "Amleto", "The Current War"};

        //Movie ratings array
        double[] movieOrTVSeriesRatings = new double[]{8.0, 7.7, 7.5, 9.1, 8.5, 6.5};

        System.out.println();
        System.out.println("Actor name: " + actorName + "\n" + "Year of birth: " + yearOfBirth + "\n" + "Age: " + age + "\n");

        //for loop that prints the movie title and its rating sentence
        for (int i = 0; i<movieOrTVSeriesTitles.length; i++){
            System.out.println("Movie title: " + movieOrTVSeriesTitles[i]);
                movieRatingsSentences(movieOrTVSeriesRatings[i]);
        }
    }

    //function that prints a sentence corresponding to the rating
    static void movieRatingsSentences(double movieOrTVSeriesRatings) {
        if (movieOrTVSeriesRatings <= 5.0) {
            System.out.println("Movie rating: bad");
        } else if (movieOrTVSeriesRatings > 5.0 && movieOrTVSeriesRatings <= 6.5) {
            System.out.println("Movie rating: average");
        } else if (movieOrTVSeriesRatings > 6.5 && movieOrTVSeriesRatings <= 7) {
            System.out.println("Movie rating: good");
        } else if (movieOrTVSeriesRatings > 7.0 && movieOrTVSeriesRatings <= 8.0) {
            System.out.println("Movie rating: very good");
        } else if (movieOrTVSeriesRatings > 8.0) {
            System.out.println("Movie rating: amazing");
        }

    }
};
