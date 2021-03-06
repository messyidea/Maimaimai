package dao.impl;

import java.util.List;

import model.Item;
import model.Shopcar;
import dao.ShopcarDao;

public class ShopcarDaoImpl extends BaseDaoImpl implements ShopcarDao {

	@Override
	public void saveShopcar(Shopcar shopcar) {
		// TODO Auto-generated method stub
		super.insert(shopcar);
	}

	@Override
	public List<Shopcar> getAllShopcar(Class clazz) {
		// TODO Auto-generated method stub
		return super.getObjects(Shopcar.class);
	}

	@Override
	public List<Shopcar> findByName(String name) {
		// TODO Auto-generated method stub
		List<Shopcar> list = super.search("from Shopcar where username = '"+name+"'");
		return list;
	}

	@Override
	public void deleteShopcarById(Integer id) {
		// TODO Auto-generated method stub
		super.delete(Shopcar.class, id);
	}

	@Override
	public void update(Shopcar shopcar) {
		// TODO Auto-generated method stub
		super.renew(shopcar);
	}

	@Override
	public Shopcar getShopcarById(String id) {
		// TODO Auto-generated method stub
		Shopcar shopcar = (Shopcar)super.getObject(Shopcar.class, id);
		return shopcar;
	}

	@Override
	public Shopcar getShopcarBy2(String username, String itemid) {
		// TODO Auto-generated method stub
		List<Shopcar> list = super.search("from Shopcar where username = '"+username+"' and itemid = " + itemid);
		if(list.size() == 0) return null;
		return list.get(0);
	}

	

}
