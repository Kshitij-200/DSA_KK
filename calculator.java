package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator {
    private JFrame frame;
    private JTextField textfield;

    double first,second,result;
    String operation,answer;
    //private final ButtonGroup buttonGroup = new ButtonGroup();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            public void run() {
                try {
                    calculator window=new calculator();
                    window.frame.setVisible(true);
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public calculator() {
        initialize();
    }
    private void initialize() {
        Font myfont=new Font("Tahoma", Font.BOLD,18);

// CREATING FRAME
        frame=new JFrame("Calulator Jazib");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setForeground(Color.WHITE);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setForeground(Color.BLACK);
        frame.setBounds(100,100,357,539);

//CREATING A TEXT FIELD
        textfield=new JTextField();
        textfield.setFont(myfont);
        textfield.setEditable(false);
        textfield.setBounds(10,39,320,63);
        frame.getContentPane().add(textfield);
        //textfield.setForeground(Color.GREEN);
        textfield.setColumns(10);

//ADDING LABEL
        JLabel label=new JLabel("SCIENTIFIC CALCULATOR");
        label.setFont(myfont);
        label.setBounds(10,11,320,27);
        label.setForeground(Color.BLACK);
        frame.getContentPane().add(label);

// DECLARING NUMBER BUTTONS AND FUNCTION BUTTONS

        JButton b2=new JButton("2");
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String number=textfield.getText()+b2.getText();
                textfield.setText(number);
            }
        });
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(myfont);
        b2.setBounds(139, 398, 64, 50);
        frame.getContentPane().add(b2);

        JButton b1=new JButton("1");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textfield.getText()+b1.getText();
                textfield.setText(number);
            }
        });
        b1.setFont(myfont);
        b1.setBounds(74, 398, 64, 50);
        frame.getContentPane().add(b1);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        JButton b3=new JButton("3");
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textfield.getText()+b3.getText();
                textfield.setText(number);
            }
        });
        b3.setFont(myfont);
        b3.setBounds(202, 398, 64, 50);
        frame.getContentPane().add(b3);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);

        JButton b4=new JButton("4");
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textfield.getText()+b4.getText();
                textfield.setText(number);
            }
        });
        b4.setFont(myfont);
        b4.setBounds(74, 347, 64, 50);
        frame.getContentPane().add(b4);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);

        JButton b5=new JButton("5");
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textfield.getText()+b5.getText();
                textfield.setText(number);
            }
        });
        b5.setFont(myfont);
        b5.setBounds(139, 347, 64, 50);
        frame.getContentPane().add(b5);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);

        JButton b6=new JButton("6");
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textfield.getText()+b6.getText();
                textfield.setText(number);
            }
        });
        b6.setFont(myfont);
        b6.setBounds(202, 347, 64, 50);
        frame.getContentPane().add(b6);
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);

        JButton b7=new JButton("7");
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textfield.getText()+b7.getText();
                textfield.setText(number);
            }
        });
        b7.setFont(myfont);
        b7.setBounds(74, 295, 64, 50);
        frame.getContentPane().add(b7);
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);

        JButton b8=new JButton("8");
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textfield.getText()+b8.getText();
                textfield.setText(number);
            }
        });
        b8.setFont(myfont);
        b8.setBounds(139, 295, 64, 50);
        frame.getContentPane().add(b8);
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);

        JButton b9=new JButton("9");
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textfield.getText()+b9.getText();
                textfield.setText(number);
            }
        });
        b9.setFont(myfont);
        b9.setBounds(202, 295, 64, 50);
        frame.getContentPane().add(b9);
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);

        JButton b0=new JButton("0");
        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textfield.getText()+b0.getText();
                textfield.setText(number);
            }
        });
        b0.setFont(myfont);
        b0.setBounds(74, 449, 129, 50);
        frame.getContentPane().add(b0);
        b0.setBackground(Color.BLACK);
        b0.setForeground(Color.WHITE);

        //CLEAR BUTTONS
        JButton clear=new JButton("AC");
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textfield.setText(null);
            }
        });
        clear.setFont(myfont);
        clear.setBounds(139,243,64,50);
        frame.getContentPane().add(clear);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.GREEN);

        JButton bdot=new JButton(".");
        bdot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number=textfield.getText()+bdot.getText();
                textfield.setText(number);
            }
        });
        bdot.setFont(new Font("Tahoma",Font.BOLD,19));
        bdot.setBounds(202, 449, 64, 50);
        frame.getContentPane().add(bdot);
        bdot.setBackground(Color.BLACK);
        bdot.setForeground(Color.GREEN);

       			/*JButton clearAll=new JButton("CE");
    			clearAll.addActionListener(new ActionListener() {
    				public void actionPerformed(ActionEvent e) {
    					textfield.setText(null);
    				}
    			});
    			clearAll.setFont(myfont);
    			clearAll.setBounds(74, 243, 64, 50);
    			frame.getContentPane().add(clearAll);*/

        JButton backspace=new JButton("<x");
        backspace.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String back=null;
                if(textfield.getText().length()>0)
                {
                    StringBuilder str=new StringBuilder(textfield.getText());
                    str.deleteCharAt(textfield.getText().length()-1);
                    back=str.toString();
                    textfield.setText(back);
                }
            }
        });
        backspace.setFont(new Font("Tahoma", Font.BOLD, 15));
        backspace.setBounds(202, 243, 64, 50);
        frame.getContentPane().add(backspace);
        backspace.setBackground(Color.BLACK);
        backspace.setForeground(Color.GREEN);

