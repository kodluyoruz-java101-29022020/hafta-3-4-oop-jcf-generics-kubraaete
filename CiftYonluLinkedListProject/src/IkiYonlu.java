
public class IkiYonlu <T>{
	private LinkedListAlgoritmasi ilk; // ilk veriyi tutan referans
	private LinkedListAlgoritmasi son; // son veriyi tutan referans

	public IkiYonlu() // Liste yapýlandýrýcýsý
	{
		ilk = null; //  Listeyi boþ olarak tanýmlýyoruz.
		son = null;
	}
	
	public boolean bosMu() // Liste doluluk kontrolü
	{
		return ilk == null;
	}
	public void basaEkle(T deger) // Listenin baþýna ekleme fonksiyonu
	{
		LinkedListAlgoritmasi yeniDugum = new LinkedListAlgoritmasi(deger); // yeni düðüm oluþturuluyor

		if (bosMu()) // Listenin boþluk kontrolü
			son = yeniDugum;
		else
	    ilk.onceki = yeniDugum; // Eski ilk ile yer deðiþiyor
		yeniDugum.sonraki = ilk; 
		ilk = yeniDugum; 
	}
	public void sonaEkle(T deger) // Listenin sonuna ekleme fonksiyonu
	{
		LinkedListAlgoritmasi yeniDugum = new LinkedListAlgoritmasi(deger); // yeni düðüm oluþturuyoruz.
		if (bosMu()) //Listenin boþluk kontrolü
			ilk = yeniDugum; 
		else {
			son.sonraki = yeniDugum; // son ile yeni düðüm yer deðiþiyor.
			yeniDugum.onceki = son;
		}
		son = yeniDugum; 
	}
	public LinkedListAlgoritmasi bastanSil() // Baþtaki veri silme fonksiyonu
	{
		LinkedListAlgoritmasi yedek = ilk;
		if (ilk.sonraki == null) // Eðer sadece 1 veri varsa
			son = null; // sonuncuyu boþa çýkartýyoruz.
		else
	    ilk.sonraki.onceki = null; 
		ilk = ilk.sonraki; 
		return yedek;
	}
	public LinkedListAlgoritmasi sondanSil() // Sondan silme fonksiyonu
	{ 
		LinkedListAlgoritmasi yedek = son;
		if (ilk.sonraki == null) // Eðer sadece 1 veri varsa
			ilk = null; // ilk veri boþa çýkýyor
		else
			son.onceki.sonraki = null;
		son = son.onceki;
		return yedek;
	}
	public boolean arkasinaEkle(T anahtar, T deger) { 
		LinkedListAlgoritmasi aktif = ilk;
		while (aktif.veri != anahtar) // Eþleþme bulunana kadar
		{
			aktif = aktif.sonraki; // her seferinde döngü döndürüyoruz
			if (aktif == null)
				return false; // Bulunmayýnca false dönüyor
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
	public LinkedListAlgoritmasi seciliSil(T anahtar) // Seçili sýradaki elemaný silmek için kullanýlan fonksiyon
	{ 
		LinkedListAlgoritmasi aktif = ilk; 
		while (aktif.veri != anahtar) // Eþleþme bulana kadar
		{
			aktif = aktif.sonraki; // Döngü sürekli bir sonrakine aktarýlýyor
			if (aktif == null)
				return null; // eþleþme bulunamadý
		}
		if (aktif == ilk) 
			ilk = aktif.sonraki; 
		else 
				
			aktif.onceki.sonraki = aktif.sonraki;

		if (aktif == son) 
			son = aktif.onceki; 
		else 
			
			aktif.sonraki.onceki = aktif.onceki;
		return aktif; // Bulunan deðer döndürülüyor
	}
	public void yazdir() {
		System.out.println("Liste : ");
		LinkedListAlgoritmasi aktif = ilk; 
		while (aktif != null) // Listenin sonuna kadar kontrol ediliyor
		{
			aktif.print(); // Veri yazdýrýlýyor
			aktif = aktif.sonraki; // Döngü döndürülüyor
		}
		System.out.println("");
	}



}
