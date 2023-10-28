import java.util.Date;

public class Program {
    public static void main(String[] args) {
        demo();
    }

    static void demo(){
//        Comment Ctrl + /
//        long age = 127L;
//        System.out.println(age);

//        float pi = 3.14f;
//        System.out.println(pi);

//        char c = 'a';
//        System.out.println(c);
//
//        String s = "Java Core";
//        System.out.println(s);

//        Date birthday = new Date();
//        System.out.println(birthday);

//        Gender gender = Gender.UNKNOW;
//        System.out.println(gender);

//       format code: Ctrl + Shift + L
        int[] diem = new int[]{9,8,7,10,5};
//        diem[0] = 9;
//        diem[1] = 8;
//        diem[2] = 7;
//        diem[3] = 10;
//        diem[4] = 6;

//        System.out.println(diem[4]);

        Student student1 = new Student();
        student1.id = 1;
        student1.fullName = "Nguyen Van A";

        Student student2 = new Student();
        student2.id = 2;
        student2.fullName = "Nguyen Van B";

        System.out.println(student1);
        System.out.println(student2);

    }
}
