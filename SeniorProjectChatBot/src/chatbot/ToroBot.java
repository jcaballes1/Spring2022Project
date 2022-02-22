package chatbot;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ToroBot extends JFrame implements ActionListener{
	static JTextArea chatLog=new JTextArea();
	JTextField entryField=new JTextField();
	JScrollPane scroller;
	JButton send;
	
	public ToroBot(String title)
	{
		super(title);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.red);
		entryField=new JTextField();
		send=new JButton("send");
		send.setFont(new Font("Serif",Font.BOLD,25));
		send.setBackground(Color.white);
		send.setBounds(735,520,50,35);
		add(send);
		chatLog.setEditable(false);
		chatLog.setBackground(Color.white);
		add(chatLog);
		chatLog.setFont(new Font("Serif",Font.PLAIN,20));
		scroller=new JScrollPane(chatLog,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroller.setBounds(10,20,775,470);
		add(scroller);
			
		entryField.setSize(725,35);
		entryField.setLocation(10,520);
		entryField.setForeground(Color.black);
		entryField.setFont(new Font("Serif",Font.BOLD,25));
		add(entryField);
		
		send.addActionListener(this);
		getRootPane().setDefaultButton(send);
		speak("Welcome CSUDH Student. My name is ToroBot. How can I help you today?: " );
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String message=entryField.getText().toLowerCase();
	   
		chatLog.append("You : "+entryField.getText()+"\n");
		
		intellegence(message);
	}
	
	public static void intellegence(String message)
	{
		 String strLowerCase = message.toLowerCase();
		 while(true)
		 {
		 if (strLowerCase.toString().contains("financial aid"))
		 {
			
			speak(" Here is the link: https://www.csudh.edu/financial-aid/ ");
			break;
		 }
		 
		 else if (strLowerCase.toString().contains("tuition"))
		 {
		 speak(" Fees for credential students may vary per semester.Please visit our website at the following URL:https://www.csudh.edu/financial-aid/cost/ for a complete breakdown of the costs ");
		 break;
		 }
		 
		 else if (strLowerCase.toString().contains("calender"))
		 {
		 speak(" Here is the most recent calender:  https://www.csudh.edu/Assets/csudh-sites/academic-affairs/academic-calendar/docs/2021-2022%20academic%20calendar%20approved.pdf ");
		 break;
		 }
		 else 
		 {
		 speak(" I do not understand your question. Please provide me with more details. It would be appreciated. ");
		 break;
		 }
		 
		 }
	}
	
	public static void speak(String message)
	{
		chatLog.append("ToroBot : "+message+"\n");
	}
	public static void main(String[] args) 
	{
		ToroBot cb=new ToroBot("ToroBot");
		cb.setSize(800,605);
		cb.setLocation(50,50);
		
	}
}