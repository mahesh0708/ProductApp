package productapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productapp.entity.Product;
import productapp.service.ProductServiceImpl;

@Controller
public class MainController {
	@Autowired
	ProductServiceImpl productServiceImpl;

	public ProductServiceImpl getProductServiceImpl() {
		return productServiceImpl;
	}

	public void setProductServiceImpl(ProductServiceImpl productServiceImpl) {
		this.productServiceImpl = productServiceImpl;
	}

	@RequestMapping("/")
	public String home(Model model) {
		List<Product> products = this.productServiceImpl.select();
		model.addAttribute("products", products);
		return "home";
	}

	@RequestMapping("/addproduct")
	public String addProduct() {
		return "addProduct";
	}

	@RequestMapping(path = "/insert", method = RequestMethod.POST)
	public RedirectView insert(@ModelAttribute Product product, HttpServletRequest request) {
		this.productServiceImpl.insert(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	@RequestMapping("/update/{id}")
	public String updateproduct(@PathVariable("id") int id, Model model) {
		Product product2 = this.productServiceImpl.singleselect(id);
		model.addAttribute("product2", product2);
		return "updateproduct";
	}

	@RequestMapping(path = "/update", method = RequestMethod.POST)
	public RedirectView update(@ModelAttribute Product product, HttpServletRequest request) {
		this.productServiceImpl.update(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	@RequestMapping("/delete/{id}")
	public RedirectView delete(@PathVariable("id") int id, HttpServletRequest request) {
		this.productServiceImpl.delete(id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

}
