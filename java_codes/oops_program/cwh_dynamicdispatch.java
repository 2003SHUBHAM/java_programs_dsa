class phone{
    public  void On(){
        System.out.println("switch on the phone ");
    }
    public void Play(){
        System.out.println(" play music ");
    }
}
class smartphone extends phone{
    public void Gogle(){
        System.out.println("open goggle ");

    }
    public  void Play(){
        System.out.println("play music on smartphone");
    }
}

public class cwh_dynamicdispatch {
    public static void main(String[] args) {
        phone oneplus = new smartphone();
        oneplus.On();
        oneplus.Play();

    }
}
