class student{
    student(int x ,int y ,int z){
        System.out.println("the average marks of student is " + (x + y + z)/3);
    }
    student(int a){
        System.out.println("the salary of shubham is " + a);
    }

}
public class cwh_constructor {
    public static void main(String[] args) {
        student shubham = new student(85,95,65);
        student s = new student(10000);
    }
}
