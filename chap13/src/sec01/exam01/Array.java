package sec01.exam01;

import java.util.*;

public class Array {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JBDC");
		list.add("Servelt/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("�� ��ü��: " + size);
		System.out.println();   
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i=0;, i<list.size(); i++) {
			String string = list.get(i);
			System.out.println(+ ":" + str);
			}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i=0; i<list.size(); i++) {
			String string = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}