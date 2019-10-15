package builder;

/**
 * @author chenjianhui on 2019/10/15
 */
public class Client {

    //将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
    public static void main(String[] args) {
        //设计一个房子构建的图纸
        HouseBluePrint h = new RoyalPalaceHouseBluePrint();
        //工程师拿到图纸
        Engineer engineer = new Engineer(h);
        //开工，构建房子的过程有顺序的进行
        engineer.working();
        //根据图纸验收房子
        h.getHouse();
        //返回结果：打一个40000平米的地基  用青花瓷砖修墙  修一个龙型屋顶 小型皇宫建成

        //现在我要创建一个瓦房，只需要添加有瓦房的设计图纸即可
        h = new TileHouseBluePrint();
        engineer = new Engineer(h);
        engineer.working();
        h.getHouse();
        //返回结果：打一个6平米的地基  用水泥糊墙   盖点瓦片  瓦房盖好了

        //好了，现在如果要你造一个别墅，你怎么做
    }
}
