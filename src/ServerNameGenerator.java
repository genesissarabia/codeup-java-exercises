import java.util.Random;

public class ServerNameGenerator {

    private static String[] generateAdjective = {"friendly", "gentle", "irritable", "sarcastic", "silly", "cheerful", "adorable", "brave", "lucky", "timely"};
    private static String[] generateNoun = {"teenager", "cricket", "boots", "lamp", "hospital", "bakery", "actor", "businessperson", "lynx", "pangolin"};

    private static Random rand = new Random();
    public static String generateName() {
        return generateAdjective[rand.nextInt(generateAdjective.length)] + "-" + generateNoun[rand.nextInt(generateNoun.length)];

    }

    public static void main(String[] args) {

        System.out.println(generateName());

    }
}
