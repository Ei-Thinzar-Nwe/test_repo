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
	static String[] array = { "Andrew","John", "William","Henery","Kelvin" };

	public List<String> useList(String str) {
		return switch (str) {
		case "A" -> {
			ArrayList<String> list = new ArrayList<>();
			list.addAll(List.of(array));
			yield list;
		}
		case "L" -> {
			LinkedList<String> list = new LinkedList<>();
			list.addAll(List.of(array));
			yield list;
		}
		default -> null;
		};
	}

	public Set<String> useSet(String s) {
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
			case "T" -> {
				TreeSet<String> set = new TreeSet<>();
				set.addAll(Set.of(array));
				yield set;
			}
			
			default -> null;
		};
	}

	public Queue<String> useQueue() {
		return null;
	}

	public Deque<String> useDeque() {
		return null;
	}

	public Map<Integer, String> useMap() {
		return null;
	}
}
	/*
	 * just test
	 * 
	 * public Collection <String> getCollection(){
		Collection <String> col1 = new ArrayList<String>();
	
		//col1. loh yite lik tr nk lok loh ya tl method tway paw lt mal
		
		List <String>col2 = new ArrayList<String>();
		String name =col2.get(3);
		
		Set <String> col3 = new HashSet<String>();
		col3.g
		retrun null;
		
	}
	
	*/
	