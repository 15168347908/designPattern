package builder;

public class HignHouseBuilder extends HouseBuilder {
    @Override
    void buildBasics() {
        house.setBasic("打下100m地基");
    }

    @Override
    void buildWalls() {
        house.setWalls("打下20cm厚的墙");
    }

    @Override
    void buildRoofed() {
        house.setRoofed("盖房顶");
    }
}
