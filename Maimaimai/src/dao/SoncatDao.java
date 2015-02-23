package dao;

import java.util.List;

import model.Soncat;

public interface SoncatDao {
	public void savecatDao(Soncat rootcat);
	
	public List<Soncat> getAll(Class clazz);
	
	public Soncat getcatdaoById(String id);
	
	public List<Soncat> getlistById(String id);
}
