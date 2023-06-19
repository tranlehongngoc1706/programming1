package Question2;

public class Human {
    public static void main(String[] args) {
        Student mystudent = new Student("Andrew","186 HH Street Ward 9 District 3","Mechanics",2021,100);
        System.out.println(mystudent.toString());

        Staff mystaff = new Staff("Garfield","176 NT Street Ward unknown District PN","R School",100);
        System.out.println(mystaff.toString());
    }
}
