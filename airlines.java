
import java.util.Scanner;

                interface Airline{
        void checkin(String pName,int lug);
        void boarding(String pName);
        void takeoff();
    }
    class Indigo implements Airline{
        @Override
        public void checkin(String pName,int lug){
            System.out.println(pName+" checked in with weight "+lug+" in indigi");   
            }
            @Override
            public void boarding(String pName){
                System.out.println(pName+" boarded");
                }
                @Override
                public void takeoff(){
                    System.out.println("Air India plane took off");
                    }
                    }
                                        class Vistara implements Airline{    
                                        @Override
                                        public void checkin(String pName,int lug){
                                            System.out.println(pName+" checked in with weight "+lug+" in Vistara");
                                            }
                                            @Override
                                            public void boarding(String pName){
                                                System.out.println(pName+" boarded");
                                                }
                                                @Override
                                                public void takeoff(){
                                                    System.out.println("Jet Airways plane took off");
                                                    }
                                                    }
                                    

    public class airlines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter passenger name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter luggage weight: ");
        int lug = sc.nextInt();
        sc.nextLine(); 
        
        Airline ai = new Indigo();
        ai.checkin(name, lug);
        ai.boarding(name);
        ai.takeoff();
        
        System.out.println();
        System.out.println("Enter passenger name for Vistara:");
        String name1 = sc.nextLine();
        
        System.out.println("Enter luggage weight:");
        int lug1 = sc.nextInt();
        sc.nextLine(); 

        Airline ja = new Vistara();
        ja.checkin(name1, lug1);
        ja.boarding(name1);
        ja.takeoff();   
    }
}

