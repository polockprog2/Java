import javax.swing.JFrame;

public class MyFrame extends JFrame
{
	MyFrame()
	{
		JFrame frame = new JFrame();
		frame.setTitle("My picture"); /*sets title of frame*/
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); /*exit of application*/
		frame.setResizable(false); /*prevent frame from being resized*/
		frame.setSize(420,420); /*sets the X dimention and the Y dimention of frame*/
		frame.setVisible(true); /* make frame visible*/
		frame.setBackground(new Color(140,80,79));
		
		ImageIcon image = new ImageIcon("polo.png");
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(new Color(125,79,134));
	}
}