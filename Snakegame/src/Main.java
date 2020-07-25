import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	JFrame obj=new JFrame();
	Gameplay game=new Gameplay();//creating object of gameplay class

	obj.setBounds(10,10,905,700);
	obj.setBackground(Color.darkGray);
	obj.setResizable(false);
	obj.setVisible(true);
	obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//At this point we have implemented the frame and now we will implemet panel in frame
		obj.add(game);//adding object of gameplay to screen
    }
}
