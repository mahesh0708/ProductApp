package productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import productapp.dao.ProductDaoImpl;
import productapp.entity.Product;

public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDaoImpl productDaoImpl;

	public ProductDaoImpl getProductDaoImpl() {
		return productDaoImpl;
	}

	public void setProductDaoImpl(ProductDaoImpl productDaoImpl) {
		this.productDaoImpl = productDaoImpl;
	}

	@Override
	public int insert(Product product) {

		return this.productDaoImpl.insert(product);
	}

	@Override
	public int update(Product product) {

		return this.productDaoImpl.update(product);
	}

	@Override
	public List<Product> select() {
		return this.productDaoImpl.select();
	}

	@Override
	public int delete(int id) {
		return this.productDaoImpl.delete(id);

	}

	@Override
	public Product singleselect(int id) {

		return this.productDaoImpl.singleselect(id);
	}

}
