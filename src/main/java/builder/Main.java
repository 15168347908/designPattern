package builder;

import entity.House;

public class Main {
    public static void main(String[] args) {
        HouseDirector director = new HouseDirector(new HignHouseBuilder());
        House house = director.toCreateHouse();
        System.out.println(house);
        HouseDirector director1 = new HouseDirector(new CommonHouseBuilder());
        House house1 = director1.toCreateHouse();
        System.out.println(house1);
    }
}
