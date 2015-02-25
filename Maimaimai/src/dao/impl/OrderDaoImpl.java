package dao.impl;

import java.util.List;

import model.Order;
import model.Shopcar;
import dao.OrderDao;

public class OrderDaoImpl extends BaseDaoImpl implements OrderDao {

	@Override
	public void saveItem(Order order) {
		// TODO Auto-generated method stub
		super.insert(order);
	}

	@Override
	public List<Order> getAllOrder(Class clazz) {
		// TODO Auto-generated method stub
		return super.getObjects(Order.class);
	}

	@Override
	public List<Order> findByName(String name) {
		// TODO Auto-generated method stub
		List<Order> list = super.search("from Order where username = '"+name+"'");
		return list;
	}
	
	

	@Override
	public List<Order> getOrderByShopname(String name) {
		// TODO Auto-generated method stub
		List<Order> list = super.search("from Order where shopname = '"+name+"'");
		return list;
	}

	@Override
	public void deleteOrderByName(String name) {
		// TODO Auto-generated method stub
		super.delete(Order.class, name);
	}

	@Override
	public void update(Order order) {
		// TODO Auto-generated method stub
		super.renew(order);
	}

	@Override
	public Order getOrderById(String id) {
		// TODO Auto-generated method stub
		Order order = (Order)super.getObject(Order.class, id);
		return order;
	}

}
