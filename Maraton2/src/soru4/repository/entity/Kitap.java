package soru4.repository.entity;

import java.util.UUID;

public class Kitap {
	private final String id;
	private String isim;
	private String yazar;
	private boolean kiralandiMi;

	public Kitap(String isim, String yazar) {
		super();
		this.id = UUID.randomUUID().toString();
		this.isim = isim;
		this.yazar = yazar;
		this.kiralandiMi = false;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	public boolean isKiralandiMi() {
		return kiralandiMi;
	}

	public void setKiralandiMi(boolean kiralandiMi) {
		this.kiralandiMi = kiralandiMi;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Kitap [id=" + id + ", isim=" + isim + ", yazar=" + yazar + "]";
	}

}
