package CaffeineGorilla.HPP_server.model;

import org.apache.ibatis.type.Alias;

@Alias("workout")
public class Workout {
    private String id;
    private String name;
    private String muscle;
    private String unit;

    public String getMuscle() {
        return muscle;
    }

    public void setMuscle(String muscle) {
        this.muscle = muscle;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMusclePart() {
        return musclePart;
    }

    public void setMusclePart(String musclePart) {
        this.musclePart = musclePart;
    }

    private String musclePart;
}
