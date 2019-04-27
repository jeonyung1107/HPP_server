package CaffeineGorilla.HPP_server.model;

import org.apache.ibatis.type.Alias;

@Alias("session")
public class Session {
    private String id;
    private String start;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    private String end;
}
