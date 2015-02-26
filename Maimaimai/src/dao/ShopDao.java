package dao;

import java.util.List;

import model.Shop;

public interface ShopDao {

	public void saveShop(Shop shop);
	
	public List<Shop> getAllShop(Class clazz);
	
	public List<Shop> findByName(String name);
	
	public void deleteShopByName(String name);
	
	public void update(Shop shop);
	
	public Shop getShopByName(String name);
	
	public Shop getShopByUsername(String name);
}
