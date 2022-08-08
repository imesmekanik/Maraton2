package soru4.repository.entity;

import java.util.UUID;

public abstract class Kisi {
	private final String id;
	private String ad;
	private String soyad;

	public Kisi(String ad, String soyad) {
		this.id = UUID.randomUUID().toString();
		this.ad = ad;
		this.soyad = soyad;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getId() {
		return id;
	}

}
