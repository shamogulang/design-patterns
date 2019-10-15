package builder;

/**
 * @author chenjianhui on 2019/10/15
 */
public interface HouseBluePrint {

    /**
     * 打地基
     */
    void groundBuild();

    /**
     *修墙
     */
    void wallBuild();

    /**
     *盖屋顶
     */
    void roofBuild();

    /**
     * 验收房子
     * @return
     */
    House getHouse();
}
