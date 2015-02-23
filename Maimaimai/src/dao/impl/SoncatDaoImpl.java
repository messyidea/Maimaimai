package dao.impl;

import java.util.List;

import model.Rootcat;
import model.Soncat;
import dao.SoncatDao;

public class SoncatDaoImpl extends BaseDaoImpl implements SoncatDao{

	@Override
	public void savecatDao(Soncat rootcat) {
		// TODO Auto-generated method stub
		super.insert(rootcat);
	}

	@Override
	public List<Soncat> getAll(Class clazz) {
		// TODO Auto-generated method stub
		return super.getObjects(Soncat.class);
	}
	
	

	@Override
	public List<Soncat> getlistById(String id) {
		// TODO Auto-generated method stub
		return super.search("from soncat where fa=" + id);
	}

	@Override
	public Soncat getcatdaoById(String id) {
		// TODO Auto-generated method stub
		Soncat cat = (Soncat)super.getObject(Rootcat.class, id);
		return cat;
	}
	
}
