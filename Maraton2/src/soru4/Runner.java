package soru4;

import soru4.repository.KiralamaRepository;
import soru4.repository.entity.Kasiyer;
import soru4.repository.entity.Kitap;
import soru4.repository.entity.Musteri;
import soru4.utility.Database;
import soru5.KitapIslemleri;

public class Runner {

	public static void main(String[] args) {
		KiralamaRepository kr = new KiralamaRepository();

		Musteri musteri = new Musteri("Mithat", "Orhan");
		kr.save(musteri);
		Musteri musteri3 = new Musteri("ahmet", "Orhan");
		kr.save(musteri3);

		kr.musteriListele();

		Kitap kitap = new Kitap("Kasagi", "Omer Seyfettin");
		kr.save(kitap);

		Kasiyer kasiyer = new Kasiyer("Kasiyer", "Mito");

		kr.kiralamaYap(kasiyer.getId(), musteri.getId(), kitap.getId());

		System.out.println("********** Kiralanan Kitap Listesi**********");
		System.out.println(kr.kiralananKitapListesi());
		System.out.println("********************************************");

		KitapIslemleri kitapIslemleri = new KitapIslemleri();

		System.out.println("******id verilen kitabi kim kiralamis Test******");
		System.out.println(kitapIslemleri.kimKiralamis(kitap.getId()));

		System.out.println("\n*********Kitabi Onceden Kimler Kiralamis Test**********");
		System.out.println(kitapIslemleri.onceKimlerKiralamis(kitap.getIsim()));
		System.out.println("************************************************");

		System.out.println("***ahm ile baslayan musteriler Test***");
		System.out.println(kitapIslemleri.ahmMusteri(Database.musteriListesi));
	}

}
