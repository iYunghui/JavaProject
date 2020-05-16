import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;


public class MyFrame extends JFrame{

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		frame.setVisible(true);
	}
	
	public MyFrame() {
		setSize(1280, 720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
				
		JButton start = new JButton("Start");
		StartButtonListener startlistener = new StartButtonListener();
		start.addActionListener(startlistener);
		start.setLocation(1100, 40);
		start.setSize(120, 30);
		add(start);
		
		JButton Skill_1 = new JButton("Skill 1");
		StartButtonListener skill1listener = new StartButtonListener();
		Skill_1.addActionListener(skill1listener);
		Skill_1.setLocation(800, 600);
		Skill_1.setSize(70, 30);
		add(Skill_1);
		
		JButton Skill_2 = new JButton("Skill 2");
		StartButtonListener skill2listener = new StartButtonListener();
		Skill_2.addActionListener(skill2listener);
		Skill_2.setLocation(900, 600);
		Skill_2.setSize(70, 30);
		add(Skill_2);
		
		JButton Skill_3 = new JButton("Skill 3");
		StartButtonListener skill3listener = new StartButtonListener();
		Skill_3.addActionListener(skill3listener);
		Skill_3.setLocation(900, 550);
		Skill_3.setSize(70, 30);
		add(Skill_3);
		
		
	}

	public void paint(Graphics g) {
		super.paint(g);
		
		// temp background
		Image backgroundImage = Toolkit.getDefaultToolkit().getImage("background.png");
		g.drawImage(backgroundImage, 0, 0, 1080, 720, this);
		// temp tower
		Image towerImage = Toolkit.getDefaultToolkit().getImage("tower.png");
		g.drawImage(towerImage, 100, 50, 350, 350, this);
		// temp role
		Image roleImage = Toolkit.getDefaultToolkit().getImage("role.png");
		g.drawImage(roleImage, 0, 300, 1500, 1000, this);
		
	}
}
