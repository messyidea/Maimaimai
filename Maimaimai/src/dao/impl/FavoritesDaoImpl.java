package dao.impl;

import java.util.List;

import model.Favorites;
import dao.FavoritesDao;

public class FavoritesDaoImpl extends BaseDaoImpl implements FavoritesDao {

	@Override
	public void saveFavorites(Favorites fav) {
		// TODO Auto-generated method stub
		super.insert(fav);
	}

	@Override
	public List<Favorites> getAllFavorites(Class clazz) {
		// TODO Auto-generated method stub
		return super.getObjects(Favorites.class);
	}

	@Override
	public List<Favorites> findByName(String name) {
		// TODO Auto-generated method stub
		List<Favorites> list = super.search("from Favorites where username = '"+name+"'");
		return list;
	}

	@Override
	public void deleteFavoritesById(Integer id) {
		// TODO Auto-generated method stub
		super.delete(Favorites.class, id);
	}

	@Override
	public void update(Favorites fav) {
		// TODO Auto-generated method stub
		super.renew(fav);
	}

	@Override
	public Favorites getShopcarById(String id) {
		// TODO Auto-generated method stub
		Favorites fav = (Favorites)super.getObject(Favorites.class, id);
		return fav;
	}

	@Override
	public Favorites getShopcarBy2(String username, String itemid) {
		// TODO Auto-generated method stub
		List<Favorites> list = super.search("from Favorites where username = '"+username+"' and itemid = " + itemid);
		if(list.size() == 0) return null;
		return list.get(0);
	}

}
