package CaffeineGorilla.HPP_server.model;

import org.apache.ibatis.type.Alias;

@Alias("workoutSet")
public class WorkoutSet {
    private String id;
    private String session;
    private String excercise;
    private int intensity;
    private int numberof;
    private String writtentime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getExcercise() {
        return excercise;
    }

    public void setExcercise(String excercise) {
        this.excercise = excercise;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public int getNumberof() {
        return numberof;
    }

    public void setNumberof(int numberof) {
        this.numberof = numberof;
    }

    public String getWrittentime() {
        return writtentime;
    }

    public void setWrittentime(String writtentime) {
        this.writtentime = writtentime;
    }

    @Override
    public String toString() {
        return "WorkoutSet{" +
                "id='" + id + '\'' +
                ", session='" + session + '\'' +
                ", excercise='" + excercise + '\'' +
                ", intensity=" + intensity +
                ", numberof=" + numberof +
                ", writtentime='" + writtentime + '\'' +
                '}';
    }
}
