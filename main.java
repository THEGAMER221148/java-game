import java.awt.Toolkit;
import javax.swing.JFrame;

public class Main extends JFrame {
	static JFrame frame = new Main();
	Screen ScreenObject = new Screen();
	public Main(){
		add(ScreenObject);
		setUndecorated(true);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		System.out.print("ts is a virsu so ur cinda kooked. Bibi.");
		// JFrame frame = new JFrame("Quelx Game");
		// frame.setSize(1024, 1024);
		// frame.setVisible(true);
		// frame.setLocation(100, 100);
    }
}