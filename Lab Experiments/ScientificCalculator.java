import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

public class ScientificCalculator {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI();
            }
        });
    }
}

class CalculatorGUI {

    JFrame frmCalculator;
    JTextField textField;
    JLabel exprlabel;
    JPanel butttonPanel;
    boolean dot = true, num = true;
    StringBuilder expression = new StringBuilder();
    ArrayList<String> token = new ArrayList<>();
    String result = "0";

    CalculatorGUI() {
        initialize();
        frmCalculator.setVisible(true);
    }

    private void initialize() {
        frmCalculator = new JFrame("Calculator");
        frmCalculator.setBounds(200, 100, 400, 500);
        frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frmCalculator.getContentPane().add(panel);
        panel.setLayout(new BorderLayout(0, 0));

        textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Calibri Light", Font.PLAIN, 24));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setBackground(new Color(240, 240, 240));
        textField.setColumns(10);
        panel.add(textField, BorderLayout.NORTH);

        exprlabel = new JLabel("Result = ");
        exprlabel.setFont(new Font("Calibri Light", Font.PLAIN, 16));
        panel.add(exprlabel, BorderLayout.CENTER);

        butttonPanel = new JPanel();
        frmCalculator.getContentPane().add(butttonPanel, BorderLayout.CENTER);
        butttonPanel.setLayout(new GridLayout(4, 5, 5, 5));

        String[] buttonLabels = { "7", "8", "9", "/", "(", ")", "4", "5", "6", "*", "sqrt", "1", "2", "3", "-", "pi", "0", ".", "=", "+" };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonActionListener(label));
            butttonPanel.add(button);
        }
    }

    private class ButtonActionListener implements ActionListener {
        String label;

        ButtonActionListener(String label) {
            this.label = label;
        }

        public void actionPerformed(ActionEvent e) {
            if (label.equals("0")) {
                if ("0".equals(textField.getText())) {
                    textField.setText("0");
                } else {
                    textField.setText(textField.getText() + "0");
                    if (num) {
                        expression.append("0");
                    } else {
                        expression.append(",0");
                    }
                }
            } else if (label.equals(".")) {
                if (dot) {
                    textField.setText(textField.getText() + ".");
                    expression.append(".");
                }
            } else if (label.equals("=")) {
                calculateMain();
                String s = "";
                token.remove(token.size() - 1);
                for (String i : token) {
                    if (i.equals("/")) {
                        s += Character.toString((char) 247);
                    } else if (i.equals("sqrt")) {
                        s += Character.toString((char) 8730);
                    } else if (i.equals("pi")) {
                        s += Character.toString((char)1772); 
                    } else if (i.equals("(")) { 
                        s += Character.toString((char) 40); 
                    } else if (i.equals(")")) {
                        s += Character.toString((char) 41); 
                    } else { 
                        s += i; 
                    } 
                } 
                exprlabel.setText("Result = " + s);
                dot = true; num = true; 
            } else if (label.equals("sqrt")) {
                textField.setText(textField.getText() + "sqrt(");
                expression.append("sqrt("); num = false; 
            } else if (label.equals("pi")) {
                textField.setText(textField.getText() + "pi");
                expression.append("pi");
                dot = false; num = false;
            } else if (label.equals("+")) {
                textField.setText(textField.getText() + " + ");
                expression.append(" + "); num = true; 
            } else if (label.equals("-")) {
                textField.setText(textField.getText() + " - ");
                expression.append(" - "); num = true; 
            } else if (label.equals("*")) {
                textField.setText(textField.getText() + " * ");
                expression.append(" * "); num = true; } 
            else if (label.equals("/")) {
                textField.setText(textField.getText() + " / ");
                expression.append(" / "); num = true; 
            } else if (label.equals("(")) {
                textField.setText(textField.getText() + " (");
                expression.append(" ("); num = true; 
            } else if (label.equals(")")) {
                textField.setText(textField.getText() + " )");
                expression.append(" )"); num = false; 
            } else { 
                textField.setText(textField.getText() + label); 
                expression.append(label); dot = true; num = true; 
            } 
        } 
    }

private void calculateMain() {
    token = new ArrayList<>(Arrays.asList(expression.toString().split("")));
    while (token.contains(" ")) {
        token.remove(token.indexOf(" "));
    }
    for (int i = 0; i < token.size(); i++) {
        if (token.get(i).equals("(")) {
            while (!token.get(i + 1).equals(")")) {
                token.remove(i + 1);
            }
            token.remove(i + 1);
        }
    }
    while (token.contains(" ")) {
        token.remove(token.indexOf(" "));
    }
    while (token.contains("sqrt")) {
        token.remove(token.indexOf("sqrt") + 1);
        token.remove(token.indexOf("sqrt"));
        int sqrt = Integer.parseInt(token.get(token.indexOf("sqrt") + 1));
        token.remove(token.indexOf("sqrt") + 1);
        token.remove(token.indexOf("sqrt"));
        token.add(token.indexOf("sqrt"), Integer.toString((int) Math.sqrt(sqrt)));
    }
    while (token.contains("pi")) {
        token.remove(token.indexOf("pi") + 1);
        token.remove(token.indexOf("pi"));
        token.add(token.indexOf("pi"), Double.toString(Math.PI));
    }
    while (token.contains(".")) {
        token.remove(token.indexOf(".") + 1);
        token.remove(token.indexOf("."));
        double d1 = Double.parseDouble(token.get(token.indexOf(".") - 1));
        double d2 = Double.parseDouble(token.get(token.indexOf(".") + 1));
        token.remove(token.indexOf(".") - 1);
        token.remove(token.indexOf(".") + 1);
        token.add(token.indexOf(".") - 1, Double.toString(d1 / d2));
    }
    while (token.contains("/")) {
        token.remove(token.indexOf(null));    
        double d1 = Double.parseDouble(token.get(token.indexOf("/") - 1));
        double d2 = Double.parseDouble(token.get(token.indexOf("/") + 1));
        token.remove(token.indexOf("/") - 1);
        token.remove(token.indexOf("/") + 1);
        token.add(token.indexOf("/") - 1, Double.toString(d1 / d2));
    }
    while (token.contains("*")) {
        token.remove(token.indexOf("*"));

        double d1 = Double.parseDouble(token.get(token.indexOf("*") - 1));
        double d2 = Double.parseDouble(token.get(token.indexOf("*") + 1));
        token.remove(token.indexOf("*") - 1);
        token.remove(token.indexOf("*") + 1);
        token.add(token.indexOf("*") - 1, Double.toString(d1 * d2));
    }
    while (token.contains("+")) {
        token.remove(token.indexOf("+"));

        double d1 = Double.parseDouble(token.get(token.indexOf("+") - 1));
        double d2 = Double.parseDouble(token.get(token.indexOf("+") + 1));
        token.remove(token.indexOf("+") - 1);
        token.remove(token.indexOf("+") + 1);
        token.add(token.indexOf("+") - 1, Double.toString(d1 + d2));
    }
    while (token.contains("-")) {
        token.remove(token.indexOf("-"));

        double d1 = Double.parseDouble(token.get(token.indexOf("-") - 1));
        double d2 = Double.parseDouble(token.get(token.indexOf("-") + 1));
        token.remove(token.indexOf("-") - 1);
        token.remove(token.indexOf("-") + 1);
        token.add(token.indexOf("-") - 1, Double.toString(d1 - d2));
    }
    double result = Double.parseDouble(token.get(0));
    expression.setLength(0);
    expression.append(Double.toString(result));
    textField.setText(Double.toString(result));
}

public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            new Calculator();
        }
    });
}

}