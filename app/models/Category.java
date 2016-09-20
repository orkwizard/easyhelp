package models;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Category {
	
	private static Set<Category> categories;
	static{
		categories = new HashSet<Category>();
		categories.add(new Category(new Long(111),"Mantenimiento","Matenimiento en General"));
		categories.add(new Category(new Long(112),"Servicios","Servicios en General"));
		categories.add(new Category(new Long(113),"Limpieza","Limpieza en General"));
	}
	
	public Long id;
	public String name;
	public String description;
	
	public Category(){}
	
	public Category(Long id,String name,String description){
		this.id = id;
		this.name = name;
		this.description = description;
	}

	
	public String toString() {
		return String.format("%s - $s",id,name);
	}
	
	
	 public static HashSet<Category> findAll(){
		 return new HashSet<Category>(categories);
	 }
	 
	 public Category findById(Long id){
		 Iterator<Category> iterator = categories.iterator();
		 while(iterator.hasNext())
		 {
			 Category cat = iterator.next();
			 if(cat.id.equals(id))
				 return cat;
		 }
		 return null;
	 }
	
	 public boolean remove(Category category){
		 return categories.remove(category);
	 }
	 
	 public void add(Category cat){
		 categories.add(cat);
	 }
	 
}
