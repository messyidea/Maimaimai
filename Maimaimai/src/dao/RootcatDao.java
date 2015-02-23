package dao;

import java.util.List;

import model.Rootcat;

public interface RootcatDao {
	public void savecatDao(Rootcat rootcat);
	
	public List<Rootcat> getAll(Class clazz);
	
	public Rootcat getcatdaoById(String id);
	
	
}
