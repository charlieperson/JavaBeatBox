package com.charlieperson;

import javax.sound.midi.*;

public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("We got a sequencer");
        } catch(MidiUnavailableException ex) {
            System.out.println("Bummer....");
        }
    }
}
