package builder;

/**
 * @author chenjianhui on 2019/10/15
 */
public class TileHouseBluePrint implements HouseBluePrint{
    private House house = new House();

    @Override
    public void groundBuild() {
        house.setGround("打一个6平米的地基");
        System.out.println("打一个6平米的地基");
    }

    @Override
    public void wallBuild() {
        house.setWall("用水泥糊墙");
        System.out.println("用水泥糊墙");
    }

    @Override
    public void roofBuild() {
        house.setRoof("盖点瓦片");
        System.out.println("盖点瓦片");
    }

    @Override
    public House getHouse() {
        System.out.println("瓦房盖好了");
        return house;
    }
}
