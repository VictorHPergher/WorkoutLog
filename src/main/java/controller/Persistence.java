package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Persistence {

	public static <E> void save(E object, String path) throws IOException {
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(object);
		fos.close();
	}

	public static <E> E read(String path) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		@SuppressWarnings("unchecked")
		E objeto = (E) ois.readObject();
		ois.close();
		fis.close();
		return objeto;
	}

	public static <E> void trySave(Object E, String path) {
		try {
			save(E, path);
			System.out.println("Saved " + path);
		} catch (IOException e) {
			System.out.println("Not saved" + path);
			e.printStackTrace();
		}
	}

}
