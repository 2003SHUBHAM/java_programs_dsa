class btec{
    public int id ;
     btec(){
         this.id =id;
     }
    public int getId() {
        System.out.println("i am student of btec " + id);
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    btec(int x ){
        System.out.println("i have score"+ x);
    }



}
class branch extends btec{

    public int rn;
    public int getRn() {
        System.out.println(" my roll no id " + rn);
        return rn;
    }

    public void setRn(int rn) {
        this.rn = rn;
    }



}




public class cwh_inheritence {
    public static void main(String[] args) {
    btec x = new btec(4);
    x.setId(25);
        System.out.println(x.getId());
    branch y = new branch();
    y.setId(47);
        System.out.println(y.getId());
        y.setRn(7);
        System.out.println(y.getRn());

    }
}
