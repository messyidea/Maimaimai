package dao.impl;

import java.util.List;

import model.Item;
import dao.ItemDao;


public class ItemDaoImpl  extends BaseDaoImpl implements ItemDao{

	@Override
	public void saveItem(Item item) {
		// TODO Auto-generated method stub
		super.insert(item);
	}

	@Override
	public List<Item> getAllItem(Class clazz) {
		// TODO Auto-generated method stub
		return super.getObjects(Item.class);
	}

	@Override
	public List<Item> findByName(String name) {
		// TODO Auto-generated method stub
		List<Item> list = super.search("from Item where shopname = '"+name+"'");
		return list;
	}

	@Override
	public void deleteItemByName(String name) {
		// TODO Auto-generated method stub
		super.delete(Item.class, name);
	}

	@Override
	public void update(Item item) {
		// TODO Auto-generated method stub
		super.renew(item);
	}

	@Override
	public Item getItemByName(String name) {
		// TODO Auto-generated method stub
		Item item = (Item)super.getObject(Item.class, name);
		return item;
	}

	@Override
	public List<Item> findByCat(String name) {
		// TODO Auto-generated method stub
		List<Item> list = super.search("from Item where itemcat = "+name+"");
		return list;
	}

	@Override
	public Item getItemById(String id) {
		// TODO Auto-generated method stub
		List<Item> list = super.search("from Item where id = "+id+"");
		return list.get(0);
	}

	@Override
	public List<Item> findByNamelike(String name) {
		// TODO Auto-generated method stub
		List<Item> list = super.search("from Item where itemname like '%"+name+"%'");
		return list;
	}
	
	

}
