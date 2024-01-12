import java.util.List;

public class Main {
    private static CarList carList = new CarList();



    public static void main(String[] args) {


        List<Car> mainMenus = carList.getMenus("NormalCar");


        System.out.println(mainMenus);


    }
}