package soru4.repository.entity;

public class Musteri extends Kisi {

	public Musteri(String ad, String soyad) {
		super(ad, soyad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Musteri [getAd()=" + getAd() + ", getSoyad()=" + getSoyad() + ", getId()=" + getId() + "]";
	}

}
