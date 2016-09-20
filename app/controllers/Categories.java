package controllers;

import java.util.HashSet;
import java.util.Set;

import models.Category;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class Categories extends Controller {	
	public Result list(){
		HashSet<Category> categories = Category.findAll();
		return ok(list.render(categories));
	}
	
	public Result showBlank(){
		return TODO;
	}
	
	 public Result show(Long ean) {
		 return TODO;
	 }
	 
	 public Result save() {
		 return TODO;
	 }
}
