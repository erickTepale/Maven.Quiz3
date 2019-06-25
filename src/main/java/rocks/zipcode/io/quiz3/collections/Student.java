package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private List<Lab> labs;

    public Student() {
        this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for (Lab each : labs) {
            if(each.getName().equals(labName))
                return each;
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        try {
            getLab(labName).setStatus(labStatus);
        }catch (Exception e){
            throw new UnsupportedOperationException(e);
        }
    }

    public void forkLab(Lab lab) {

        lab.setStatus(LabStatus.PENDING);
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

}
