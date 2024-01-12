import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarList {
    private Map<String, List<Car>> cars = new HashMap<>();
    private Map<String, List<SuperCar>> scars = new HashMap<>();

    public void carItem() {
        // 일반적인 자동차 리스트
        List<Car> normalCarList = new ArrayList<>();
        normalCarList.add(new Car("현대", 120, "그랜져", 4, "검은색"));
        normalCarList.add(new Car("기아", 130, "카니발", 4, "흰색"));

        // 슈퍼카 리스트
        List<SuperCar> superCarList = new ArrayList<>();
        superCarList.add(new SuperCar("람보르기니", 200, "아벤타도르", 4, "노란색", 600000000 ));
        superCarList.add(new SuperCar("롤스로이스", 200, "스웹테일", 4, "검은색", 14000000000l ));


        cars.put("NormalCar", normalCarList);
        scars.put("SuperCar", superCarList);

    }

    public List<Car> getMenus(String a) {
        System.out.println(a);

        return cars.get(a); // ㅠㅠ 저처럼 못하는 사람 있나효..★
    }

}
