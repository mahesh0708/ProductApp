package productapp.service;

import java.util.List;

import productapp.entity.Product;

public interface ProductService {
	public int insert(Product product);

	public int update(Product product);

	public int delete(int id);

	public List<Product> select();

	public Product singleselect(int id);

}
