package dao;

import java.util.List;

import model.Order;


public interface OrderDao {
	public void saveItem(Order order);
	
	public List<Order> getAllOrder(Class clazz);
	
	public List<Order> findByName(String name);
	
	public void deleteOrderByName(String name);
	
	public void update(Order order);
	
	public Order getOrderById(String id);
	
	public List<Order> getOrderByShopname(String name);
}
