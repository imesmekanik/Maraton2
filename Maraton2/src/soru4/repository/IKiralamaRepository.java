package soru4.repository;

public interface IKiralamaRepository {

	public void save(Object o);

	public void musteriListele();

	public Object musteriAra(String id);

	public Object kitapAra(String id);

	public void kiralamaYap(String kasiyerId, String musteriId, String kitapId);

}
