public class RestaurantDish {
    private int costInCents;//done
    private String nameOfDish;//done
    private boolean wouldRecommend;//done

    public RestaurantDish(){

    }
    public RestaurantDish(int costInCents, String nameOfDish, boolean wouldRecommend){
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public void setCostIntCents(int costIntCents){
        this.costInCents = costIntCents;
    }

    public int getCostInCents(){
        return this.costInCents;
    }

    public void setNameOfDish(String nameOfDish){
        this.nameOfDish = nameOfDish;
    }

    public String getNameOfDish(){
        return this.nameOfDish;
    }

    public void setWouldRecommend(boolean wouldRecommend){
        this.wouldRecommend = wouldRecommend;
    }

    public boolean getWouldRecommend(){
        return this.wouldRecommend;
    }


    public void eat(){

        System.out.println("Nom nom nom!");
    }
}
