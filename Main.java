
public class Main {
	public static void main(String[] args) {
		IkiYonlu liste = new IkiYonlu();

		liste.basaEkle(22); 
		liste.basaEkle(44);
		liste.basaEkle(66);

		liste.sonaEkle(11);
		liste.sonaEkle(33);
		liste.sonaEkle(55);

		liste.yazdir();

		liste.bastanSil(); // Ýlk veri siliniyor
		liste.sondanSil(); // Son veri siliniyor
		liste.seciliSil(11); // "11" etiketine sahip veri siliniyor

		liste.yazdir(); 
		System.out.println("-----------------------------");

		liste.arkasinaEkle(22, 77); // 22 ' den sonra 77 ekleniyor.
		liste.arkasinaEkle(33, 88); // 33'den sonra 88 ekleniyor.

		liste.yazdir(); 
	}

}
