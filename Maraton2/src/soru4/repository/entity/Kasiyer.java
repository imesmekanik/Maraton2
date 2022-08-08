package soru4.repository.entity;

public class Kasiyer extends Kisi {

	public Kasiyer(String ad, String soyad) {
		super(ad, soyad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Kasiyer [getAd()=" + getAd() + ", getSoyad()=" + getSoyad() + ", getId()=" + getId() + "]";
	}

}
