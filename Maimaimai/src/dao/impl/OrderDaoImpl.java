package dao.impl;

import java.util.List;

import model.Iorder;
import model.Shopcar;
import dao.OrderDao;

public class OrderDaoImpl extends BaseDaoImpl implements OrderDao {

	@Override
	public void saveItem(Iorder order) {
		// TODO Auto-generated method stub
		super.insert(order);
	}

	@Override
	public List<Iorder> getAllOrder(Class clazz) {
		// TODO Auto-generated method stub
		return super.getObjects(Iorder.class);
	}

	@Override
	public List<Iorder> findByName(String name) {
		// TODO Auto-generated method stub
		List<Iorder> list = super.search("from Iorder where username = '"+name+"'");
		return list;
	}
	
	

	@Override
	public List<Iorder> getOrderByShopname(String name) {
		// TODO Auto-generated method stub
		List<Iorder> list = super.search("from Iorder where shopname = '"+name+"'");
		return list;
	}

	@Override
	public void deleteOrderByName(String name) {
		// TODO Auto-generated method stub
		super.delete(Iorder.class, name);
	}

	@Override
	public void update(Iorder order) {
		// TODO Auto-generated method stub
		super.renew(order);
	}

	@Override
	public Iorder getOrderById(String id) {
		// TODO Auto-generated method stub
		List<Iorder> list = super.search("from Iorder where id = '"+id+"'");
		return list.get(0);
	}

	@Override
	public List<Iorder> getOrderByItemid(String id) {
		// TODO Auto-generated method stub
		List<Iorder> list = super.search("from Iorder where itemid = "+id+"");
		return list;
	}


	
	

}
