public class ServerNameGenerator {
    public static String[] adjectives = {"agreeable", "ambitious", "brave", "calm", "eager", "delightful", "faithful", "kind", "nice", "obedient"};
    public static String[] nouns = {"school", "dog", "cat", "friend", "baby", "hero", "match", "competition", "shoe", "computer"};

    public static String getRandomElement(String[] strings){
        int index = (int)(Math.random() * strings.length);
        return strings[index];
    }

    public static void main(String[] args) {

        System.out.println(getRandomElement(adjectives) + "-" + getRandomElement(nouns));
    }

}
