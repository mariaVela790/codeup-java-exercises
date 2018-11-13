public class BurgerTest {
    public static void main(String[] args) {
        BurgerTools burgerTool = new BurgerTools();
        System.out.println(BurgerTools.mostPopularTopping);
        BurgerTools.mostPopularTopping = "Lettuce";
        System.out.println(BurgerTools.mostPopularTopping);
    }
}
