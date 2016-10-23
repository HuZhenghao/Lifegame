package lifegame;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Lifegame extends JFrame {
	Lifegame(){
		this.setSize(600,620);
		this.setTitle("…˙√¸”Œœ∑version1.0");  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		this.setLocationRelativeTo(null);  
		Gamemap gamemap = new Gamemap();
		this.add(gamemap);
		gamemap.startgame();
        this.setResizable(false);  
	}
	public static void main(String args[]){
		Lifegame gameframe = new Lifegame();
		gameframe.setVisible(true);
	}
	

}