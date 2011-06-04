package br.com.personalfinance.mobile.app.formatter;

public interface Formatter<T> {

	T parse(String s);
	String format(T t);
	
}