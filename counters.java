package miniTwitter;

public class counters {
    private static float posCount = 2;
    private static float tweetCount = 2;
    
    private counters(){
        //private constructor
    }
    
    public static void addTweet(){
        tweetCount ++;
        System.out.println("tweets: " + tweetCount);
    }
    
    public static float getTweetCount(){
        return tweetCount;
    }
    
    public static void addPositive(){
        posCount ++;
        System.out.println("Positive: " + tweetCount);
    }
    
    public static float getPosCount(){
        return posCount;
    }
}

