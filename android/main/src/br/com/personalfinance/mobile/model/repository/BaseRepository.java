package br.com.personalfinance.mobile.model.repository;

import java.util.List;

public interface BaseRepository<T> {

	void add(T entity);
	void remove(T entity);
	void refresh(T entity);
	T get(Object pk);
	List<T> list();
	
}