public class Student {
    public int getPSID() {
        return PSID;
    }

    public void setPSID(int PSID) {
        this.PSID = PSID;
    }

    int PSID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    Student(int psid, String name){
        this.PSID = psid;
        this.name = name;
    }
}
