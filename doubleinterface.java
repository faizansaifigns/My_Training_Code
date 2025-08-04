
import java.util.Scanner;

interface spotify{
    public void search(String song);
    public void play(String song);
    public void stop(String song); 

}
interface youtubemusic{
     public void ads(String ad);
     public void subs(String sub,int am);
     public void video();
}
class mobile implements spotify,youtubemusic
{

    @Override
    public void search(String song) {
        System.out.println(" finding you song "+song+" on spotify");
    }

    @Override
    public void play(String song) {
        System.out.println(song+" is playing on spotify right now ");
    }

    @Override
    public void stop(String song) {
      System.out.println(song+" is now stop! ");
    }
    @Override
    public void ads(String ad){
        System.out.println("ads is playiing on youtube music!");
    }

    @Override
    public void subs(String sub, int am) {
        System.out.println("youtube subscription "+sub +" plan is "+am+" only!");
    }

    @Override
    public void video() {
       System.out.println("song is playing with videoo on youtube music: ");
    }

}

public class doubleinterface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter song name for spotify1");
        String song=sc.nextLine();
        spotify m1=new mobile();
        m1.search(song);
        m1.play(song);
        m1.stop(song);

        System.out.println("enter ad's product name: ");
        String ad=sc.nextLine();
        String subs=sc.nextLine();
        int am=sc.nextInt();

    }
    
}
