package builder;

import entity.House;

public class HouseDirector {
    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House toCreateHouse(){
        houseBuilder.buildBasics();
        houseBuilder.buildWalls();
        houseBuilder.buildRoofed();
        return houseBuilder.buildHourse();
    }
}
