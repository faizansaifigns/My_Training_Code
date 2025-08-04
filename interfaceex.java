interface vehicle{
    void drive();
    void start();
    void stop();
    void brand();
   
}
class car implements vehicle{
    public void drive(){
        System.out.println("Car is driving");
    }
    public void start(){
        System.out.println("Car is starting");
        }
        public void stop(){
            System.out.println("Car is stopping");
            }
            public void brand(){
                System.out.println("Car brand is Toyota");
            }
            public void color(){
                System.out.println("Car color is Red");
            }

}

public class interfaceex {
    public static void main(String[] args) {
        vehicle c=new car();
        c.drive();
        c.start();
        c.stop();
        c.brand();
       car c2=new car();
       c2.color();
    
}
}

