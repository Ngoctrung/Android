import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AWT_accumulator extends Frame implements  ActionListener,WindowListener{

	
	//-------------
	
		public void windowClosing(WindowEvent evt) {
			System.exit(0);
		}
		public void windowOpened(WindowEvent evt) {}
		public void windowClosed(WindowEvent evt) {	}
		public void windowActivated(WindowEvent evt) {}
		public void windowDeactivated(WindowEvent evt) {}
		public void windowIconified(WindowEvent evt) {}
		public void windowDeiconified(WindowEvent evt) {}
		
	//--------
		  private TextField tfIn;  
		  private TextField tfOut;  
		  int kq = 0;
	//--------
		  public AWT_accumulator() {		  
			  
			  Frame sFrame = new Frame();
		        sFrame.setTitle("AWT Counter");
		        //
		        sFrame.setSize(400,150);
		        
		        // tao layout		        
		        sFrame.setLayout(new GridLayout(4,2));
		        //tao panel    			
		        Panel pnl = new Panel ();  		                		     
		        // lable1
		        Label lbl = new Label ("Enter an interger");
		        //TextField
		        tfIn = new TextField(10);
		        pnl.add(lbl);
		        pnl.add(tfIn);
		        sFrame.add(pnl);
		        //tao panel2
		        Panel pnl2 = new Panel ();  
		        // lable2
		        Label lbl2 = new Label ("Accumulator sum is");
		        //TextField2
		        tfOut = new TextField(10);
		        pnl2.add(lbl2);
		        pnl2.add(tfOut);
		        sFrame.add(pnl2);		        	        
		        //
		        tfIn.addActionListener(this);
		        tfOut.setEditable(false);
		       sFrame.addWindowListener(this);
		       sFrame.setTitle("AWT Accumulator"); 
		       sFrame. setSize(400, 140);         
		       sFrame.setVisible(true);         
		    }
		  	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AWT_accumulator();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(tfIn.getText());
		kq += n;
		tfOut.setText(""+kq);
	}
	

}
