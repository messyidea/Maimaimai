package dao;

import java.util.List;

import model.Item;

public interface ItemDao {
	public void saveItem(Item item);
	
	public List<Item> getAllItem(Class clazz);
	
	public List<Item> findByName(String name);
	
	public List<Item> findByCat(String name);
	
	public void deleteItemByName(String name);
	
	public void update(Item item);
	
	public Item getItemByName(String name);
}
