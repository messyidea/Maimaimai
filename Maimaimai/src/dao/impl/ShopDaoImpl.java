package dao.impl;

import java.util.List;

import model.Shop;
import dao.ShopDao;

public class ShopDaoImpl extends BaseDaoImpl implements ShopDao {

	@Override
	public void saveShop(Shop shop) {
		// TODO Auto-generated method stub
		super.insert(shop);
	}

	@Override
	public List<Shop> getAllShop(Class clazz) {
		// TODO Auto-generated method stub
		return super.getObjects(Shop.class);
	}

	@Override
	public List<Shop> findByName(String name) {
		// TODO Auto-generated method stub
		List<Shop> list = super.search("from Shop where shopname like '%"+name+"%'");
		return list;
	}

	@Override
	public void deleteShopByName(String name) {
		// TODO Auto-generated method stub
		super.delete(Shop.class, name);
	}

	@Override
	public void update(Shop shop) {
		// TODO Auto-generated method stub
		super.renew(shop);
	}

	@Override
	public Shop getShopByName(String name) {
		// TODO Auto-generated method stub
		Shop shop = (Shop)super.getObject(Shop.class, name);
		return shop;
	}

	@Override
	public Shop getShopByUsername(String name) {
		// TODO Auto-generated method stub
		List<Shop> list = super.search("from Shop where username = '"+name+"'");
		if(list.size() == 0) return null; 
		return list.get(0);
	}

	
}
