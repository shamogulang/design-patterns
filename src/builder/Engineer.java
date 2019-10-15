package builder;

/**
 * @author chenjianhui on 2019/10/15
 */
public class Engineer {

    private HouseBluePrint houseBluePrint;

    public Engineer(HouseBluePrint houseBluePrint) {
        this.houseBluePrint = houseBluePrint;
    }

    public void working(){
        houseBluePrint.groundBuild();
        houseBluePrint.wallBuild();
        houseBluePrint.roofBuild();
    }
}
