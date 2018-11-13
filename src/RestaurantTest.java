public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish1 = new RestaurantDish();
        dish1.setCostIntCents(1300);
        dish1.setNameOfDish("sweetBread");
        dish1.setWouldRecommend(true);
        System.out.println(dish1.getCostInCents());
        System.out.println(dish1.getNameOfDish());
        System.out.println(dish1.getWouldRecommend());

        dish1.eat();
    }
}
