package builder;

/**
 * @author chenjianhui on 2019/10/15
 */
public class RoyalPalaceHouseBluePrint implements HouseBluePrint {

    House house = new House();

    @Override
    public void groundBuild() {
        house.setGround("打地基");
        System.out.println("打一个40000平米的地基");
    }

    @Override
    public void wallBuild() {
        house.setWall("修墙");
        System.out.println("用青花瓷砖修墙");
    }

    @Override
    public void roofBuild() {
        house.setRoof("盖屋顶");
        System.out.println("修一个龙型屋顶");
    }

    @Override
    public House getHouse() {
        System.out.println("小型皇宫建成");
        return house;
    }
}
