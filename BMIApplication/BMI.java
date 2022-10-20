import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.Insets;
public class BMI extends JFrame
{

//buttons
    JButton calcuButton = new JButton();
    JButton clrButton = new JButton();
    JButton exitButton = new JButton();

//labels
    JLabel heightL = new JLabel();
    JLabel weightL = new JLabel();
    JLabel hL = new JLabel();
    JLabel wL = new JLabel();
    JLabel BMIL = new JLabel();

//textfields
    JTextField heightTextField = new JTextField();
    JTextField weightTextField = new JTextField();
    JTextField BMITextField = new JTextField();

//arrange gridbaglayout (x(column), y(row))

//value
    double height;
    double weight;
public BMI()
{
    calcuButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        calcuButtonActionPerformed(e);

}
});

    clrButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        clrButtonActionPerformed(e);

}
});

    exitButton.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        exitButtonActionPerformed(e);

}
});
//add controls
setTitle("BMI Calculation");

getContentPane().setLayout(new GridBagLayout());

GridBagConstraints gridConstraints = new GridBagConstraints();
gridConstraints.insets = new Insets(5,5,5,5);
calcuButton.setText("Compute BMI");
gridConstraints.gridx = 0;
gridConstraints.gridy = 3;
getContentPane().add(calcuButton,gridConstraints);

clrButton.setText("Clear");
gridConstraints.gridx = 1;
gridConstraints.gridy = 3;
getContentPane().add(clrButton,gridConstraints);

exitButton.setText("Exit");
gridConstraints.gridx = 2;
gridConstraints.gridy = 3;
getContentPane().add(exitButton,gridConstraints);

heightL.setText("Height: ");
gridConstraints.gridx = 0;
gridConstraints.gridy = 0;
getContentPane().add(heightL,gridConstraints);

weightL.setText("Weight: ");
gridConstraints.gridx = 0;
gridConstraints.gridy = 1;
getContentPane().add(weightL,gridConstraints);

BMIL.setText("BMI: ");
gridConstraints.gridx = 0;
gridConstraints.gridy = 2;
getContentPane().add(BMIL,gridConstraints);

heightTextField.setText("");
gridConstraints.gridx = 1;
gridConstraints.gridy = 0;
gridConstraints.gridwidth = 2;
gridConstraints.fill = GridBagConstraints.HORIZONTAL;
getContentPane().add(heightTextField,gridConstraints);

wL.setText("pounds");
gridConstraints.gridx = 3;
gridConstraints.gridy = 1;
getContentPane().add(wL,gridConstraints);

hL.setText("meters");
gridConstraints.gridx = 3;
gridConstraints.gridy = 0;
getContentPane().add(hL,gridConstraints);

weightTextField.setText("");
gridConstraints.gridx = 1;
gridConstraints.gridy = 1;
gridConstraints.gridwidth = 2;
gridConstraints.fill = GridBagConstraints.HORIZONTAL;
getContentPane().add(weightTextField,gridConstraints);

BMITextField.setText("");
gridConstraints.gridx = 1;
gridConstraints.gridy = 2;
gridConstraints.gridwidth = 2;
gridConstraints.fill = GridBagConstraints.HORIZONTAL;
getContentPane().add(BMITextField,gridConstraints);

pack();


}
    public void calcuButtonActionPerformed(ActionEvent e){
        String h = heightTextField.getText();
        String w = weightTextField.getText();
        
        double x = Integer.parseInt(w);
        double y = Integer.parseInt(h);
        
        
        double height_sqr = y*y;
        
        double res = (x / height_sqr) * 703;
        
        String str = Double.toString(res);
        //JFrame resf;
        //resf = new JFrame("BMI Calculator");
        //JOptionPane.showMessageDialog(null, res);
        BMITextField.setText(str);
   
}
    public void clrButtonActionPerformed(ActionEvent e){
        if (e.getSource() == clrButton){
            heightTextField.setText("");
            weightTextField.setText("");
            BMITextField.setText("");
        }
}

    public void exitButtonActionPerformed(ActionEvent e){
        JFrame exit;
        exit = new JFrame();
        JOptionPane.showMessageDialog(null, "Exit BMI Calculator");
        exit.setDefaultCloseOperation(EXIT_ON_CLOSE);
}

    public static void main(String[] args){
        new BMI().show();
}
}