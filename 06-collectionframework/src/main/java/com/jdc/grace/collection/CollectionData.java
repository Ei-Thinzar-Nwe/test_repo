package com.jdc.grace.collection;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class CollectionData {
	
	static String [] array = {"Andrew", "John" , "Willian" , "Henery" , "Kelvin"};
	

	public List<String> useList(String str){		
		return switch(str) {
		case "A" -> {
			 ArrayList<String>list= new ArrayList<>();
			 list.addAll(List.of(array));
			 yield list;
		}
		case "L" -> new LinkedList<>();
		default -> null;
		};
	}
	
	public Set<String>UseSet(String s){
		return switch (s) {
		case "H" -> {
			HashSet<String> set = new HashSet<>();
			set.addAll(Set.of(array));
			yield set;
		}
		case "L" -> {
			LinkedHashSet<String> set = new LinkedHashSet<>();
			set.addAll(Set.of(array));
			yield set;
		}
		case"T" -> {
			TreeSet<String> set = new TreeSet<>();
			set.addAll(Set.of(array));
			yield set;
		}
		default -> null;
		};
	}
	
	public Queue<String>UseQueue(){
		return null;
	}
	
	public Deque<String>UseDeque(){
		return null;
	}
	
	public Map<Integer,String>useMap(){
		return null;
	}
}
