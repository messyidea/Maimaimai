package dao;

import java.util.List;

import model.Iorder;


public interface OrderDao {
	public void saveItem(Iorder order);
	
	public List<Iorder> getAllOrder(Class clazz);
	
	public List<Iorder> findByName(String name);
	
	
	public void deleteOrderByName(String name);
	
	public void update(Iorder order);
	
	public Iorder getOrderById(String id);
	
	public List<Iorder> getOrderByShopname(String name);
	
	public List<Iorder> getOrderByItemid(String id);
}
