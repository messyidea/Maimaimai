package dao;

import java.util.List;

import model.Shopcar;

public interface ShopcarDao {
	public void saveShopcar(Shopcar shopcar);
	
	public List<Shopcar> getAllShopcar(Class clazz);
	
	public List<Shopcar> findByName(String name);
	
	public void deleteShopcarById(Integer id);
	
	public void update(Shopcar shopcar);
	
	public Shopcar getShopcarById(String id);
	
	public Shopcar getShopcarBy2(String username,String itemid);
	
}
