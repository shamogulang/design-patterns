package realwork.work4;

public enum  EventType {

    UPDATE_CNT((byte)1,"更新数量"),
    UPDATE_CACHE((byte)2,"更新缓存");
    private byte value;
    private String desc;

    EventType(byte value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public byte getValue() {
        return value;
    }

    public void setValue(byte value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
