package CaffeineGorilla.HPP_server.model;

import org.apache.ibatis.type.Alias;

@Alias("muscle")
public class Muscle {
    private String id;
    private String Name;
    private String parent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }
}
