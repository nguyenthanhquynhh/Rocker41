public class Student {
    int id;
    String fullName;
    boolean isPassCource;

    void run(){
        System.out.println("Student running ....");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", isPassCource=" + isPassCource +
                '}';
    }
}
