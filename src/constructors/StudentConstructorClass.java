package constructors;

public class StudentConstructorClass {

    public String name;
    public int ID;
    public char Grade;
    public String DOB;

    public StudentConstructorClass() {}

    public StudentConstructorClass(String name, int ID, char grade, String DOB) {
        this.name = name;
        this.ID = ID;
        this.Grade = grade;
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public char getGrade() {
        return Grade;
    }

    public void setGrade(char grade) {
        Grade = grade;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }





}
