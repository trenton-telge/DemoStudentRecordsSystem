public class AdvancedJava extends Course implements FinalGrade, LetterGrade {

    double grades_in_class;

    AdvancedJava(int code, double avg_assignments, double avg_exams, double grades_in_class) {
        super(code, avg_assignments, avg_exams);
        this.grades_in_class = grades_in_class;
    }

    public double getGrades_in_class() {
        return grades_in_class;
    }

    public void setGrades_in_class(double grades_in_class) {
        this.grades_in_class = grades_in_class;
    }

    @Override
    public double computeFinalGrade() {
        return avg_exams*.4+avg_assignments*.4+grades_in_class*.2;
    }

    @Override
    public char computeLetterGrade() {
        int rg = (int)Math.round(computeFinalGrade());
        if (rg >= 90){return 'A';} else if (rg >= 80){return 'B';} else if (rg >= 70){return 'C';} else if (rg >= 60){return 'D';} else {return 'F';}
    }
}
