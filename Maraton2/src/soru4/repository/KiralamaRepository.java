package soru4.repository;

import java.util.List;

import soru4.repository.entity.Kiralama;
import soru4.repository.entity.Kitap;
import soru4.repository.entity.Musteri;
import soru4.repository.exceptions.KitapException;
import soru4.repository.exceptions.MusteriException;
import soru4.utility.Database;

public class KiralamaRepository implements IKiralamaRepository {

	@Override
	public void save(Object o) {
		if (o instanceof Musteri) {
			Database.musteriListesi.add((Musteri) o);
		} else if (o instanceof Kitap) {
			Database.kitapListesi.add((Kitap) o);
		}
	}

	@Override
	public void musteriListele() {
		System.out.println(Database.musteriListesi);
	}

	@Override
	public Object musteriAra(String id) {
		for (Musteri musteri : Database.musteriListesi) {
			if (musteri.getId().equals(id)) {
				System.out.println("Musteri bulundu: ");
				return musteri;
			} else {
				try {
					throw new MusteriException("Boyle bir Musteri yok!");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public Object kitapAra(String id) {
		for (Kitap kitap : Database.kitapListesi) {
			if (kitap.getId().equals(id)) {
				System.out.println("Kitap bulundu: ");
				return kitap;
			} else {
				try {
					throw new KitapException("Boyle bir Kitap yok!");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	public void kiralamaYap(String kasiyerId, String musteriId, String kitapId) {
		Kiralama kiralama = new Kiralama(kasiyerId, musteriId, kitapId);

		for (Kitap kitap : Database.kitapListesi) {
			if (!kitap.isKiralandiMi()) {
				Database.kiralamaListesi.add(kiralama);
				Database.kiralananKitapListesi.add(kitap);
				kitap.setKiralandiMi(true);

			}
		}

	}

	public List<Kitap> kiralananKitapListesi() {
		return Database.kiralananKitapListesi;
	}

}