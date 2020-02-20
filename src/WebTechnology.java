public class WebTechnology extends Course implements FinalGrade, LetterGrade {

    double grades_quizzes;

    WebTechnology(int code, double avg_assignments, double avg_exams, double grades_quizzes) {
        super(code, avg_assignments, avg_exams);
        this.grades_quizzes = grades_quizzes;
    }

    public double getGrades_quizzes() {
        return grades_quizzes;
    }

    public void setGrades_quizzes(double grades_quizzes) {
        this.grades_quizzes = grades_quizzes;
    }

    @Override
    public double computeFinalGrade() {
        return avg_exams*.3+avg_assignments*.5+grades_quizzes*.2;
    }

    @Override
    public char computeLetterGrade() {
        int rg = (int)Math.round(computeFinalGrade());
        if (rg >= 95){return 'A';} else if (rg >= 85){return 'B';} else if (rg >= 75){return 'C';} else if (rg >= 60){return 'D';} else {return 'F';}
    }
}
