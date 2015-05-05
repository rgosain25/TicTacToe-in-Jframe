
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


 class Mouse_Listener extends Applet implements MouseListener,ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String s;
	@Override
	public void init() {
		setLayout(null);
	addMouseListener(this);
		
		
		
	}
	@Override
	
	public void actionPerformed(ActionEvent e) {
		
		
	};
	public void paint(Graphics g) {
		setBackground(Color.black);
		setForeground(Color.WHITE);
		g.drawString(s,10,10);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		s="mouseclicked";
		repaint();
			
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		s="mouseentered";
		repaint();
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		s="mouseExited";
		repaint();
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		s="mousepressed";
		repaint();
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		s="mousereleased";
		repaint();
		// TODO Auto-generated method stub
		
	}
	

}
