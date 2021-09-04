import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.DefaultCaret;

public class ClassFrame
{
	SimonGame simon;
    private static String ENTER = "Enter";
    static JButton enterButton;
    static JButton enterButtons;
    static JButton enterButtonn;
    static JButton enterColor;
    
    public static JTextArea output_name;
    public static JTextArea output_speed;
    public static JTextArea output_buttons;
    public static JTextArea speeds;
    public static JTextArea High_Score;
    public static JTextArea no_buttons;
    public static JTextField inputName;
    public static JTextField inputspeed;
    public static JTextField inputbutton;
    static JFrame frame;
    static JPanel panel;
   // public static String testString = "test";
   

    public static void main(String... args)
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        createFrame();
    }

    public static void createFrame()
    {
        frame = new JFrame("Configurations");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setOpaque(true);
        ButtonListener buttonListener = new ButtonListener();
        output_name = new JTextArea(3, 30);
        output_speed = new JTextArea(3, 30);
        output_buttons = new JTextArea(3, 30);
        High_Score = new JTextArea(3, 30);
        
       
        JPanel inputpanel = new JPanel();
        inputpanel.setLayout(new FlowLayout());
        JPanel inputpanels = new JPanel();
        inputpanels.setLayout(new FlowLayout());
        JPanel inputpaneln = new JPanel();
        inputpaneln.setLayout(new FlowLayout());
        inputName = new JTextField(20);
        inputspeed = new JTextField(20);
        inputbutton = new JTextField(20);
        enterButton = new JButton("Enter Player Name");
        enterButton.setActionCommand(ENTER);
        enterButton.addActionListener(buttonListener);
        enterButtons = new JButton("Enter Speed");
        enterButtons.setActionCommand(ENTER);
        enterButtons.addActionListener(buttonListener);
        enterButtonn = new JButton("Enter number of buttons");
        enterButtonn.setActionCommand(ENTER);
        enterButtonn.addActionListener(buttonListener);
        
        inputName.setActionCommand(ENTER);
        inputName.addActionListener(buttonListener);
        DefaultCaret caret = (DefaultCaret) output_name.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        DefaultCaret caret1 = (DefaultCaret) output_speed.getCaret();
        caret1.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        DefaultCaret caret2 = (DefaultCaret) output_buttons.getCaret();
        caret2.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
      
        inputpanel.add(inputName);
        inputpanel.add(enterButton);
        inputpanels.add(inputspeed);
        inputpanels.add(enterButtons);
        inputpaneln.add(inputbutton);
        inputpaneln.add(enterButtonn);
        
        panel.add(High_Score);


        panel.add(output_name);
        panel.add(output_speed);
        panel.add(output_buttons);
        panel.add(inputpanel);
        panel.add(inputpanels);
        panel.add(inputpaneln);
       
        
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.pack();
        frame.setLocationByPlatform(true);
        // Center of screen
        // frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        inputName.requestFocus();
        
       
        
    }

    public static class ButtonListener implements ActionListener
    {
    	@Override
        public void actionPerformed(final ActionEvent ev)
        {
           
                String cmd = ev.getActionCommand();
                if (ENTER.equals(cmd))
                {
                    output_name.append(inputName.getText());
                    System.out.println();
                    output_speed.append(inputspeed.getText());
                    System.out.println();
                    output_buttons.append(inputbutton.getText());
                    System.out.println();
                    High_Score.append("High Score:"+String.valueOf(SimonGame.score));
                    SimonGame.currentPlayer.setName(inputName.getText());
                    System.out.println(SimonGame.playerName);
                    SimonGame.currentPlayer.setButtons(Integer.parseInt(inputbutton.getText()));
                    SimonGame.currentPlayer.setSpeed(inputspeed.getText());
                    
                    
                }
            
            inputName.setText("");
            inputName.requestFocus();
            inputspeed.setText("");
            inputspeed.requestFocus();
            inputbutton.setText("");
            inputbutton.requestFocus();
        }

		
    }

	
}