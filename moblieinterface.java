interface spotify{
    void search();
    void play();
    void pause();
    void stop();
}
class mobile implements spotify{
    public void search(){
        System.out.println("Searching on mobile");
}
public void play(){
System.out.println("play the song");}
public void pause(){
    System.out.println("song is paused now!");
}
public void stop(){
    System.out.println("song is stopped now!");
}
}
public class moblieinterface {
    public static void main(String[] args) {
        spotify m1=new mobile();
        m1.search();
        m1.play();
        m1.pause();
        m1.stop();
            
        } 

    
}
