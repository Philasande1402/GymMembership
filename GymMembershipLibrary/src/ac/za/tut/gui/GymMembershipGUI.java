package ac.za.tut.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class GymMembershipGUI extends JFrame{
    
    //Panel
    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel idnoPnl;
    private JPanel ganderPnl;
    private JPanel clientPnl;
    private JPanel typePnl;
    private JPanel selectPnl;
    private JPanel contactPnl;
    private JPanel memberPnl;
    private JPanel btnPnl;
    
    private JPanel otherPnl;
    private JPanel firstPnl;
    private JPanel secondPnl;
    
    //Label
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel idnoLbl;
    private JLabel generLbl;
    private JLabel typeOfContract;
    private JLabel checkBoxLbl;
    
    //Fields
    private JTextField nameTxt;
    private JTextField surnameTxt;
    private JTextField idnoTxt;
    
    //ComboBox
    private JComboBox combBox;
    
    //RadioButton and check box
    private JRadioButton monthTomonth;
    private JRadioButton sixMonth;
    private JRadioButton annual;
    
    private JCheckBox checkBox;
    
    //TextArea
    private JTextArea textAreaTxt;
    
    //Button
    private  JButton registerBtn;
    private  JButton searchBtn;
    private  JButton updateBtn;
    private  JButton removeBtn;
    private  JButton displayBtn;
    private  JButton clearBtn;
    private  JButton exitBtn;
    private ButtonGroup groupBtn;

    
    public GymMembershipGUI()
    {
        setTitle("Gym membership");
        setResizable(true);
        setSize(700, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingLbl = new JLabel("Membership Form");
        headingLbl.setForeground(Color.BLUE);
        headingLbl.setBorder(new BevelBorder(BevelBorder.RAISED));
        headingLbl.setFont(new Font(Font.SANS_SERIF, Font.BOLD+Font.ITALIC, 18));
        headingPnl.add(headingLbl);
        add(headingPnl,BorderLayout.NORTH);
        
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        nameLbl = new JLabel("Name : ");
        nameTxt = new JTextField(20);
        nameTxt.setFocusable(true);
        namePnl.add(nameLbl);
        namePnl.add(nameTxt);
        
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnameLbl = new JLabel("Surname : ");
        surnameTxt = new JTextField(20);
        surnameTxt.setFocusable(true);
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxt);
        
        idnoPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idnoLbl = new JLabel("Id no : ");
        idnoTxt = new JTextField(20);
        idnoTxt.setFocusable(true);
        idnoPnl.add(idnoLbl);
        idnoPnl.add(idnoTxt);
        
        ganderPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        generLbl = new JLabel("Gender : ");
        String[] names={"Male","Female","Other"};
        combBox = new JComboBox(names);
        ganderPnl.add(generLbl);
        ganderPnl.add(combBox);
        
        clientPnl = new JPanel(new GridLayout(4, 1, 1, 1));
        clientPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 4),"Client details"));
        clientPnl.add(namePnl);
        clientPnl.add(surnamePnl);
        clientPnl.add(idnoPnl);
        clientPnl.add(ganderPnl);
        
        firstPnl = new JPanel(new BorderLayout());
        firstPnl.add(clientPnl,BorderLayout.NORTH);
        add(firstPnl);
        
        typePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        monthTomonth = new JRadioButton("Month-to-month");
        sixMonth = new JRadioButton("Six-month");
        annual = new JRadioButton("Annual");
        typePnl.add(monthTomonth);
        typePnl.add(sixMonth);
        typePnl.add(annual);
        
        groupBtn = new ButtonGroup();
        groupBtn.add(monthTomonth);
        groupBtn.add(sixMonth);
        groupBtn.add(annual);
        
        selectPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        checkBoxLbl = new JLabel("Select the checkBox if you need a personal trainer ");
        checkBox = new JCheckBox();
        selectPnl.add(checkBoxLbl);
        selectPnl.add(checkBox);
        
        contactPnl = new JPanel(new GridLayout(2, 1, 1, 1));
        contactPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 2),"Cntract details"));
        contactPnl.add(typePnl);
        contactPnl.add(selectPnl);
        
        memberPnl = new JPanel(new FlowLayout());
        memberPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1),"Member details"));
        textAreaTxt = new JTextArea(30, 40);
        textAreaTxt.setLineWrap(true);
        JScrollPane crol = new JScrollPane(textAreaTxt);
        
        memberPnl.add(crol);
        
        registerBtn = new JButton("REGISTER");
        searchBtn = new JButton("SEARCH");
        updateBtn = new JButton("UPDATE");
        removeBtn = new JButton("REMOVE");
        displayBtn = new JButton("DISPLAY ALL");
        clearBtn = new JButton("CLEAR");
        exitBtn = new JButton("EXIT");
        
        btnPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnPnl.add(registerBtn);
        btnPnl.add(searchBtn);
        btnPnl.add(updateBtn);
        btnPnl.add(removeBtn);
        btnPnl.add(displayBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        otherPnl = new JPanel(new FlowLayout());
        otherPnl.add(namePnl);
        secondPnl = new JPanel(new BorderLayout());
        //secondPnl.add(firstPnl);
        secondPnl.add(contactPnl,BorderLayout.NORTH);
        secondPnl.add(memberPnl,BorderLayout.CENTER);
        secondPnl.add(btnPnl,BorderLayout.SOUTH);
        
        add(secondPnl,BorderLayout.CENTER);
        
        pack();
        setVisible(true);
    }
    
}
