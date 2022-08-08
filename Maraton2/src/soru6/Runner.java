package soru6;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Runner {
	static String fileName = "hata.log";
	static String mesaj = null;

	public static void main(String[] args) {

		try {
			int i = 0;
			int t = 0;
			int sonuc = t / i;
		} catch (Exception ex) {
			try {
				FileOutputStream fl = new FileOutputStream(fileName);
				ObjectOutputStream oj = new ObjectOutputStream(fl);
				oj.writeObject(new Log(ex.toString(), System.currentTimeMillis(), "RunnerIO", "main"));
				oj.close();

			} catch (Exception e) {
				System.out.println("Beklenmeyen sorun.");
			}
		}

	}

}