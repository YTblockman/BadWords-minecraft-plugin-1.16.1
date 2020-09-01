package warnplugin.b.listener;

import java.util.ArrayList;

public class ListOfBadWords {
	private static ArrayList<String> ar = new ArrayList<String>();
	
	public static ArrayList<String> BadWordsConfig() {
		ar.add("BADWORD");
		return ar;
	}
}
