package builder;

import entity.House;

public abstract class HouseBuilder {
    protected House house = new House();

    abstract void buildBasics();

    abstract void buildWalls();

    abstract void buildRoofed();

    public House buildHourse(){
        return house;
    }
}
