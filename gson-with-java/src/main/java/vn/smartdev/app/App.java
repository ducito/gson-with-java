package vn.smartdev.app;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class App {
	public static void main(String[] args) {
		// ---- List String -----
		List<String> names = new ArrayList<String>();
		names.add("Duc");
		names.add("Quoc");
		names.add("Dat");
		String jsonNames = new Gson().toJson(names);
		System.out.println(jsonNames);

		// ---- List Objects -----
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Nguyen Ngoc Duc", "admin@gmail.com",0123456789f));
		persons.add(new Person("Nguyen Tan Dung", "dung@gmail.com", 014444489f));

		String jsonPersons = new Gson().toJson(persons);
		System.out.println(jsonPersons);
	}
}
