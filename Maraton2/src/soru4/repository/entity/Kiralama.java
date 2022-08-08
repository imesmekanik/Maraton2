package soru4.repository.entity;

import java.util.UUID;

public class Kiralama {

	private final String id;
	private String kasiyerId;
	private String musteriId;
	private String kitapId;

	public Kiralama(String kasiyerId, String musteriId, String kitapId) {
		this.id = UUID.randomUUID().toString();
		this.kasiyerId = kasiyerId;
		this.musteriId = musteriId;
		this.kitapId = kitapId;
	}

	public String getKasiyerId() {
		return kasiyerId;
	}

	public void setKasiyerId(String kasiyerId) {
		this.kasiyerId = kasiyerId;
	}

	public String getMusteriId() {
		return musteriId;
	}

	public void setMusteriId(String musteriId) {
		this.musteriId = musteriId;
	}

	public String getKitapId() {
		return kitapId;
	}

	public void setKitapId(String kitapId) {
		this.kitapId = kitapId;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Kiralama [id=" + id + ", kasiyerId=" + kasiyerId + ", musteriId=" + musteriId + ", kitapId=" + kitapId
				+ "]";
	}

}