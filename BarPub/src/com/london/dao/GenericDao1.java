package com.london.dao;

import java.util.List;

public interface GenericDao1<T> {

	public List<T> list();
	public <E> T find(E id);
	public void insert(T o);
	public void update(T o);
	public void delete(T o);
}