// ARITHMETIC OPERATORS
        JButton plus=new JButton("+");
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first=Double.parseDouble(textfield.getText());
                textfield.setText("");
                operation="+";
            }
        });
        plus.setFont(myfont);
        plus.setBounds(266, 243, 64, 50);
        frame.getContentPane().add(plus);
        plus.setBackground(Color.BLACK);
        plus.setForeground(Color.GREEN);

        JButton minus=new JButton("-");
        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first=Double.parseDouble(textfield.getText());
                textfield.setText("");
                operation="-";
            }
        });
        minus.setFont(myfont);
        minus.setBounds(266, 295, 64, 50);
        frame.getContentPane().add(minus);
        minus.setBackground(Color.BLACK);
        minus.setForeground(Color.GREEN);

        JButton mul=new JButton("*");
        mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first=Double.parseDouble(textfield.getText());
                textfield.setText("");
                operation="*";
            }
        });
        mul.setFont(myfont);
        mul.setBounds(266, 347, 64, 50);
        frame.getContentPane().add(mul);
        mul.setBackground(Color.BLACK);
        mul.setForeground(Color.GREEN);

        JButton div=new JButton("/");
        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first=Double.parseDouble(textfield.getText());
                textfield.setText("");
                operation="/";
            }
        });
        div.setFont(myfont);
        div.setBounds(266, 398, 64, 50);
        frame.getContentPane().add(div);
        div.setBackground(Color.BLACK);
        div.setForeground(Color.GREEN);

        JButton btnXrx = new JButton("X^Y");
        btnXrx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                first=Double.parseDouble(textfield.getText());
                textfield.setText("");
                operation="xrx";
            }
        });

        btnXrx.setFont(new Font("Tahoma",Font.BOLD,13));
        btnXrx.setBounds(10, 243, 64, 50);
        frame.getContentPane().add(btnXrx);
        btnXrx.setBackground(Color.BLACK);
        btnXrx.setForeground(Color.GREEN);

        JButton per=new JButton("%");
        per.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first=Double.parseDouble(textfield.getText());
                textfield.setText("");
                operation="%";
            }
        });
        per.setFont(myfont);
        per.setBounds(74, 243, 64, 50);
        frame.getContentPane().add(per);
        per.setBackground(Color.BLACK);
        per.setForeground(Color.GREEN);

