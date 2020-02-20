public class StudentTwoSub extends Student{
    public AdvancedJava getSub1() {
        return sub1;
    }

    public void setSub1(AdvancedJava sub1) {
        this.sub1 = sub1;
    }

    public WebTechnology getSub2() {
        return sub2;
    }

    public void setSub2(WebTechnology sub2) {
        this.sub2 = sub2;
    }

    AdvancedJava sub1;
    WebTechnology sub2;

    public StudentTwoSub(int psid, String name, AdvancedJava sub1, WebTechnology sub2) {
        super(psid, name);
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    void displayTS(){
        System.out.println("Student: "+ this.name +
                "\n Subject: Advanced Java" +
                "\n Grade: " + sub1.computeFinalGrade() +
                "\n Letter Grade: " + sub1.computeLetterGrade() +
                "\n" +
                "\n Subject: Web Technology" +
                "\n Grade: " + sub2.computeFinalGrade() +
                "\n Letter Grade: " + sub2.computeLetterGrade());
    }
}
