package com.company;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Clip;

public class AudioHandle {
    private static final int EXTERNAL_BUFFER_SIZE = 128000;
    public AudioInputStream audioInputStream;
    public Clip clip;
    public DataLine.Info info;

    public AudioHandle()
    {
         audioInputStream = null;
         clip = null;
         info = null;

    }

    public void playFile(){

        clip.start();



    }

    public void loadData(String path) {


        File soundFile = new File(path);

        try {
            this.audioInputStream = AudioSystem.getAudioInputStream(soundFile);
        } catch (Exception e) {
            e.printStackTrace();
        }

        info = new DataLine.Info(Clip.class, audioInputStream.getFormat());

        try {
            this.clip = (Clip) AudioSystem.getLine(info);
            this.clip.open(audioInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*


    public void playsound(String path) {

        String strFilename = path;
        File soundFile = new File(strFilename);

        AudioInputStream audioInputStream = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(soundFile);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        AudioFormat audioFormat = audioInputStream.getFormat();
        SourceDataLine line = null;
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);

        try {
            line = (SourceDataLine) AudioSystem.getLine(info);
            line.open(audioFormat);
        } catch (LineUnavailableException e)
        {
                e.printStackTrace();
                System.exit(1);
        }
        catch (Exception e)
        {
                e.printStackTrace();
                System.exit(1);
        }
        line.start();


        int nBytesRead = 0;
        byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];

        while(nBytesRead != -1)
        {
            try
            {
                nBytesRead = audioInputStream.read(abData, 0, abData.length);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            if(nBytesRead >= 0)
            {
                int	nBytesWritten = line.write(abData, 0, nBytesRead);
            }
        }

        line.drain();

        line.stop();

        line.close();







    }




}

*/
