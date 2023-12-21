@Entity
public class Restaurant{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String restaurantName;
	
	public String getName() {
		return restaurantName;
	}
	
	public void setName(String name) {
		this.restaurantName = name;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Restaurant() {
		super();
	}
	
	public Restaurant(Long id, String name) {
		super();
		this.id = id;
		this.restaurantName = name;
	}
}