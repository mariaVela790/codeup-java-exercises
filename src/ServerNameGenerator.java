public class ServerNameGenerator {
    private static String[] adjectives = {"agreeable", "ambitious", "brave", "calm", "eager", "delightful", "faithful", "kind", "nice", "obedient"};
    private static String[] nouns = {"school", "dog", "cat", "friend", "baby", "hero", "match", "competition", "shoe", "computer"};

    private static String getRandomAdjective(){
        return adjectives[MethodsExercises.getRandom(0, adjectives.length - 1)];
    }
    private static String getRandomNoun(){
        return adjectives[MethodsExercises.getRandom(0, nouns.length - 1)];
    }
    public static String createServerName(){
        return getRandomAdjective() + "-" + getRandomNoun();
    }


    public static void main(String[] args) {

        System.out.println(createServerName());
    }

}
