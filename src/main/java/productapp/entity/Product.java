package productapp.entity;

public class Product {

	private int id;
	private String productname;
	private String description;
	private int quantity;
	private long price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productname=" + productname + ", description=" + description + ", quantity="
				+ quantity + ", price=" + price + "]";
	}

	public Product(int id, String productname, String description, int quantity, long price) {
		super();
		this.id = id;
		this.productname = productname;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public Product() {
		super();

	}

}
