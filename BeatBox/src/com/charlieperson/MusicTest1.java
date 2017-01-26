package com.charlieperson;

import javax.sound.midi.*;

public class MusicTest1 {
    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            Sequence seq = new Sequence(timing, 4);
            Track track = seq.createTrack();
            track.add(myMidiEvent1);
            player.setSequence(seq);
            player.start();
            System.out.println("We got a sequencer");
        } catch(MidiUnavailableException ex) {
            System.out.println("Bummer....");
        }
    }
}
