package githubproject;

public class GitHubProject 
{

public static double getRandomInteger(double min, double max)
{
    double x = (int)(Math.random() * ((max-min) + 1)) + min;
    return x;
}
    
    public static void main(String[] args) 
    {
        System.out.println("Random number between 1 and 6: "+ getRandomInteger(1,6));
        System.out.println("Random number between 1 and 6: "+ getRandomInteger(1,6));
        System.out.println("Random number between 55 and 68: "+ getRandomInteger(55,68));
        System.out.println("Random number between 1 and 6: "+ getRandomInteger(1,6));
        System.out.println("Random number between 1 and 6: "+ getRandomInteger(1,6));
        System.out.println("Random number between 100 and 600: "+ getRandomInteger(100,600));
        System.out.println("Random number between 1 and 6: "+ getRandomInteger(1,6));
    }
    
}
