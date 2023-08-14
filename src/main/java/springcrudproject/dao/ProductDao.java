package springcrudproject.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import springcrudproject.model.Product;

@Component
public class ProductDao {
	
	

	@Autowired
	public HibernateTemplate hibernatetemplate;
	
	//create
	@Transactional
	public void createproduct(Product product) {
		this.hibernatetemplate.saveOrUpdate(product);
	}
	
	//get all products
	
	public List<Product> displayallproducts(){
		
	List<Product> products = this.hibernatetemplate.loadAll(Product.class);
	
	return products;
	}
	
  //delete product
	@Transactional
	public void deleteproduct(int pid) {
		
	Product p = this.hibernatetemplate.load(Product.class, pid);
	this.hibernatetemplate.delete(p);
		
	}
	
	//get single product
	
	public Product displaysingleproduct(int pid) {
		
		
		
		Product p = this.hibernatetemplate.get(Product.class, pid);
		
		return p;
		
	}
	
}
