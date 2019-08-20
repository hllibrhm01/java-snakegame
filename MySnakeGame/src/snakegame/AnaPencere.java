package snakegame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class AnaPencere extends JFrame {
	
	
	private int mGenislik = 600;
	private int mYukseklik = 600;
		
		private static AnaPencere mPencere = null;	// programcı PencereGetir() fonksiyonunu her çağırdıgında yeni pencere oluşturulacak. bunu istemeyip sadece bir pencere olusturulmasını istedigimiz için bu  satırı yazıyoruz.
		
		private AnaPencere(){
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			SetDimension(mGenislik, mYukseklik);
			setResizable(false);
			
			Yilan Y = new Yilan();		

			add(Y);
			


		}
		
		public static AnaPencere PencereGetir() { //private AnaPencere'ye static olarak sınıf üretmeden ulasmamızı saglar.
			
			if(mPencere == null)
				mPencere = new AnaPencere();
			return mPencere;
		}
		
		public void SetDimension(int Genislik, int Yukseklik) { 
			// bu kod ile program hangi pc olursa olsun tam ortada çalışacak. pcnin ekran boyutlarını yakalmıs olduk.
			Dimension Dim = Toolkit.getDefaultToolkit().getScreenSize();
			
			int PosX = 0;
			int PosY = 0;
			
			if(mGenislik+100 > Dim.width)
				Genislik = Dim.width-100;
			
			if(mYukseklik+100 > Dim.height)
				mYukseklik = Dim.height-100;
			
			PosX = (Dim.width-mGenislik)/2;
			PosY = (Dim.height-mYukseklik)/2;
			
			setBounds(PosX, PosY, mGenislik, mYukseklik);
		}
		
		
		
		
		
		
		

}
