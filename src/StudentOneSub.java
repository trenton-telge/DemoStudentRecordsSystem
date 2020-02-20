public class StudentOneSub extends Student{
    public AdvancedJava getSub1() {
        return sub1;
    }

    public void setSub1(AdvancedJava sub1) {
        this.sub1 = sub1;
    }

    AdvancedJava sub1;

    public StudentOneSub(int psid, String name, AdvancedJava sub1) {
        super(psid, name);
        this.sub1 = sub1;
    }

    void displayOS(){
        System.out.println("Student: "+ this.name +
                "\n Subject: Advanced Java" +
                "\n Grade: " + sub1.computeFinalGrade() +
                "\n Letter Grade: " + sub1.computeLetterGrade());
    }
}
