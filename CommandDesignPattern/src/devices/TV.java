package devices;

import javax.sound.midi.Soundbank;

public class TV {

    public void turnOn(){
        System.out.println("TV turned ON");
    }

    public void changeVolume(int volume){
        System.out.println("Volume is " + volume);
    }

    public void turnOff(){
        System.out.println("TV turned OFF");
    }

}
