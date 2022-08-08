package soru4.utility;

import java.util.ArrayList;
import java.util.List;

import soru4.repository.entity.Kiralama;
import soru4.repository.entity.Kitap;
import soru4.repository.entity.Musteri;

public class Database {

	public static List<Musteri> musteriListesi = new ArrayList<Musteri>();
	public static List<Kitap> kitapListesi = new ArrayList<Kitap>();
	public static List<Kitap> kiralananKitapListesi = new ArrayList<Kitap>();
	public static List<Kiralama> kiralamaListesi = new ArrayList<Kiralama>();
}
