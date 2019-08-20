package snakegame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JLabel;

public class Kutu extends JLabel {
	
	public int mGenislik = 20;
	
	public int mYon = YON.SAG;
	
	Kutu(){
		setBounds(100, 100, mGenislik, mGenislik);
	}
	
	@Override
	public void paint(Graphics g) {

		Graphics2D g2 = (Graphics2D)g;
		
		Rectangle2D rect = new Rectangle2D.Double(1, 1, getWidth()-2, getHeight()-2);
		
		
		g2.setColor(Color.black);
		
		g2.setStroke(new BasicStroke(2));
		
		g2.draw(rect);
		
		g2.setColor(Color.red);
		
		g2.fill(rect);
	}
	
	public void SolaGit() {
		int PosX = getX();
		int PosY = getY();
		
		PosX-= mGenislik;
		setBounds(PosX, PosY, mGenislik, mGenislik);
	}
	
	public void SagaGit() {
		int PosX = getX();
		int PosY = getY();
		
		PosX+= mGenislik;
		setBounds(PosX, PosY, mGenislik, mGenislik);
	}
	
	public void YukariGit() {
		int PosX = getX();
		int PosY = getY();
		
		PosY-= mGenislik;
		setBounds(PosX, PosY, mGenislik, mGenislik);
	}
	
	public void AsagiGit() {
		int PosX = getX();
		int PosY = getY();
		
		PosY+= mGenislik;
		setBounds(PosX, PosY, mGenislik, mGenislik);
	}
	
	public Kutu KutuOlustur() {
		
		Kutu K = new Kutu();
		
		int X = getX();
		int Y = getY();
		
		K.setBounds(X, Y, mGenislik, mGenislik);
		
		K.mYon = -mYon;
		
		K.Hareket();
		
		K.mYon = mYon;
		
		return K;
	}
	
	public void Hareket() {
		
		if(mYon == YON.SOL)		SolaGit();
	
		else if(mYon == YON.SAG) 	SagaGit();
		
		else if(mYon == YON.ASAGI)	AsagiGit();
		
		else 	YukariGit();
	}

}
