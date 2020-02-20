public class Course {
    int subjectCode;
    double avg_exams, avg_assignments;

    Course(int code, double avg_assignments, double avg_exams){
        this.subjectCode = code;
        this.avg_assignments = avg_assignments;
        this.avg_exams = avg_exams;
    }

    public int getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(int subjectCode) {
        this.subjectCode = subjectCode;
    }

    public double getAvg_exams() {
        return avg_exams;
    }

    public void setAvg_exams(double avg_exams) {
        this.avg_exams = avg_exams;
    }

    public double getAvg_assignments() {
        return avg_assignments;
    }

    public void setAvg_assignments(double avg_assignments) {
        this.avg_assignments = avg_assignments;
    }
}
