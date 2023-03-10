package ScoalaSoferi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.border.Border;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

//import com.mysql.cj.xdevapi.Statement;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.*;

public class Interogare1 extends JFrame implements ActionListener {
    //private static final String Color = null;
	JPanel p = new JPanel();
	 Color c = new Color(100,149,237);
	Color c2 = new Color(25,25,112);
	Color c3 = new Color(173,216,230);
    JTextField chestionarTxt = new JTextField();
    Border border = BorderFactory.createLineBorder(c3);
    JButton cautaBtn = new JButton("Caută");
    JLabel titlu= new JLabel("<html>Să se găsească din Întrebări_Chestionar, id_i pentru <br> chestionarul cu id_c = (introduceți numărul) ordonat\r\n"
    		+ "<br>descrescător după nr_ordine.</html>");
    
   
	public Interogare1()
	{
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  	this.setSize(450, 350);
	    this.setTitle("Interogare 1");
	    
	    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
        

        titlu.setBounds((p.getWidth() - 200)/2, 10, 650, 55); 
    	titlu.setFont(new Font("TimesNewRoman", Font.BOLD, 14));
    	titlu.setHorizontalAlignment(SwingConstants.CENTER);
    	titlu.setForeground(c2);
        p.add(titlu);
            
		chestionarTxt.setBounds(100, 100, 250, 30);
        chestionarTxt.setBorder(border);
        chestionarTxt.setBackground(c3);
        p.add(chestionarTxt);

        cautaBtn.setBounds((this.getWidth() - 80)/2, 200, 80, 35);
		cautaBtn.setBorder(border); 
		cautaBtn.setBackground(c2);
		cautaBtn.setForeground(Color.WHITE);
		cautaBtn.setFont(new Font("TimesNewRoman", Font.PLAIN, 20));
		cautaBtn.setPreferredSize(new Dimension(90, 60));
		cautaBtn.setBorder(border); 
		p.add(cautaBtn);
		
		p.setBackground(c);
		
		cautaBtn.addActionListener(this);
	
        this.setContentPane(p);
        this.setLayout(null);
        this.setVisible(true);
        
	}
        @Override
    	public void actionPerformed(ActionEvent e) {

            if(e.getSource() == cautaBtn)
            {
                this.setVisible(false);
                Connection connection = null;
                Statement selectStatement1 = null;
                ResultSet rs1 = null;
                ResultSetMetaData md=null;
                Vector ColumnNames= new Vector();
                Vector Data= new Vector();
                
                try {
                    connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/scoala_soferi?user=root&password=ACEGIF25&serverTimezone=UTC");
                    selectStatement1 = connection.createStatement();
                    selectStatement1.execute("SELECT NR_ORDINE, ID_I FROM Intrebari_Chestionar WHERE ID_C=\"" + chestionarTxt.getText() + "\" ORDER BY NR_ORDINE DESC;");
                    rs1 = selectStatement1.getResultSet();
                    md=(ResultSetMetaData) rs1.getMetaData();
                    if ( !rs1.isBeforeFirst())
                    {
                    	JOptionPane.showInternalMessageDialog(p, "Chestionarul cu identificatorul dat nu există!", "EROARE", JOptionPane.WARNING_MESSAGE);
                    	
                    }
                    else
                    {int columns=md.getColumnCount();
                    for(int i=1;i<=columns;i++)
                    {
                    		ColumnNames.addElement(md.getColumnName(i));
                    }
                    while(rs1.next())
                    {
                    	Vector Row= new Vector(columns);
                    	for(int i=1;i<=columns;i++)
                    	{
                    		Row.addElement(rs1.getObject(i));
                    	}
                    
                    Data.addElement(Row);
                    }
                        new Rezultat1(Data, ColumnNames);
                    
               
                    }
                }
                catch(SQLException sqlex) {
                    System.err.println("An SQL Exception occured. Details are provided below:");
                    sqlex.printStackTrace(System.err);
                }
                finally {
                    if (rs1 != null) {
                        try {
                            rs1.close();
                        }
                        catch(SQLException e1) {
                        }
                        rs1 = null;
                    }
                    if (selectStatement1 != null) {
                        try {
                            selectStatement1.close();
                        }
                        catch(SQLException e1) {}
                        selectStatement1 = null;
                    }
                    if (connection != null) {
                        try {
                            connection.close();
                        }
                        catch(SQLException e1) {}
                        connection = null;
                    }
                }
    	}
            
	
        }
}