//FUNCTION BUTTONS
        JButton cosx=new JButton("cosh");
        cosx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a=Math.cosh(Double.parseDouble(textfield.getText()));
                textfield.setText(null);
                textfield.setText(textfield.getText()+a);
            }
        });
        cosx.setFont(new Font("Tahoma",Font.BOLD,12));
        cosx.setBounds(202, 191, 64, 50);
        frame.getContentPane().add(cosx);
        cosx.setBackground(Color.BLACK);
        cosx.setForeground(Color.GREEN);

        JButton Cos=new JButton("cos");
        Cos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a=Math.cos(Double.parseDouble(textfield.getText()));
                textfield.setText("");
                textfield.setText(textfield.getText()+a);
            }
        });
        Cos.setFont(new Font("Tahoma",Font.BOLD,15));
        Cos.setBounds(202, 139, 64, 50);
        frame.getContentPane().add(Cos);
        Cos.setBackground(Color.BLACK);
        Cos.setForeground(Color.GREEN);

        JButton sinx=new JButton("sinh");
        sinx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a=Math.sinh(Double.parseDouble(textfield.getText()));
                textfield.setText("");
                textfield.setText(textfield.getText()+a);
            }
        });
        sinx.setFont(new Font("Tahoma",Font.BOLD,12));
        sinx.setBounds(139, 191, 64, 50);
        frame.getContentPane().add(sinx);
        sinx.setBackground(Color.BLACK);
        sinx.setForeground(Color.GREEN);

        JButton Sin=new JButton("sin");
        Sin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a=Math.sin(Double.parseDouble(textfield.getText()));
                textfield.setText(null);
                textfield.setText(textfield.getText()+a);
            }
        });
        Sin.setFont(new Font("Tahoma",Font.BOLD,15));
        Sin.setBounds(139, 139, 64, 50);
        frame.getContentPane().add(Sin);
        Sin.setBackground(Color.BLACK);
        Sin.setForeground(Color.GREEN);

        JButton Tan=new JButton("tan");
        Tan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a=Math.tan(Double.parseDouble(textfield.getText()));
                textfield.setText("");
                textfield.setText(textfield.getText()+a);
            }
        });
        Tan.setFont(new Font("Tahoma",Font.BOLD,15));
        Tan.setBounds(266, 139, 64, 50);
        frame.getContentPane().add(Tan);
        Tan.setBackground(Color.BLACK);
        Tan.setForeground(Color.GREEN);

        JButton Tanx=new JButton("tanh");
        Tan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a=Math.tanh(Double.parseDouble(textfield.getText()));
                textfield.setText("");
                textfield.setText(textfield.getText()+a);
            }
        });
        Tanx.setFont(new Font("Tahoma",Font.BOLD,12));
        Tanx.setBounds(266, 191, 64, 50);
        frame.getContentPane().add(Tanx);
        Tanx.setBackground(Color.BLACK);
        Tanx.setForeground(Color.GREEN);

        JButton Ex=new JButton("ex");
        Ex.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a=Math.exp(Double.parseDouble(textfield.getText()));
                textfield.setText("");
                textfield.setText(textfield.getText()+a);
            }
        });
        Ex.setFont(new Font("Tahoma",Font.BOLD,15));
        Ex.setBounds(74, 139, 64, 50);
        frame.getContentPane().add(Ex);
        Ex.setBackground(Color.BLACK);
        Ex.setForeground(Color.GREEN);

        JButton Log=new JButton("ln");
        Log.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double a=Math.log(Double.parseDouble(textfield.getText()));
                textfield.setText("");
                textfield.setText(textfield.getText()+a);
            }
        });
        Log.setFont(new Font("Tahoma",Font.BOLD,15));
        Log.setBounds(74, 192, 64, 50);
        frame.getContentPane().add(Log);
        Log.setBackground(Color.BLACK);
        Log.setForeground(Color.GREEN);

        JButton cube=new JButton("x3");
        cube.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a=Double.parseDouble(textfield.getText());
                a=a*a*a;
                textfield.setText("");
                textfield.setText(textfield.getText()+a);
            }
        });
        cube.setFont(new Font("Tahoma",Font.BOLD,15));
        cube.setBounds(10, 295, 64, 50);
        frame.getContentPane().add(cube);
        cube.setBackground(Color.BLACK);
        cube.setForeground(Color.GREEN);

        JButton square=new JButton("x2");
        square.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a=Double.parseDouble(textfield.getText());
                a=a*a;
                textfield.setText("");
                textfield.setText(textfield.getText()+a);
            }
        });
        square.setFont(new Font("Tahoma",Font.BOLD,15));
        square.setBounds(10, 347, 64, 50);
        frame.getContentPane().add(square);
        square.setBackground(Color.BLACK);
        square.setForeground(Color.GREEN);

        JButton Xx=new JButton("1/x");
        Xx.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a=1/Math.sqrt(Double.parseDouble(textfield.getText()));
                textfield.setText("");
                textfield.setText(textfield.getText()+a);
            }
        });
        Xx.setFont(new Font("Tahoma",Font.BOLD,15));
        Xx.setBounds(9, 191, 64, 50);
        frame.getContentPane().add(Xx);
        Xx.setBackground(Color.BLACK);
        Xx.setForeground(Color.GREEN);

        JButton btnSqrt = new JButton("\u221A");
        btnSqrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a = Math.sqrt(Double.parseDouble(textfield.getText()));
                textfield.setText("");
                textfield.setText(textfield.getText()+a);
            }
        });
        btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnSqrt.setBounds(10, 139, 64, 50);
        frame.getContentPane().add(btnSqrt);
        btnSqrt.setBackground(Color.BLACK);
        btnSqrt.setForeground(Color.GREEN);

        JButton fact=new JButton("n!");
        fact.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a=(Double.parseDouble(textfield.getText()));
                double f=1;
                while(a!=0)
                {
                    f=f*a;
                    a--;
                }
                textfield.setText("");
                textfield.setText(textfield.getText()+f);
            }
        });
        fact.setFont(new Font("Tahoma",Font.BOLD,15));
        fact.setBounds(10,398,64,50);
        frame.getContentPane().add(fact);
        fact.setBackground(Color.BLACK);
        fact.setForeground(Color.GREEN);

        JButton button = new JButton("+/-");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                double a=Double.parseDouble(String.valueOf(textfield.getText()));
                a=a*(-1);
                textfield.setText(String.valueOf(a));

            }
        });
        button.setFont(new Font("Tahoma", Font.BOLD, 17));
        button.setBounds(10, 449, 64, 50);
        frame.getContentPane().add(button);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.GREEN);

        JButton equal=new JButton("=");
        equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String answer;
                second=Double.parseDouble(textfield.getText());
                if(operation=="+")
                {
                    result=first+second;
                    answer=String.format("%.2f", result);
                    textfield.setText(answer);
                }
                else if(operation=="-")
                {
                    result=first-second;
                    answer=String.format("%.2f", result);
                    textfield.setText(answer);
                }
                else if(operation=="*")
                {
                    result=first*second;
                    answer=String.format("%.2f", result);
                    textfield.setText(answer);
                }
                else if(operation=="/")
                {
                    result=first/second;
                    answer=String.format("%.2f", result);
                    textfield.setText(answer);
                }
                else if(operation=="%")
                {
                    result=first%second;
                    answer=String.format("%.2f", result);
                    textfield.setText(answer);
                }
                else if(operation=="X^Y")
                {
                    double result=1;
                    for(int i=0;i<second;i++)
                    {
                        result=first*result;
                        answer=String.format("%.2f", result);
                        textfield.setText(answer);
                    }
                }
            }
        });
        equal.setFont(myfont);
        equal.setBounds(266, 449, 64, 50);
        frame.getContentPane().add(equal);
        equal.setBackground(Color.BLACK);
        equal.setForeground(Color.GREEN);
    }
}
