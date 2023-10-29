public class Program {
    public static void main(String[] args) {
        int age = 100;
//        if(age < 18){
//            System.out.println("chua du tuoi de di lam");
//        }else if (age > 65) {
//            System.out.println("Qua tuoi");
//        }else  {
//            System.out.println("Duoc di lam");
//        }

        String result = age < 18? "Chua du de di lam": "dc di lam";
        System.out.println(result);
    }

}
