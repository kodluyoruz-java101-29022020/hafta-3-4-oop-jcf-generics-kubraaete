
public class IkiYonlu <T>{
	private LinkedListAlgoritmasi ilk; // ilk veriyi tutan referans
	private LinkedListAlgoritmasi son; // son veriyi tutan referans

	public IkiYonlu() // Liste yap�land�r�c�s�
	{
		ilk = null; //  Listeyi bo� olarak tan�ml�yoruz.
		son = null;
	}
	
	public boolean bosMu() // Liste doluluk kontrol�
	{
		return ilk == null;
	}
	public void basaEkle(T deger) // Listenin ba��na ekleme fonksiyonu
	{
		LinkedListAlgoritmasi yeniDugum = new LinkedListAlgoritmasi(deger); // yeni d���m olu�turuluyor

		if (bosMu()) // Listenin bo�luk kontrol�
			son = yeniDugum;
		else
	    ilk.onceki = yeniDugum; // Eski ilk ile yer de�i�iyor
		yeniDugum.sonraki = ilk; 
		ilk = yeniDugum; 
	}
	public void sonaEkle(T deger) // Listenin sonuna ekleme fonksiyonu
	{
		LinkedListAlgoritmasi yeniDugum = new LinkedListAlgoritmasi(deger); // yeni d���m olu�turuyoruz.
		if (bosMu()) //Listenin bo�luk kontrol�
			ilk = yeniDugum; 
		else {
			son.sonraki = yeniDugum; // son ile yeni d���m yer de�i�iyor.
			yeniDugum.onceki = son;
		}
		son = yeniDugum; 
	}
	public LinkedListAlgoritmasi bastanSil() // Ba�taki veri silme fonksiyonu
	{
		LinkedListAlgoritmasi yedek = ilk;
		if (ilk.sonraki == null) // E�er sadece 1 veri varsa
			son = null; // sonuncuyu bo�a ��kart�yoruz.
		else
	    ilk.sonraki.onceki = null; 
		ilk = ilk.sonraki; 
		return yedek;
	}
	public LinkedListAlgoritmasi sondanSil() // Sondan silme fonksiyonu
	{ 
		LinkedListAlgoritmasi yedek = son;
		if (ilk.sonraki == null) // E�er sadece 1 veri varsa
			ilk = null; // ilk veri bo�a ��k�yor
		else
			son.onceki.sonraki = null;
		son = son.onceki;
		return yedek;
	}
	public boolean arkasinaEkle(T anahtar, T deger) { 
		LinkedListAlgoritmasi aktif = ilk;
		while (aktif.veri != anahtar) // E�le�me bulunana kadar
		{
			aktif = aktif.sonraki; // her seferinde d�ng� d�nd�r�yoruz
			if (aktif == null)
				return false; // Bulunmay�nca false d�n�yor
		}
		LinkedListAlgoritmasi yeniDugum = new LinkedListAlgoritmasi(deger); 

		if (aktif == son) //
		{
			yeniDugum.sonraki = null; 
			son = yeniDugum;
		} else
		{
			yeniDugum.sonraki = aktif.sonraki; 
						
			aktif.sonraki.onceki = yeniDugum;
		}
		yeniDugum.onceki = aktif; 
		aktif.sonraki = yeniDugum; 
		return true; 
	}
	public LinkedListAlgoritmasi seciliSil(T anahtar) // Se�ili s�radaki eleman� silmek i�in kullan�lan fonksiyon
	{ 
		LinkedListAlgoritmasi aktif = ilk; 
		while (aktif.veri != anahtar) // E�le�me bulana kadar
		{
			aktif = aktif.sonraki; // D�ng� s�rekli bir sonrakine aktar�l�yor
			if (aktif == null)
				return null; // e�le�me bulunamad�
		}
		if (aktif == ilk) 
			ilk = aktif.sonraki; 
		else 
				
			aktif.onceki.sonraki = aktif.sonraki;

		if (aktif == son) 
			son = aktif.onceki; 
		else 
			
			aktif.sonraki.onceki = aktif.onceki;
		return aktif; // Bulunan de�er d�nd�r�l�yor
	}
	public void yazdir() {
		System.out.println("Liste : ");
		LinkedListAlgoritmasi aktif = ilk; 
		while (aktif != null) // Listenin sonuna kadar kontrol ediliyor
		{
			aktif.print(); // Veri yazd�r�l�yor
			aktif = aktif.sonraki; // D�ng� d�nd�r�l�yor
		}
		System.out.println("");
	}



}
