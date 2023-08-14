package springcrudproject.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import springcrudproject.dao.ProductDao;
import springcrudproject.model.Product;
import java.util.List;

@Controller
public class MyController {

	@Autowired
	private ProductDao Productdao;

	@RequestMapping("/")
	public String home(Model m) {
		System.out.println("this is home page");

		List<Product> products = Productdao.displayallproducts();
		m.addAttribute("product", products);

		return "home";
	}

	@RequestMapping("/add-product")
	public String add_product(Model m) {

		m.addAttribute("title", "add Product");
		return "add_product";
	}

	//this is my controller

	@RequestMapping(value = "/add-product", method = RequestMethod.POST)
	public RedirectView showproduct(@ModelAttribute Product product, HttpServletRequest request) {
		System.out.println(product);
		Productdao.createproduct(product);
		RedirectView redirectview = new RedirectView();

		redirectview.setUrl(request.getContextPath() + "/");
		return redirectview;
	}

	@RequestMapping("/deleteproduct/{productId}")
	public RedirectView deleteproduct(@PathVariable("productId") int productid,HttpServletRequest request) {
        
		Productdao.deleteproduct(productid);
		RedirectView redirectview = new RedirectView();
        
		redirectview.setUrl(request.getContextPath() + "/");
		return redirectview;
	}
	
	@RequestMapping("updateproduct/{productId}")
	  public String updateproduct(@PathVariable("productId") int pid,Model m) {
		  Product product = this.Productdao.displaysingleproduct(pid);
		  m.addAttribute("product",product);
		  return "update_product";
	  }

}											
