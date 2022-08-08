package soru5;

import java.util.List;
import java.util.stream.Collectors;

import soru4.repository.entity.Kiralama;
import soru4.repository.entity.Kitap;
import soru4.repository.entity.Musteri;
import soru4.utility.Database;

public class KitapIslemleri {

	public List<Musteri> kimKiralamis(String id) {

		List<Kiralama> kiralamaBul = (Database.kiralamaListesi.stream().filter(x -> x.getKitapId().equals(id))
				.toList());
		List<Musteri> kiralayan = Database.musteriListesi.stream()
				.filter(l -> l.getId().equals(kiralamaBul.get(0).getMusteriId())).toList();
		System.out.println(
				id + " id li kitabi kiralayan " + kiralayan.get(0).getAd() + " " + kiralayan.get(0).getSoyad());
		return kiralayan;
	}

	public List<Musteri> onceKimlerKiralamis(String kitapIsmi) {

		Kitap kitap = Database.kitapListesi.stream().filter(x -> x.getIsim().equals(kitapIsmi)).toList().get(0);

		List<String> kiralayanMusteriIdleri = Database.kiralamaListesi.stream()
				.filter(a -> a.getKitapId().equals(kitap.getId())).map(w -> w.getMusteriId()).toList();

		String idler = kiralayanMusteriIdleri.stream().collect(Collectors.joining());
		List<Musteri> sonucMusteriler = Database.musteriListesi.stream().filter(s -> idler.contains(s.getId()))
				.toList();

		return sonucMusteriler;
	}

	public List<Musteri> ahmMusteri(List<Musteri> musteriler) {

		return musteriler.stream().filter(x -> x.getAd().startsWith("ahm")).toList();
	}

	public List<Kitap> kiraladiklariniBul(String id) {

		List<String> kitapIdleri = Database.kiralamaListesi.stream().filter(x -> x.getMusteriId().equals(id))
				.map(d -> d.getKitapId()).toList();
		String idler = kitapIdleri.stream().collect(Collectors.joining());
		List<Kitap> sonuc = Database.kitapListesi.stream().filter(e -> idler.contains(e.getId())).toList();
		return sonuc;
	}
}
