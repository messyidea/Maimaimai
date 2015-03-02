package dao;

import java.util.List;

import model.Favorites;

public interface FavoritesDao {
	public void saveFavorites(Favorites fav);
	
	public List<Favorites> getAllFavorites(Class clazz);
	
	public List<Favorites> findByName(String name);
	
	public void deleteFavoritesById(Integer id);
	
	public void update(Favorites fav);
	
	public Favorites getShopcarById(String id);
	
	public Favorites getShopcarBy2(String username,String itemid);
}
