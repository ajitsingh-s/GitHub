package awt;
import java.awt.*;
import java.awt.event.*;

class calcy extends Frame implements ActionListener {
    TextField tf;
    Panel p;
    String button[] = { "7", "8", "9", "%", "AC", "4", "5", "6", "/", "x", "1", "2", "3", "-", "+", "00", "0", ".",
            "+/-", "=" };
    Button b[] = new Button[20];
    float input1 = 0, input2 = 0, result = 0;
    char operation;

    public calcy() {
        //Font f = new Font("Times New Roman", Font.BOLD, 16);
    	
        tf = new TextField(20);
        tf.setFont(new Font("null", Font.BOLD, 16));

        p = new Panel();
        add(tf, "North");
        add(p, "Center");

        p.setLayout(new GridLayout(4, 5));
        for (int i = 0; i < 20; i++) {
            b[i] = new Button(button[i]);
            b[i].setFont(new Font("null", Font.BOLD, 16));
            b[i].addActionListener(this);
            p.add(b[i]);
        }
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }

        });
        setSize(250, 300);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        if (s.equals("+")) {
            operation = '+';
            input1 = Float.parseFloat(tf.getText());
            tf.setText("");
        } else if (s.equals("-")) {
            operation = '-';
            input1 = Float.parseFloat(tf.getText());
            tf.setText("");
        } else if (s.equals("*")) {
            operation = '*';
            input1 = Float.parseFloat(tf.getText());
            tf.setText("");
        } else if (s.equals("/")) {
            operation = '/';
            input1 = Float.parseFloat(tf.getText());
            tf.setText("");
        } else if (s.equals("+")) {
            operation = '+';
            input1 = Float.parseFloat(tf.getText());
            tf.setText("");
        } else if (s.equals("%")) {
            operation = '%';
            input1 = Float.parseFloat(tf.getText());
            tf.setText("");
        } else if (s.equals("+/-")) {
            operation = '~';
            input1 = Float.parseFloat(tf.getText());
            tf.setText("");
        } else if (s.equals("=")) {
            input2 = Float.parseFloat(tf.getText());

            switch (operation) {
                case '+':
                    result = input1 + input2;
                    break;
                case '-':
                    result = input1 - input2;
                    break;
                case '*':
                    result = input1 * input2;
                    break;
                case '/':
                    result = input1 / input2;
                    break;
                case '%':
                    result = (input1 * input2) / 100;
                    break;
                case '~':
                    result = input1 - (input1 * 2);
                    break;
            }
            tf.setText(result + "");
            result = 0;
        } else if (s.equals("AC")) {
            tf.setText("");
            input1 = input2 = result = 0;
        } else {
            tf.setText(tf.getText() + s);
        }
    }

    public static void main(String[] args) {
        calcy c = new calcy();
        c.setTitle("My Calculator");
       
        
    }

    

}
