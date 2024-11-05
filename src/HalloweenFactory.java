public class HalloweenFactory {

    int year;
    int temp;

    public static void main(String[] args) {

    }

    public HalloweenFactory(){
        Student myStudent = new Student("Dennis", "Spiderman", 40);
        Candy myCandy = new Candy(true, "SourPatch", 100);

        myStudent.PrintInfo();
        myCandy.PrintInfo();
    }
}
