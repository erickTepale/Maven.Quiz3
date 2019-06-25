package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    private String name;
    private LabStatus labStatus;

    public Lab() {
        this("");
    }

    public Lab(String labName) {
        name = labName;
        labStatus = LabStatus.INCOMPLETE;
    }

    public String getName() {
        return name;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus = labStatus;
    }

    public LabStatus getStatus() {
        return labStatus;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", labStatus=" + labStatus +
                '}';
    }
}
