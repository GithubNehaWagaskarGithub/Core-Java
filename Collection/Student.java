package Collection;

public class Student {
    private int sId;
    private String sName;
    private double sMarks;

    public Student(int sId, String sName, double sMarks) {
        this.sId = sId;
        this.sName = sName;
        this.sMarks = sMarks;
    }
    public Student()
    {

    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public double getsMarks() {
        return sMarks;
    }

    public void setsMarks(double sMarks) {
        this.sMarks = sMarks;
    }

    @Override
    public String toString() {
        return
                "Student Id=" + sId +
                ", Student Name='" + sName +
                ", Student Marks=" + sMarks ;
    }
}
