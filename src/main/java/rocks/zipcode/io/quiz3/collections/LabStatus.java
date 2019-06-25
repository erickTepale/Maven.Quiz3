package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 * Ensure there are enumerations for, `COMPLETED`, `INCOMPLETE`, `PENDING`
 */
public enum LabStatus {
    COMPLETED("COMPLETED"), INCOMPLETE("INCOMPLETE"), PENDING("PENDING");

    private String value;

    LabStatus(String value){
        this.value = value;
    }
}
