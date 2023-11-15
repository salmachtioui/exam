package chtioui.salma.dao;

import java.util.List;

import chtioui.salma.entities.XXX;

public interface IDao <T> {
	
	T create (T o);
	boolean delete (T o);
	T update (T o);
	T findById(int id);
	List<T> findAll();
	

}
