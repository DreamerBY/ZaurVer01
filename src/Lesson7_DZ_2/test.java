package Lesson7_DZ_2;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;
import java.awt.event.InputEvent;
public class test {









}
class test1 {
    public static void main(String[] args) throws IOException, AWTException, InterruptedException {

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Robot myrobot = new Robot();

        myrobot.mouseMove(1876,1892);
        myrobot.mousePress(InputEvent.BUTTON1_MASK);
        myrobot.mouseRelease(InputEvent.BUTTON1_MASK);

        myrobot.mouseMove(1852,2028);
        myrobot.mousePress(InputEvent.BUTTON1_MASK);
        myrobot.mouseRelease(InputEvent.BUTTON1_MASK);

        myrobot.mouseMove(1815,1913);
        myrobot.mousePress(InputEvent.BUTTON1_MASK);
        myrobot.mouseRelease(InputEvent.BUTTON1_MASK);

        myrobot.mouseMove(1815,1957);
        myrobot.mousePress(InputEvent.BUTTON1_MASK);
        myrobot.mouseRelease(InputEvent.BUTTON1_MASK);

        myrobot.mouseMove(1815,1957);
        myrobot.mousePress(InputEvent.BUTTON1_MASK);
        myrobot.mouseRelease(InputEvent.BUTTON1_MASK);


    }
}