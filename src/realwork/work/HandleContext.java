package realwork.work;

import java.util.ArrayList;
import java.util.List;

public class HandleContext {

    private List<String> errors = new ArrayList<>();
    private Req req;

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public Req getReq() {
        return req;
    }

    public void setReq(Req req) {
        this.req = req;
    }
}
