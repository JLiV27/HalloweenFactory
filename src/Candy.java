public class Candy {

    boolean isSour;
    String brand;
    int calories;

    public Candy(boolean paramIsSour, String paramBrand, int paramCalories){
        isSour = paramIsSour;
        brand = paramBrand;
        calories = paramCalories;
    }

    public void PrintInfo(){
        System.out.println("Sour: " + isSour);
        System.out.println("Brand: " + brand);
        System.out.println("Calories: " + calories);
    }
}
