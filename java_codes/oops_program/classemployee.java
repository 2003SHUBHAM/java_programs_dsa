class employee{
//    int salary;
//    String name;
    public int getSalary(int salary){
        return salary;
    }
    public String getName(String name){
        return name ;
    }

}


public class classemployee {
    public static void main(String[] args) {
        employee honey = new employee();
//        honey.salary = 100;
//        honey.name= "anubhav";
        System.out.println(honey.getName("anubhav"));
        System.out.println(honey.getSalary(100));
        cellphone a = new cellphone();
        a.alarm();
        a.ringing();
        a.vibrating();
        square s = new square() ;
        s.side= 4;
        System.out.println(s.getPerimeter());
        System.out.println(s.getArea());
    }
}
class cellphone {
    public void ringing() {
        System.out.println("your phone is ringing");
    }

    public void vibrating() {
        System.out.println("your phone is vibrating ");
    }

    public void alarm() {
        System.out.println("your phone is silent");
    }

}
class square {
    int side ;
    public int getArea(){
        return side * side ;
    }
    public int getPerimeter(){
        return 4*side;
    }
}


