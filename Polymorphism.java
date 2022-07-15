interface camera{

    void takeSnap();
    void recordvideo();
}

interface MediaPlayer{

    void playMusic();
    void stopMusic();
}


class SmartPhone implements camera, MediaPlayer{

    public void takeSnap(){
        System.out.println("Taking snap...");
    }
    public void recordvideo(){
        System.out.println("Recording video in 4k...");
    }
    public void playMusic(){
        System.out.println("Playing song...");
    }
    public void stopMusic(){
        System.out.println("Stopping music...");
    }

}

public class Polymorphism{
    public static void main(String[] args) {
        
       camera obj = new SmartPhone();
       obj.takeSnap();
    }
}