package builder;

public class CommonHouseBuilder extends HouseBuilder {
    @Override
    void buildBasics() {
        house.setBasic("打下10米地基");
    }

    @Override
    void buildWalls() {
        house.setWalls("打下10cm厚的墙");
    }

    @Override
    void buildRoofed() {
        house.setRoofed("盖房顶");
    }
}
