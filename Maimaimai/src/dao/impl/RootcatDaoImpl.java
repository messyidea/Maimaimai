package dao.impl;

import java.util.List;

import model.Rootcat;

import dao.RootcatDao;

public class RootcatDaoImpl extends BaseDaoImpl implements RootcatDao{

	@Override
	public void savecatDao(Rootcat rootcat) {
		// TODO Auto-generated method stub
		super.insert(rootcat);
	}

	@Override
	public List<Rootcat> getAll(Class clazz) {
		// TODO Auto-generated method stub
		return super.getObjects(Rootcat.class);
	}

	@Override
	public Rootcat getcatdaoById(String id) {
		// TODO Auto-generated method stub
		Rootcat cat = (Rootcat)super.getObject(Rootcat.class, id);
		return cat;
	}

	
}
