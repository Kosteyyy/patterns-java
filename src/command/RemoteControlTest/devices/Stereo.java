package devices;

public class Stereo {
    String name;
    public Stereo(String name) {
        this.name = name;
    }
    
    public void on() {
        System.out.println("Stereo is On");
    }
    public void off() {
        System.out.println("Stereo is Off");
    }
    public void setCD() {
        System.out.println("Stereo CD is set");
    }
    public void setDVD() {
        System.out.println("Stereo DVD is Set");
    }
    public void setRadio() {
        System.out.println("Stereo Radio is Set");
    }
    public void setVolume(int volume) {
        System.out.println("Stereo Volume is Set to " + volume + "");
    }
}