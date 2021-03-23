package realwork.work;


import java.math.BigDecimal;

/**
 * type == 0, age （20，35）  同时name不能为空
 * type == 1, age  (67,78)
 */
public class Req {

    private String name;
    private Integer age;
    private BigDecimal height;
    private int type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
