package web.admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import model.Rootcat;
import model.Soncat;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.RootcatDao;
import dao.SoncatDao;
import dao.impl.RootcatDaoImpl;
import dao.impl.SoncatDaoImpl;

public class CatManagerAction extends ActionSupport{
	RootcatDao rootcatdao = new RootcatDaoImpl();
	SoncatDao soncatdao = new SoncatDaoImpl();
	
	private Integer id;
	private String name;
	private Rootcat rootcat;
	private Soncat soncat;
	private String idd;
	
	List<Rootcat> rootcatlist = null;
	List<List<Soncat> > soncatlist = null;
	
	public String list(){
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
		System.out.println("xixixi");
		System.out.println(soncatlist.size());
		for(List<Soncat> r:soncatlist) {
			System.out.println("size = " + r.size());
			for(Soncat rs:r) {
				System.out.println(rs.getName());
				System.out.println(rs.getId());
				System.out.println(rs.getFa());
			}
		}
		return "list";
	}
	
	public String addson() {
		HttpServletRequest request = ServletActionContext.getRequest();
		idd = request.getParameter("id");
		//System.out.println("XIXI " + idd);
		return "add";
	}
	
	public String addson2() {
		HttpServletRequest request = ServletActionContext.getRequest();
		//idd = request.getParameter("id");
		//System.out.println("idd == " + id);
		//System.out.println("name == " + name);
		Soncat sc = new Soncat();
		sc.setFa(id);
		sc.setName(name);
		soncatdao.savecatDao(sc);
		//System.out.println("XIXI " + idd);
		return "add";
	}
	
	public String addroot() {
		Rootcat rc = new Rootcat();
		rc.setName(name);
		rootcatdao.savecatDao(rc);
		return "add";
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
