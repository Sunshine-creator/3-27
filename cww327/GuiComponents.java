package cww327;
import javax.swing.*;
public class GuiComponents {
    public static void main(String[] args) {
        JButton jbOk = new JButton("ok");
        JButton jbCancel =  new JButton("Cancel");          //gui练习
        JLabel jlbName = new JLabel("Enter your Name");
        JTextField jTextField  = new JTextField("Type Name Here");
        JCheckBox jchekBold = new JCheckBox("Bold");
        JCheckBox jcheckItalic =  new JCheckBox("Italic");
        JRadioButton jrbRed = new JRadioButton("Red");
        JRadioButton jrbYellow = new JRadioButton("Yellow");
        JComboBox jcboColor =  new JComboBox(new String[]{"Freshman","Sophomore,","Junior","Senior"});
        JPanel jPanel = new JPanel();
        jPanel.add(jbOk);
        jPanel.add(jbCancel);
        jPanel.add(jlbName);
        jPanel.add(jTextField);
        jPanel.add(jchekBold);
        jPanel.add(jcheckItalic);
        jPanel.add(jrbYellow);
        jPanel.add(jrbRed);
        jPanel.add(jcboColor);
        JFrame jFrame = new JFrame();
        jFrame.add(jPanel);
        jFrame.setTitle("Show Gui Components");
        jFrame.setSize(450,100);
        jFrame.setLocation(200,100);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
