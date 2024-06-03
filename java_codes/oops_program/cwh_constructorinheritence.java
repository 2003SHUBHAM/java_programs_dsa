import javax.xml.namespace.QName;

class library{
//    public String name2;

    public library(String name2) {
        System.out.println("the library is " + name2);
//        this.name2 = name2;
    }
}
class student1 extends library{
    public String name1;

    public student1(String name2, String name1) {
        super(name2);
        System.out.println("i am preparing for " + name1);
        this.name1 = name1;
    }
}
class student2 extends student1{
    public String name3;

    public student2(String name2, String name1, String name3) {
        super(name2, name1);
        System.out.println("my name is "+ name3);
        this.name3 = name3;
    }
}
class live extends student2{

    public live(String name2, String name1, String name3) {
        super(name2, name1, name3);
        System.out.println("i am son of shubham");

    }
}
public class cwh_constructorinheritence {
    public static void main(String[] args) {
//        library x = new library("phase1");
//        x.name2 ="swamivivekanand";
//        x.name1 ="ssc cgl";
//        x.name3 ="tanmay";
        live x =new live("swamivivekanand","ssccgl","tanmay");

    }
}
