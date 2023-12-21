@Entity
public class User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	public String getUserName() {
		return name;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public void setUserName(String name) {
		this.name = name;
	}
	
	public User() {
		super();
	}
	
	public User(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}