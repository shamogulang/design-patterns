package realwork.work4;

public class LiveEvent {

    private long eventId;
    private long livePk;
    private byte eventType;
    private String targetSystem;

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public long getLivePk() {
        return livePk;
    }

    public void setLivePk(long livePk) {
        this.livePk = livePk;
    }

    public byte getEventType() {
        return eventType;
    }

    public void setEventType(byte eventType) {
        this.eventType = eventType;
    }

    public String getTargetSystem() {
        return targetSystem;
    }

    public void setTargetSystem(String targetSystem) {
        this.targetSystem = targetSystem;
    }
}
