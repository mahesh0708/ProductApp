package productapp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import productapp.entity.Product;

public class ProductMapperImpl implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setId(rs.getInt("id"));
		product.setProductname(rs.getString("productname"));
		product.setDescription(rs.getString("description"));
		product.setPrice(rs.getLong("price"));
		product.setQuantity(rs.getInt("quantity"));
		return product;
	}

}
