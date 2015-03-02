package web.admin;

import java.util.ArrayList;
import java.util.List;

import model.Item;
import model.Rootcat;
import model.Soncat;

import com.opensymphony.xwork2.ActionSupport;

import dao.ItemDao;
import dao.RootcatDao;
import dao.SoncatDao;
import dao.impl.ItemDaoImpl;
import dao.impl.RootcatDaoImpl;
import dao.impl.SoncatDaoImpl;

public class IndexManagerAction extends ActionSupport{
	RootcatDao rootcatdao = new RootcatDaoImpl();
	SoncatDao soncatdao = new SoncatDaoImpl();
	ItemDao itemdao = new ItemDaoImpl();
	
	List<Item> itemlist = null;
	List<Rootcat> rootcatlist = null;
	List<List<Soncat> > soncatlist = null;
	
	private Rootcat rootcat;
	private Soncat soncat;
	
	private String id;
	
	
	public String list() {
		rootcatlist = rootcatdao.getAll(Rootcat.class);
		soncatlist = new ArrayList<List<Soncat> >();
		List<Soncat> sc = new ArrayList<Soncat>();
		for(Rootcat r:rootcatlist) {
			String id = Integer.toString(r.getId());
			sc = new ArrayList<Soncat>();
			//sc.clear();
			//System.out.println(id);
			//System.out.println(r.getName());
			//List<Soncat> sc = soncatdao.getlistById(id);
			sc = soncatdao.getlistById(id);
			//System.out.println("size == " + sc.size());
			//sc = soncatdao.getAll(Soncat.class);
			soncatlist.add(sc);
		}
		//System.out.println("xixixi");
		/*System.out.println(soncatlist.size());
		for(List<Soncat> r:soncatlist) {
			System.out.println("size = " + r.size());
			for(Soncat rs:r) {
				System.out.println(rs.getName());
				System.out.println(rs.getId());
				System.out.println(rs.getFa());
			}
		}*/
		List<Item> tp = itemdao.getAllItem(Item.class);
		itemlist = new ArrayList<Item>();
		for(Item it : tp) {
			if(it.getNum() != 0) {
				itemlist.add(it);
			}
		}
		//itemlist = itemdao.getAllItem(Item.class);
		return "list";
	}
	public String show() {
		rootcatlist = rootcatdao.getAll(Rootcat.class);
		soncatlist = new ArrayList<List<Soncat> >();
		List<Soncat> sc = new ArrayList<Soncat>();
		for(Rootcat r:rootcatlist) {
			String id = Integer.toString(r.getId());
			sc = new ArrayList<Soncat>();
			sc = soncatdao.getlistById(id);
			soncatlist.add(sc);
		}
		System.out.println(id);
		itemlist = itemdao.findByCat(id);
		System.out.println("size == "+itemlist.size());
		return "show";
	}
	
	
	public RootcatDao getRootcatdao() {
		return rootcatdao;
	}
	public void setRootcatdao(RootcatDao rootcatdao) {
		this.rootcatdao = rootcatdao;
	}
	public SoncatDao getSoncatdao() {
		return soncatdao;
	}
	public void setSoncatdao(SoncatDao soncatdao) {
		this.soncatdao = soncatdao;
	}
	public List<Rootcat> getRootcatlist() {
		return rootcatlist;
	}
	public void setRootcatlist(List<Rootcat> rootcatlist) {
		this.rootcatlist = rootcatlist;
	}
	public List<List<Soncat>> getSoncatlist() {
		return soncatlist;
	}
	public void setSoncatlist(List<List<Soncat>> soncatlist) {
		this.soncatlist = soncatlist;
	}
	public Rootcat getRootcat() {
		return rootcat;
	}
	public void setRootcat(Rootcat rootcat) {
		this.rootcat = rootcat;
	}
	public Soncat getSoncat() {
		return soncat;
	}
	public void setSoncat(Soncat soncat) {
		this.soncat = soncat;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ItemDao getItemdao() {
		return itemdao;
	}
	public void setItemdao(ItemDao itemdao) {
		this.itemdao = itemdao;
	}
	public List<Item> getItemlist() {
		return itemlist;
	}
	public void setItemlist(List<Item> itemlist) {
		this.itemlist = itemlist;
	}
	
	
}
