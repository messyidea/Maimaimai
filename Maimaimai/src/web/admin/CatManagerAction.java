package web.admin;

import java.util.ArrayList;
import java.util.List;

import model.Rootcat;
import model.Soncat;

import com.opensymphony.xwork2.ActionSupport;

import dao.RootcatDao;
import dao.SoncatDao;
import dao.impl.RootcatDaoImpl;
import dao.impl.SoncatDaoImpl;

public class CatManagerAction extends ActionSupport{
	RootcatDao rootcatdao = new RootcatDaoImpl();
	SoncatDao soncatdao = new SoncatDaoImpl();
	
	private String id;
	private String name;
	private Rootcat rootcat;
	private Soncat soncat;
	
	List<Rootcat> rootcatlist = null;
	List<List<Soncat> > soncatlist = null;
	
	public String list(){
		rootcatlist = rootcatdao.getAll(Rootcat.class);
		soncatlist = new ArrayList<List<Soncat> >();
		for(Rootcat r:rootcatlist) {
			String id = Integer.toString(r.getId());
			System.out.println(id);
			System.out.println(r.getName());
			//List<Soncat> sc = soncatdao.getlistById(id);
			List<Soncat> sc = soncatdao.getAll(Soncat.class);
			System.out.println(sc.size());
			soncatlist.add(sc);
		}
		/*for(List<Soncat> r:soncatlist) {
			for(Soncat rs:r) {
				System.out.println(rs.getName());
				System.out.println(rs.getId());
				System.out.println(rs.getFa());
			}
		}*/
		System.out.println("hehehe");
		return "list";
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	
	
}
