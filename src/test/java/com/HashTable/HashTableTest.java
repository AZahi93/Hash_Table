package com.HashTable;

public class HashTableTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Paranoids are not paranoid because " + "they are paranoid but because they keep "
				+ "putting themselves deliberately into paranoid " + "avoidable situations";

		HashTable hash = new HashTable();
		hash.countWords(str);

	}

}
