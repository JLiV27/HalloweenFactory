public class Student {

    String name;
    String costume;
    int nCandy;

    public Student(String paramName, String paramCostume, int paramNCandy){
        name = paramName;
        costume = paramCostume;
        nCandy = paramNCandy;
    }

    public void PrintInfo(){
        System.out.println("Name: " + name);
        System.out.println("Costume: " + costume);
        System.out.println("Number of Candy: " + nCandy);
    }
}
