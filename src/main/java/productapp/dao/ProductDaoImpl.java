package productapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import productapp.entity.Product;
import productapp.mapper.ProductMapperImpl;

public class ProductDaoImpl implements ProductDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Product product) {
		String query = "Insert into ProductDetails(id,productname,description,price,quantity) values (?,?,?,?,?)";
		int insertrecord = this.jdbcTemplate.update(query, product.getId(), product.getProductname(),
				product.getDescription(), product.getPrice(),product.getQuantity());
		System.out.println("Productdetails insert " + insertrecord);
		return insertrecord;
	}

	@Override
	public int update(Product product) {
		String update = "Update ProductDetails set id=?,productname=?,description=?,price=?,quantity=? where id=?";
		int updaterecord = this.jdbcTemplate.update(update, product.getId(), product.getProductname(),
				product.getDescription(), product.getPrice(),product.getQuantity(), product.getId());
		System.out.println("Productdetails update " + updaterecord);
		return updaterecord;
	}

	@Override
	public int delete(int id) {
		String delete = "Delete from ProductDetails where id=?";
		int deleterecord = this.jdbcTemplate.update(delete, id);
		System.out.println("Productdetails deleted " + deleterecord);
		return deleterecord;
	}

	@Override
	public List<Product> select() {
		String select = "Select * from ProductDetails";
		RowMapper<Product> productmapp = new ProductMapperImpl();
		List<Product> products = this.jdbcTemplate.query(select, productmapp);
		return products;

	}

	@Override
	public Product singleselect(int id) {
		String select = "Select * from ProductDetails where id=?";
		Product object = this.jdbcTemplate.queryForObject(select, new ProductMapperImpl(), id);
		return object;
	}

}
