package com.jdc.grace;

public class Data<T> {

	private T value;
	// object a nay nk pyoun htar lik loh integer yaw string yaw a chaar hr yae lik khan ya ta
	//object ka wapper class yae super
	// soe kyo ka thu ka object type pl moh +/ - function ma ya vu 
	// ya chin yin casting lok 

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	//generic type V in method
	static <V> void doSomething(V v) {
		System.out.println(v);
	}
	
}