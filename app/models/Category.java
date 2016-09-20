package models;

import scala.collection.immutable.HashSet;

public class Category {
	
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
	
}
